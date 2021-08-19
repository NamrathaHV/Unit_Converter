package com.example.unit_converter.fragments;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unit_converter.LanguageActivity;
import com.example.unit_converter.R;
import com.example.unit_converter.adapters.MoreAdapter;
import com.example.unit_converter.dataProviders.MoreAboutDataProvider;
import com.example.unit_converter.dataProviders.MoreSupportDataProvider;
import com.example.unit_converter.models.DataItemMore;

import java.util.List;

public class MoreFragment extends Fragment {

    private View view;
    private Context context;

    private final List<DataItemMore> dataItemMoreSupportList = MoreSupportDataProvider.dataItemMoreList;
    private final List<DataItemMore> dataItemMoreAboutList = MoreAboutDataProvider.dataItemMoreList;

    /*private SharedPreferences sharedPreferences= context.getSharedPreferences("com.example.unit_converter.MoreFragment",Context.MODE_PRIVATE);

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boolean switchState=sharedPreferences.getBoolean("service_status",false);
        if(switchState){
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_YES);
        }
        else {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_NO);
        }
    }*/

   @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_more, container, false);
        context = view.getContext();
        moreRecyclerViews();
        languageOnClick();
        nightSwitchOnChecked();
        return view;
    }

    private void moreRecyclerViews() {
        MoreAdapter supportAdapter = new MoreAdapter(context, dataItemMoreSupportList);
        MoreAdapter aboutAdapter = new MoreAdapter(context, dataItemMoreAboutList);

        RecyclerView supportRV = view.findViewById(R.id.rv_more_support);
        RecyclerView aboutRV = view.findViewById(R.id.rv_more_about);

        supportRV.setAdapter(supportAdapter);
        aboutRV.setAdapter(aboutAdapter);
    }

    private void languageOnClick() {
        TextView languageTV = view.findViewById(R.id.tv_more_settings_language);
        languageTV.setOnClickListener(v -> startActivity(new Intent(context, LanguageActivity.class)));
    }

    private void nightSwitchOnChecked() {
        SwitchCompat nightSwitch = view.findViewById(R.id.switch_more_settings_night);
        SaveState saveState=new SaveState(context);
        if(saveState.getState()==true)
        {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_YES);
        }
        else {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_NO);
        }
        if(saveState.getState()==true)
        {
            nightSwitch.setChecked(true);
        }
        else
        {
            nightSwitch.setChecked(false);
        }
        nightSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                nightSwitch.setChecked(true);
                saveState.setState(true);
                Toast.makeText(context, "Dark Mode", Toast.LENGTH_SHORT).show();
                AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_YES);
            } else {
                nightSwitch.setChecked(false);
                saveState.setState(false);
                Toast.makeText(context, "Light Mode", Toast.LENGTH_SHORT).show();
                AppCompatDelegate.setDefaultNightMode(
                        AppCompatDelegate.MODE_NIGHT_NO);

            }
        });
        /*nightSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putBoolean("True",true);
                editor.commit();
            }
        });*/
    }
}
