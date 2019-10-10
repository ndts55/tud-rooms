package foss.ndts.tudrooms;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

import foss.ndts.tudrooms.data.BotanischerGarten;
import foss.ndts.tudrooms.data.Hochschulstadion;
import foss.ndts.tudrooms.data.Lichtwiese;
import foss.ndts.tudrooms.data.Stadtmitte;
import foss.ndts.tudrooms.data.UniLocation;
import foss.ndts.tudrooms.data.Windkanal;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "TUD_ROOMS";
    private static final String LocationKey = "SELECTED_LOCATION";
    private static final String BuildingKey = "SELECTED_BUILDING";

    private final UniLocation[] uniLocations = {
            new Stadtmitte(), new BotanischerGarten(), new Lichtwiese(), new Hochschulstadion(), new Windkanal()
    };

    private int selectedLocation = 0;
    private int selectedBuilding = 0;

    private TextView addressText;

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        selectedLocation = savedInstanceState.getInt(LocationKey, 0);
        selectedBuilding = savedInstanceState.getInt(BuildingKey, 0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initializeToolbar();

        initializeTextView();

        initializeSpinner();

        initializeFab();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(LocationKey, selectedLocation);
        outState.putInt(BuildingKey, selectedBuilding);
    }

    private String[] displayNames() {
        String[] ret = new String[uniLocations.length];
        for (int i = 0; i < uniLocations.length; i++) {
            ret[i] = uniLocations[i].displayName();
        }
        return ret;
    }

    private void initializeToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void initializeTextView() {
        addressText = findViewById(R.id.textview_main);
        addressText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE))
                        .setPrimaryClip(
                                ClipData.newPlainText(TAG, ((TextView) view).getText())
                        );
                Snackbar.make(view, getString(R.string.copied_snack), Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    private void initializeSpinner() {
        final AppCompatSpinner buildingSpinner = findViewById(R.id.spinner_buildings);
        final ArrayAdapter<String> buildingAdapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        new ArrayList<String>());

        buildingSpinner.setAdapter(buildingAdapter);

        buildingSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, String.format(Locale.ENGLISH, "Clicked Building %d", i));
                selectedBuilding = i;
                addressText.setText(uniLocations[selectedLocation].addresses()[selectedBuilding]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        buildingSpinner.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "long click");
                return false;
            }
        });

        AppCompatSpinner spinner = findViewById(R.id.spinner_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, displayNames());
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, String.format(Locale.ENGLISH, "Clicked Location %d", i));
                selectedLocation = i;
                buildingSpinner.setSelection(0);
                buildingAdapter.clear();
                buildingAdapter.notifyDataSetChanged();
                buildingAdapter.addAll(Arrays.asList(uniLocations[selectedLocation].buildings()));
                buildingAdapter.notifyDataSetChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void initializeFab() {
        FloatingActionButton fab = findViewById(R.id.fab_main);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedLocation >= 0 && selectedLocation < uniLocations.length && selectedBuilding >= 0 && selectedBuilding < uniLocations[selectedLocation].addresses().length) {
                    Uri mapUri = Uri.parse(String.format("geo:0,0?q=%s", uniLocations[selectedLocation].addresses()[selectedBuilding]));
                    Intent intent = new Intent(Intent.ACTION_VIEW, mapUri);
                    startActivity(intent);
                } else {
                    Log.e(TAG, "something wrong with selection");
                }
            }
        });
    }
}
