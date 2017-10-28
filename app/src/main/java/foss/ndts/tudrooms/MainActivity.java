package foss.ndts.tudrooms;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

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
    private final String TAG = "TUDROOMS";
    private final UniLocation[] uniLocations = {
            new Stadtmitte(), new BotanischerGarten(), new Lichtwiese(), new Hochschulstadion(), new Windkanal()
    };

    private int selectedLocation = 0;
    private int selectedBuilding = 0;

    private TextView addressText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        checkData();

        setContentView(R.layout.activity_main);

        initializeToolbar();

        initializeTextView();

        initializeSpinner();

        initializeFab();
    }


    private String[] displayNames() {
        String[] ret = new String[uniLocations.length];
        for (int i = 0; i < uniLocations.length; i++) {
            ret[i] = uniLocations[i].displayName();
        }
        return ret;
    }

    private void checkData() {
        for (UniLocation u : uniLocations) {
            if (!u.isOk()) {
                Log.e(TAG, u.arrayLengths());
            }
        }
    }

    // initialization methods
    private void initializeToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void initializeTextView() {
        addressText = (TextView) findViewById(R.id.textview_main);
        addressText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText(TAG, ((TextView) view).getText());
                clipboardManager.setPrimaryClip(clipData);
                Snackbar.make(view, getString(R.string.copied_snack), Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    private void initializeSpinner() {
        final Spinner bSpinner = (Spinner) findViewById(R.id.spinner_buildings);
        final ArrayAdapter<String> bAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, new ArrayList<String>());
        bSpinner.setAdapter(bAdapter);
        bSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selectedBuilding = i;
                addressText.setText(uniLocations[selectedLocation].addresses()[selectedBuilding]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                selectedBuilding = 0;
            }
        });

        Spinner spinner = (Spinner) findViewById(R.id.spinner_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, displayNames());
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, String.format(Locale.ENGLISH, "Clicked %d", i));
                selectedLocation = i;
                bSpinner.setSelection(0);
                bAdapter.clear();
                bAdapter.notifyDataSetChanged();
                bAdapter.addAll(Arrays.asList(uniLocations[selectedLocation].buildings()));
                bAdapter.notifyDataSetChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                selectedLocation = 0;
                bSpinner.setSelection(0);
            }
        });
    }

    private void initializeFab() {
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_main);
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
