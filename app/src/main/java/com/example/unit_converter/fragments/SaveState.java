package com.example.unit_converter.fragments;

import android.content.Context;
import android.content.SharedPreferences;

public class SaveState {

    Context context1;
    SharedPreferences sharedPreferences;
    public SaveState(Context context1){
        this.context1=context1;
        sharedPreferences=context1.getSharedPreferences("preferences",Context.MODE_PRIVATE);
    }
    public void setState(boolean bvalue){
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putBoolean("bkey",bvalue);
        editor.apply();
    }
    public boolean getState(){
        return sharedPreferences.getBoolean("bkey",false);
    }
}
