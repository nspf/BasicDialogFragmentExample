package com.example.nico.dialogfragmentexample;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Instead of starting a new activity,
                // we load the DialogFragment after clicking on the button
                OptionsDialogFragment dialogFrag = new OptionsDialogFragment();
                FragmentManager fm = getFragmentManager();
                dialogFrag.show(fm, "Options");
            }
        });
    }
}
