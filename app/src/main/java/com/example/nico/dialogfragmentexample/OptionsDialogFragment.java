package com.example.nico.dialogfragmentexample;

import android.app.DialogFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;


public class OptionsDialogFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Here we inflate the layout to use with the options dialog
        View dialogView = inflater.inflate(R.layout.options_dialog, container, false);

        final Switch optionPlainColored = (Switch) dialogView.findViewById(R.id.switch1);

        optionPlainColored.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(optionPlainColored.isChecked()){
                    // we use getActivity() to refer to the views in the Activity layout.
                    getActivity().findViewById(R.id.button).setBackgroundColor(Color.BLUE);
                } else {
                    getActivity().findViewById(R.id.button).setBackgroundColor(Color.GREEN);
                }
            }
        });

        return dialogView;
    }

}
