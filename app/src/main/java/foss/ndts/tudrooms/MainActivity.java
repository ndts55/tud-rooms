package foss.ndts.tudrooms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import foss.ndts.tudrooms.data.BotanischerGarten;
import foss.ndts.tudrooms.data.Hochschulstadion;
import foss.ndts.tudrooms.data.Lichtwiese;
import foss.ndts.tudrooms.data.Stadtmitte;
import foss.ndts.tudrooms.data.UniLocation;
import foss.ndts.tudrooms.data.Windkanal;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private final String TAG = "TUDROOMS";
    UniLocation[] uniLocations = {
            new Windkanal(), new Lichtwiese(), new Hochschulstadion(), new BotanischerGarten(), new Stadtmitte()
    };

    private static final String[] locations = {
            "Stadtmitte", "Botanischer Garten", "Lichtwiese", "Hochschulstadion", "Windkanal / Flugplatz"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        checkData();

        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayShowTitleEnabled(false);

        Spinner spinner = (Spinner) findViewById(R.id.spinner_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, locations);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);
    }

    private void checkData() {
        for (UniLocation u : uniLocations) {
            if (!u.isOk()) {
                Log.e(TAG, u.arrayLengths());
            }
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, String.valueOf(i), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
