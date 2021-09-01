package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;

public class ResistanceConverter
{

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public ResistanceConverter(Context context, String fromUnit, String toUnit, double fromValue,
                               double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_resistance_abohm).equals(fromUnit)) {
            resistanceAbohm();
        } else if (mContext.getString(R.string.string_units_list_resistance_gigaohm).equals(fromUnit)) {
            resistanceGigaohm();
        } else if (mContext.getString(R.string.string_units_list_resistance_kiloohm).equals(fromUnit)) {
            resistanceKiloohm();
        } else if (mContext.getString(R.string.string_units_list_resistance_megaohm).equals(fromUnit)) {
            resistanceMegaohm();
        } else if (mContext.getString(R.string.string_units_list_resistance_microohm).equals(fromUnit)) {
            resistanceMicroohm();
        } else if (mContext.getString(R.string.string_units_list_resistance_milliohm).equals(fromUnit)) {
            resistanceMilliohm();
        } else if (mContext.getString(R.string.string_units_list_resistance_nanoohm).equals(fromUnit)) {
            resistanceNanoohm();
        } else if (mContext.getString(R.string.string_units_list_resistance_ohm).equals(fromUnit)) {
            resistanceOhm();
        } else if (mContext.getString(R.string.string_units_list_resistance_voltperampere).equals(fromUnit)) {
            resistanceVoltperampere();
        }

    }

    private void resistanceAbohm() {
        if (mContext.getString(R.string.string_units_list_resistance_abohm).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_resistance_gigaohm).equals(toUnit)) {
            toValue = fromValue *(1E-18d);
        } else if (mContext.getString(R.string.string_units_list_resistance_kiloohm).equals(toUnit)) {
            toValue = fromValue *(1E-12d);
        } else if (mContext.getString(R.string.string_units_list_resistance_megaohm).equals(toUnit)) {
            toValue = fromValue * (1E-15d);
        } else if (mContext.getString(R.string.string_units_list_resistance_microohm).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_resistance_milliohm).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_resistance_nanoohm).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_resistance_ohm).equals(toUnit)) {
            toValue = fromValue * (1E-9d);
        } else if (mContext.getString(R.string.string_units_list_resistance_voltperampere).equals(toUnit)) {
            toValue = fromValue * (1E-9d);
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void resistanceGigaohm() {
        if (mContext.getString(R.string.string_units_list_resistance_abohm).equals(toUnit)) {
            toValue = fromValue*(1.0E18d);
        } else if (mContext.getString(R.string.string_units_list_resistance_gigaohm).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_resistance_kiloohm).equals(toUnit)) {
            toValue = fromValue *1000000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_megaohm).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_microohm).equals(toUnit)) {
            toValue = fromValue * (1.0E+15d);
        } else if (mContext.getString(R.string.string_units_list_resistance_milliohm).equals(toUnit)) {
            toValue = fromValue * (1.0E+12d);
        } else if (mContext.getString(R.string.string_units_list_resistance_nanoohm).equals(toUnit)) {
            toValue = fromValue *( 1.0E+18d);
        } else if (mContext.getString(R.string.string_units_list_resistance_ohm).equals(toUnit)) {
            toValue = fromValue * (1.0E+9d);
        } else if (mContext.getString(R.string.string_units_list_resistance_voltperampere).equals(toUnit)) {
            toValue = fromValue *( 1.0E+9d);
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void resistanceKiloohm() {
        if (mContext.getString(R.string.string_units_list_resistance_abohm).equals(toUnit)) {
            toValue = fromValue*(1.0E+12d);
        } else if (mContext.getString(R.string.string_units_list_resistance_gigaohm).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_resistance_kiloohm).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_resistance_megaohm).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_resistance_microohm).equals(toUnit)) {
            toValue = fromValue *(1.0E+12d);
        } else if (mContext.getString(R.string.string_units_list_resistance_milliohm).equals(toUnit)) {
            toValue = fromValue *1000000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_nanoohm).equals(toUnit)) {
            toValue = fromValue *(1.0E+12d);
        } else if (mContext.getString(R.string.string_units_list_resistance_ohm).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_voltperampere).equals(toUnit)) {
            toValue = fromValue * 1000d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void resistanceMegaohm() {
        if (mContext.getString(R.string.string_units_list_resistance_abohm).equals(toUnit)) {
            toValue = fromValue*(1.0E+15d);
        } else if (mContext.getString(R.string.string_units_list_resistance_gigaohm).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_resistance_kiloohm).equals(toUnit)) {
            toValue = fromValue *1000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_megaohm).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_resistance_microohm).equals(toUnit)) {
            toValue = fromValue * (1.0E+12d);
        } else if (mContext.getString(R.string.string_units_list_resistance_milliohm).equals(toUnit)) {
            toValue = fromValue * (1.0E+9d);
        } else if (mContext.getString(R.string.string_units_list_resistance_nanoohm).equals(toUnit)) {
            toValue = fromValue * (1.0E+15d);
        } else if (mContext.getString(R.string.string_units_list_resistance_ohm).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_voltperampere).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void resistanceMicroohm() {
        if (mContext.getString(R.string.string_units_list_resistance_abohm).equals(toUnit)) {
            toValue = fromValue*1000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_gigaohm).equals(toUnit)) {
            toValue = fromValue *( 1E-15d);
        } else if (mContext.getString(R.string.string_units_list_resistance_kiloohm).equals(toUnit)) {
            toValue = fromValue *(1E-9d);
        } else if (mContext.getString(R.string.string_units_list_resistance_megaohm).equals(toUnit)) {
            toValue = fromValue * (1E-12d);
        } else if (mContext.getString(R.string.string_units_list_resistance_microohm).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_resistance_milliohm).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_resistance_nanoohm).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_ohm).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_resistance_voltperampere).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void resistanceMilliohm() {
        if (mContext.getString(R.string.string_units_list_resistance_abohm).equals(toUnit)) {
            toValue = fromValue*1000000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_gigaohm).equals(toUnit)) {
            toValue = fromValue *( 1E-12d);
        } else if (mContext.getString(R.string.string_units_list_resistance_kiloohm).equals(toUnit)) {
            toValue = fromValue *0.000001d;
        } else if (mContext.getString(R.string.string_units_list_resistance_megaohm).equals(toUnit)) {
            toValue = fromValue * (1E-9d);
        } else if (mContext.getString(R.string.string_units_list_resistance_microohm).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_milliohm).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_resistance_nanoohm).equals(toUnit)) {
            toValue = fromValue * (1.0E+6d);
        } else if (mContext.getString(R.string.string_units_list_resistance_ohm).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_resistance_voltperampere).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }



    private void resistanceNanoohm() {
        if (mContext.getString(R.string.string_units_list_resistance_abohm).equals(toUnit)) {
            toValue = fromValue*1d;
        } else if (mContext.getString(R.string.string_units_list_resistance_gigaohm).equals(toUnit)) {
            toValue = fromValue *( 1E-18d);
        } else if (mContext.getString(R.string.string_units_list_resistance_kiloohm).equals(toUnit)) {
            toValue = fromValue *(1E-12d);
        } else if (mContext.getString(R.string.string_units_list_resistance_megaohm).equals(toUnit)) {
            toValue = fromValue * (1E-15d);
        } else if (mContext.getString(R.string.string_units_list_resistance_microohm).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_resistance_milliohm).equals(toUnit)) {
            toValue = fromValue * 0.00000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_nanoohm).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_resistance_ohm).equals(toUnit)) {
            toValue = fromValue *( 1E-9d);
        } else if (mContext.getString(R.string.string_units_list_resistance_voltperampere).equals(toUnit)) {
            toValue = fromValue * (1E-9d);
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }



    private void resistanceOhm() {
        if (mContext.getString(R.string.string_units_list_resistance_abohm).equals(toUnit)) {
            toValue = fromValue*(1.0E+9d);
        } else if (mContext.getString(R.string.string_units_list_resistance_gigaohm).equals(toUnit)) {
            toValue = fromValue * (1E-9d);
        } else if (mContext.getString(R.string.string_units_list_resistance_kiloohm).equals(toUnit)) {
            toValue = fromValue *0.001d;
        } else if (mContext.getString(R.string.string_units_list_resistance_megaohm).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_resistance_microohm).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_milliohm).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_nanoohm).equals(toUnit)) {
            toValue = fromValue *( 1.0E+9d);
        } else if (mContext.getString(R.string.string_units_list_resistance_ohm).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_resistance_voltperampere).equals(toUnit)) {
            toValue = fromValue * 1d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void resistanceVoltperampere() {
        if (mContext.getString(R.string.string_units_list_resistance_abohm).equals(toUnit)) {
            toValue = fromValue*(1.0E+9d);
        } else if (mContext.getString(R.string.string_units_list_resistance_gigaohm).equals(toUnit)) {
            toValue = fromValue * (1E-9d);
        } else if (mContext.getString(R.string.string_units_list_resistance_kiloohm).equals(toUnit)) {
            toValue = fromValue *0.001d;
        } else if (mContext.getString(R.string.string_units_list_resistance_megaohm).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_resistance_microohm).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_milliohm).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_resistance_nanoohm).equals(toUnit)) {
            toValue = fromValue * (1.0E+9d);
        } else if (mContext.getString(R.string.string_units_list_resistance_ohm).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_resistance_voltperampere).equals(toUnit)) {
            toValue = fromValue ;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

}
