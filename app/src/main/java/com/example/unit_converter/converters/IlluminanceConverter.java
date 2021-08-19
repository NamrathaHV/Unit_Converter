package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;

public class IlluminanceConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public IlluminanceConverter(Context context, String fromUnit, String toUnit, double fromValue,
                                double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_illuminance_lux).equals(fromUnit)) {
            illuminanceLux();
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumepermtsq).equals(fromUnit)) {
            illuminanceLumenpermtsq();
        } else if (mContext.getString(R.string.string_units_list_illuminance_metercandle).equals(fromUnit)) {
            illuminanceMetercandle();
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenperftsq).equals(fromUnit)) {
            illuminanceLumenperftsq();
        } else if (mContext.getString(R.string.string_units_list_illuminance_footcandle).equals(fromUnit)) {
            illuminanceFootcandle();
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenpercmsq).equals(fromUnit)) {
            illuminanceLumenpercmsq();
        } else if (mContext.getString(R.string.string_units_list_illuminance_phot).equals(fromUnit)) {
            illuminancePhot();
        } else if (mContext.getString(R.string.string_units_list_illuminance_microwattpercmsq).equals(fromUnit)) {
            illuminanceMicrowattpercmsq();
        }

    }

    private void illuminanceLux() {
        if (mContext.getString(R.string.string_units_list_illuminance_lux).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumepermtsq).equals(toUnit)) {
            toValue = fromValue *1d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_metercandle).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenperftsq).equals(toUnit)) {
            toValue = fromValue * 0.092903d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_footcandle).equals(toUnit)) {
            toValue = fromValue * 0.092903d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenpercmsq).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_phot).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_microwattpercmsq).equals(toUnit)) {
            toValue = fromValue * 0.146413d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void illuminanceLumenpermtsq() {
        if (mContext.getString(R.string.string_units_list_illuminance_lux).equals(toUnit)) {
            toValue = fromValue*1d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumepermtsq).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_illuminance_metercandle).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenperftsq).equals(toUnit)) {
            toValue = fromValue * 0.092903d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_footcandle).equals(toUnit)) {
            toValue = fromValue * 0.092903d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenpercmsq).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_phot).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_microwattpercmsq).equals(toUnit)) {
            toValue = fromValue * 0.146413d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void illuminanceMetercandle() {
        if (mContext.getString(R.string.string_units_list_illuminance_lux).equals(toUnit)) {
            toValue = fromValue*1d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumepermtsq).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_metercandle).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenperftsq).equals(toUnit)) {
            toValue = fromValue * 0.092903d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_footcandle).equals(toUnit)) {
            toValue = fromValue * 0.092903d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenpercmsq).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_phot).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_microwattpercmsq).equals(toUnit)) {
            toValue = fromValue * 0.146413d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void illuminanceLumenperftsq() {
        if (mContext.getString(R.string.string_units_list_illuminance_lux).equals(toUnit)) {
            toValue = fromValue*10.76391d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumepermtsq).equals(toUnit)) {
            toValue = fromValue * 10.76391d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_metercandle).equals(toUnit)) {
            toValue = fromValue * 10.76391d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenperftsq).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_illuminance_footcandle).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenpercmsq).equals(toUnit)) {
            toValue = fromValue * 0.001076d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_phot).equals(toUnit)) {
            toValue = fromValue * 0.001076d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_microwattpercmsq).equals(toUnit)) {
            toValue = fromValue * 1.575975d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void illuminanceFootcandle() {
        if (mContext.getString(R.string.string_units_list_illuminance_lux).equals(toUnit)) {
            toValue = fromValue*10.76391;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumepermtsq).equals(toUnit)) {
            toValue = fromValue * 10.76391d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_metercandle).equals(toUnit)) {
            toValue = fromValue * 10.76391d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenperftsq).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_footcandle).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_illuminance_microwattpercmsq).equals(toUnit)) {
            toValue = fromValue * 0.001076;
        } else if (mContext.getString(R.string.string_units_list_illuminance_phot).equals(toUnit)) {
            toValue = fromValue * 0.001076d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_microwattpercmsq).equals(toUnit)) {
            toValue = fromValue * 1.575975d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void illuminanceLumenpercmsq() {
        if (mContext.getString(R.string.string_units_list_illuminance_lux).equals(toUnit)) {
            toValue = fromValue*10000d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumepermtsq).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_metercandle).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenperftsq).equals(toUnit)) {
            toValue = fromValue * 929.0304d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_footcandle).equals(toUnit)) {
            toValue = fromValue * 929.0304d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenpercmsq).equals(toUnit)) {
            toValue = fromValue  ;
        } else if (mContext.getString(R.string.string_units_list_illuminance_phot).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_microwattpercmsq).equals(toUnit)) {
            toValue = fromValue * 1464.12884d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }



    private void illuminancePhot() {
        if (mContext.getString(R.string.string_units_list_illuminance_lux).equals(toUnit)) {
            toValue = fromValue*10000d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumepermtsq).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_metercandle).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenperftsq).equals(toUnit)) {
            toValue = fromValue * 929.0304d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_footcandle).equals(toUnit)) {
            toValue = fromValue * 929.0304d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenpercmsq).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_phot).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_illuminance_microwattpercmsq).equals(toUnit)) {
            toValue = fromValue * 1464.12884d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }






    private void illuminanceMicrowattpercmsq() {
        if (mContext.getString(R.string.string_units_list_illuminance_lux).equals(toUnit)) {
            toValue = fromValue*6.83d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumepermtsq).equals(toUnit)) {
            toValue = fromValue *6.83d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_metercandle).equals(toUnit)) {
            toValue = fromValue * 6.83d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenperftsq).equals(toUnit)) {
            toValue = fromValue * 0.634528d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_footcandle).equals(toUnit)) {
            toValue = fromValue * 0.634528d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_lumenpercmsq).equals(toUnit)) {
            toValue = fromValue * 0.000683d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_phot).equals(toUnit)) {
            toValue = fromValue * 0.000683d;
        } else if (mContext.getString(R.string.string_units_list_illuminance_microwattpercmsq).equals(toUnit)) {
            toValue = fromValue ;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

}
