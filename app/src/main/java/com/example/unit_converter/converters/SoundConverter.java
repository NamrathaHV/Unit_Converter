package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;

public class SoundConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public SoundConverter(Context context, String fromUnit, String toUnit, double fromValue,
                          double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_sound_bel).equals(fromUnit)) {
            soundBel();
        } else if (mContext.getString(R.string.string_units_list_sound_centidecibel).equals(fromUnit)) {
            soundCentidecibel();
        } else if (mContext.getString(R.string.string_units_list_sound_decibel).equals(fromUnit)) {
            soundDecibel();
        } else if (mContext.getString(R.string.string_units_list_sound_millidecibel).equals(fromUnit)) {
            soundMillidecibel();
        } else if (mContext.getString(R.string.string_units_list_sound_neper).equals(fromUnit)) {
            soundNeper();
        }

    }

    private void soundBel() {
        if (mContext.getString(R.string.string_units_list_sound_bel).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_sound_centidecibel).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_sound_decibel).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_sound_millidecibel).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_sound_neper).equals(toUnit)) {
            toValue = fromValue * 1.1513d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void soundCentidecibel() {
        if (mContext.getString(R.string.string_units_list_sound_bel).equals(toUnit)) {
            toValue = fromValue*0.001d;
        } else if (mContext.getString(R.string.string_units_list_sound_centidecibel).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_sound_decibel).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_sound_millidecibel).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_sound_neper).equals(toUnit)) {
            toValue = fromValue * 0.0012d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void soundDecibel() {
        if (mContext.getString(R.string.string_units_list_sound_bel).equals(toUnit)) {
            toValue = fromValue*0.1d;
        } else if (mContext.getString(R.string.string_units_list_sound_centidecibel).equals(toUnit)) {
            toValue = fromValue * 100d ;
        } else if (mContext.getString(R.string.string_units_list_sound_decibel).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_sound_millidecibel).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_sound_neper).equals(toUnit)) {
            toValue = fromValue * 0.1151d;
        }
        mToNumberTV.setText(String.valueOf(toValue));

    }

    private void soundMillidecibel() {
        if (mContext.getString(R.string.string_units_list_sound_bel).equals(toUnit)) {
            toValue = fromValue*0.0001d;
        } else if (mContext.getString(R.string.string_units_list_sound_centidecibel).equals(toUnit)) {
            toValue = fromValue * 0.1d ;
        } else if (mContext.getString(R.string.string_units_list_sound_decibel).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_sound_millidecibel).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_sound_neper).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void soundNeper() {
        if (mContext.getString(R.string.string_units_list_sound_bel).equals(toUnit)) {
            toValue = fromValue*0.8686d;
        } else if (mContext.getString(R.string.string_units_list_sound_centidecibel).equals(toUnit)) {
            toValue = fromValue * 868.589d ;
        } else if (mContext.getString(R.string.string_units_list_sound_decibel).equals(toUnit)) {
            toValue = fromValue * 8.6859d;
        } else if (mContext.getString(R.string.string_units_list_sound_millidecibel).equals(toUnit)) {
            toValue = fromValue * 8685.8896d;
        } else if (mContext.getString(R.string.string_units_list_sound_neper).equals(toUnit)) {
            toValue = fromValue ;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

}