package com.example.SevenWonders;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

public class SettingsFragmentDark extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_settings_dark, container, false);

        Button light = view.findViewById(R.id.lightModeButton);
        light.setOnClickListener(v -> {
            Intent light1 = new Intent(getActivity(), IntroActivity.class);
            startActivity(light1);
        });

        return view;

    }
}
