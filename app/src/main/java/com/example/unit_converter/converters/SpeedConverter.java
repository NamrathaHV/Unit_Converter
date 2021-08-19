package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;

public class SpeedConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public SpeedConverter(Context context, String fromUnit, String toUnit, double fromValue,
                          double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_speed_kilometerperhour).equals(fromUnit)) {
            speedKilometerPerHour();
        } else if (mContext.getString(R.string.string_units_list_speed_mileperhour).equals(fromUnit)) {
            speedMilePerHour();
        } else if (mContext.getString(R.string.string_units_list_speed_meterpersecond).equals(fromUnit)) {
            speedMeterPerSecond();
        } else if (mContext.getString(R.string.string_units_list_speed_footpersecond).equals(fromUnit)) {
            speedFootPerSecond();
        } else if (mContext.getString(R.string.string_units_list_speed_knot).equals(fromUnit)) {
            speedKnot();
        }

    }

    private void speedKilometerPerHour() {
        if (mContext.getString(R.string.string_units_list_speed_kilometerperhour).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_speed_mileperhour).equals(toUnit)) {
            toValue = fromValue * 0.6214d ;
        } else if (mContext.getString(R.string.string_units_list_speed_meterpersecond).equals(toUnit)) {
            toValue = fromValue * 0.2778d;
        } else if (mContext.getString(R.string.string_units_list_speed_footpersecond).equals(toUnit)) {
            toValue = fromValue * 0.9113d;
        } else if (mContext.getString(R.string.string_units_list_speed_knot).equals(toUnit)) {
            toValue = fromValue * 0.54d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void speedMilePerHour() {
        if (mContext.getString(R.string.string_units_list_speed_kilometerperhour).equals(toUnit)) {
            toValue = fromValue*1.6093d;
        } else if (mContext.getString(R.string.string_units_list_speed_mileperhour).equals(toUnit)) {
            toValue = fromValue  ;
        } else if (mContext.getString(R.string.string_units_list_speed_meterpersecond).equals(toUnit)) {
            toValue = fromValue *0.447d ;
        } else if (mContext.getString(R.string.string_units_list_speed_footpersecond).equals(toUnit)) {
            toValue = fromValue *1.4667d ;
        } else if (mContext.getString(R.string.string_units_list_speed_knot).equals(toUnit)) {
            toValue = fromValue * 0.869d;
        }


        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void speedMeterPerSecond() {
        if (mContext.getString(R.string.string_units_list_speed_kilometerperhour).equals(toUnit)) {
            toValue = fromValue*3.6d;
        } else if (mContext.getString(R.string.string_units_list_speed_mileperhour).equals(toUnit)) {
            toValue = fromValue *2.2369d ;
        } else if (mContext.getString(R.string.string_units_list_speed_meterpersecond).equals(toUnit)) {
            toValue = fromValue  ;
        } else if (mContext.getString(R.string.string_units_list_speed_footpersecond).equals(toUnit)) {
            toValue = fromValue * 3.2808d;
        } else if (mContext.getString(R.string.string_units_list_speed_knot).equals(toUnit)) {
            toValue = fromValue * 1.9438d;
        }

        mToNumberTV.setText(String.valueOf(toValue));

    }

    private void speedFootPerSecond() {
        if (mContext.getString(R.string.string_units_list_speed_kilometerperhour).equals(toUnit)) {
            toValue = fromValue*1.0973d;
        } else if (mContext.getString(R.string.string_units_list_speed_mileperhour).equals(toUnit)) {
            toValue = fromValue *0.6818d ;
        } else if (mContext.getString(R.string.string_units_list_speed_meterpersecond).equals(toUnit)) {
            toValue = fromValue * 0.3048d;
        } else if (mContext.getString(R.string.string_units_list_speed_footpersecond).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_speed_knot).equals(toUnit)) {
            toValue = fromValue *0.5925d ;
        }


        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void speedKnot() {
        if (mContext.getString(R.string.string_units_list_speed_kilometerperhour).equals(toUnit)) {
            toValue = fromValue*1.852d;
        } else if (mContext.getString(R.string.string_units_list_speed_mileperhour).equals(toUnit)) {
            toValue = fromValue * 1.1508d;
        } else if (mContext.getString(R.string.string_units_list_speed_meterpersecond).equals(toUnit)) {
            toValue = fromValue* 0.5144d ;
        } else if (mContext.getString(R.string.string_units_list_speed_footpersecond).equals(toUnit)) {
            toValue = fromValue *1.6878d;
        } else if (mContext.getString(R.string.string_units_list_speed_knot).equals(toUnit)) {
            toValue = fromValue ;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }




}
