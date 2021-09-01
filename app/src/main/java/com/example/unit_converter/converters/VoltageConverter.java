package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;

public class VoltageConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public VoltageConverter(Context context, String fromUnit, String toUnit, double fromValue,
                            double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_voltage_teravolt).equals(fromUnit)) {
            voltageTeravolt();
        } else if (mContext.getString(R.string.string_units_list_voltage_gigavolt).equals(fromUnit)) {
            voltageGigavolt();
        } else if (mContext.getString(R.string.string_units_list_voltage_megavolt).equals(fromUnit)) {
            voltageMegavolt();
        } else if (mContext.getString(R.string.string_units_list_voltage_kilovolt).equals(fromUnit)) {
            voltageKilovolt();
        } else if (mContext.getString(R.string.string_units_list_voltage_hektovolt).equals(fromUnit)) {
            voltageHektovolt();
        } else if (mContext.getString(R.string.string_units_list_voltage_volt).equals(fromUnit)) {
            voltageVolt();
        } else if (mContext.getString(R.string.string_units_list_voltage_decivolt).equals(fromUnit)) {
            voltageDecivolt();
        } else if (mContext.getString(R.string.string_units_list_voltage_centivolt).equals(fromUnit)) {
            voltageCentivolt();
        } else if (mContext.getString(R.string.string_units_list_voltage_millivolt).equals(fromUnit)) {
            voltageMillivolt();
        } else if (mContext.getString(R.string.string_units_list_voltage_microvolt).equals(fromUnit)) {
            voltageMicrovolt();
        } else if (mContext.getString(R.string.string_units_list_voltage_nanovolt).equals(fromUnit)) {
            voltageNanovolt();
        }

    }

    private void voltageTeravolt() {
        if (mContext.getString(R.string.string_units_list_voltage_teravolt).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_voltage_gigavolt).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_megavolt).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_kilovolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+9d);
        } else if (mContext.getString(R.string.string_units_list_voltage_hektovolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+10d);
        } else if (mContext.getString(R.string.string_units_list_voltage_volt).equals(toUnit)) {
            toValue = fromValue * (1.0E+12d);
        } else if (mContext.getString(R.string.string_units_list_voltage_decivolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+13d);
        } else if (mContext.getString(R.string.string_units_list_voltage_centivolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+14d);
        } else if (mContext.getString(R.string.string_units_list_voltage_millivolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+15d);
        } else if (mContext.getString(R.string.string_units_list_voltage_microvolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+18d);
        } else if (mContext.getString(R.string.string_units_list_voltage_nanovolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+21d);
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void voltageGigavolt() {
        if (mContext.getString(R.string.string_units_list_voltage_teravolt).equals(toUnit)) {
            toValue = fromValue*0.001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_gigavolt).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_voltage_megavolt).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_kilovolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+6d);
        } else if (mContext.getString(R.string.string_units_list_voltage_hektovolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+7d);
        } else if (mContext.getString(R.string.string_units_list_voltage_volt).equals(toUnit)) {
            toValue = fromValue *(1.0E+9d);
        } else if (mContext.getString(R.string.string_units_list_voltage_decivolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+10d);
        } else if (mContext.getString(R.string.string_units_list_voltage_centivolt).equals(toUnit)) {
            toValue = fromValue *( 1.0E+11d);
        } else if (mContext.getString(R.string.string_units_list_voltage_millivolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+12d);
        } else if (mContext.getString(R.string.string_units_list_voltage_microvolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+15d);
        } else if (mContext.getString(R.string.string_units_list_voltage_nanovolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+18d);
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void voltageMegavolt() {


        if (mContext.getString(R.string.string_units_list_voltage_teravolt).equals(toUnit)) {
            toValue = fromValue*0.0000001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_gigavolt).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_megavolt).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_voltage_kilovolt).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_hektovolt).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_volt).equals(toUnit)) {
            toValue = fromValue * (1.0E+6d);
        } else if (mContext.getString(R.string.string_units_list_voltage_decivolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+7d);
        } else if (mContext.getString(R.string.string_units_list_voltage_centivolt).equals(toUnit)) {
            toValue = fromValue *(1.0E+8d) ;
        } else if (mContext.getString(R.string.string_units_list_voltage_millivolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+9d);
        } else if (mContext.getString(R.string.string_units_list_voltage_microvolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+12d);
        } else if (mContext.getString(R.string.string_units_list_voltage_nanovolt).equals(toUnit)) {
            toValue = fromValue *( 1.0E+15d);
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void voltageKilovolt() {
        if (mContext.getString(R.string.string_units_list_voltage_teravolt).equals(toUnit)) {
            toValue = fromValue*(1.0E-9d);
        } else if (mContext.getString(R.string.string_units_list_voltage_gigavolt).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_megavolt).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_kilovolt).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_voltage_hektovolt).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_voltage_volt).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_decivolt).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_centivolt).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_millivolt).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_microvolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+9d);
        } else if (mContext.getString(R.string.string_units_list_voltage_nanovolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+12d);
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void voltageHektovolt() {
        if (mContext.getString(R.string.string_units_list_voltage_teravolt).equals(toUnit)) {
            toValue = fromValue*(1.0E-10d);
        } else if (mContext.getString(R.string.string_units_list_voltage_gigavolt).equals(toUnit)) {
            toValue = fromValue * (1.0E-7d);
        } else if (mContext.getString(R.string.string_units_list_voltage_megavolt).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_kilovolt).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_voltage_hektovolt).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_voltage_volt).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_voltage_decivolt).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_centivolt).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_millivolt).equals(toUnit)) {
            toValue = fromValue *100000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_microvolt).equals(toUnit)) {
            toValue = fromValue *( 1.0E+8d);
        } else if (mContext.getString(R.string.string_units_list_voltage_nanovolt).equals(toUnit)) {
            toValue = fromValue *(1.0E+12d);
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void voltageVolt() {
        if (mContext.getString(R.string.string_units_list_voltage_teravolt).equals(toUnit)) {
            toValue = fromValue*(1.0E-12d);
        } else if (mContext.getString(R.string.string_units_list_voltage_gigavolt).equals(toUnit)) {
            toValue = fromValue *( 1.0E-9d);
        } else if (mContext.getString(R.string.string_units_list_voltage_megavolt).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_kilovolt).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_hektovolt).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_voltage_volt).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_voltage_decivolt).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_voltage_centivolt).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_voltage_millivolt).equals(toUnit)) {
            toValue = fromValue *1000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_microvolt).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_nanovolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+9d);
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void voltageDecivolt() {
        if (mContext.getString(R.string.string_units_list_voltage_teravolt).equals(toUnit)) {
            toValue = fromValue*(1.0E-13d);
        } else if (mContext.getString(R.string.string_units_list_voltage_gigavolt).equals(toUnit)) {
            toValue = fromValue * (1.0E-10d);
        } else if (mContext.getString(R.string.string_units_list_voltage_megavolt).equals(toUnit)) {
            toValue = fromValue *( 1.0E-7d);
        } else if (mContext.getString(R.string.string_units_list_voltage_kilovolt).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_hektovolt).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_volt).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_voltage_decivolt).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_voltage_centivolt).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_voltage_millivolt).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_voltage_microvolt).equals(toUnit)) {
            toValue = fromValue *100000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_nanovolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+8d);
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void voltageCentivolt() {
        if (mContext.getString(R.string.string_units_list_voltage_teravolt).equals(toUnit)) {
            toValue = fromValue*(1.0E-14d);
        } else if (mContext.getString(R.string.string_units_list_voltage_gigavolt).equals(toUnit)) {
            toValue = fromValue *( 1.0E-11d);
        } else if (mContext.getString(R.string.string_units_list_voltage_megavolt).equals(toUnit)) {
            toValue = fromValue * (1.0E-8d);
        } else if (mContext.getString(R.string.string_units_list_voltage_kilovolt).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_hektovolt).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_volt).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_voltage_decivolt).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_voltage_centivolt).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_voltage_millivolt).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_voltage_microvolt).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_nanovolt).equals(toUnit)) {
            toValue = fromValue * (1.0E+7d);
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void voltageMillivolt() {
        if (mContext.getString(R.string.string_units_list_voltage_teravolt).equals(toUnit)) {
            toValue = fromValue*(1.0E-15d);
        } else if (mContext.getString(R.string.string_units_list_voltage_gigavolt).equals(toUnit)) {
            toValue = fromValue *(1.0E-12d);
        } else if (mContext.getString(R.string.string_units_list_voltage_megavolt).equals(toUnit)) {
            toValue = fromValue * (1.0E-9d);
        } else if (mContext.getString(R.string.string_units_list_voltage_kilovolt).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_hektovolt).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_volt).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_decivolt).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_voltage_centivolt).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_voltage_millivolt).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_voltage_microvolt).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_voltage_nanovolt).equals(toUnit)) {
            toValue = fromValue *1000000d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void voltageMicrovolt() {
        if (mContext.getString(R.string.string_units_list_voltage_teravolt).equals(toUnit)) {
            toValue = fromValue*(1.0E-18d);
        } else if (mContext.getString(R.string.string_units_list_voltage_gigavolt).equals(toUnit)) {
            toValue = fromValue * (1.0E-15d);
        } else if (mContext.getString(R.string.string_units_list_voltage_megavolt).equals(toUnit)) {
            toValue = fromValue * (1.0E-12d);
        } else if (mContext.getString(R.string.string_units_list_voltage_kilovolt).equals(toUnit)) {
            toValue = fromValue * (1.0E-9d);
        } else if (mContext.getString(R.string.string_units_list_voltage_hektovolt).equals(toUnit)) {
            toValue = fromValue *(1.0E-8d);
        } else if (mContext.getString(R.string.string_units_list_voltage_volt).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_decivolt).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_centivolt).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_millivolt).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_microvolt).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_voltage_nanovolt).equals(toUnit)) {
            toValue = fromValue * 1000d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void voltageNanovolt() {
        if (mContext.getString(R.string.string_units_list_voltage_teravolt).equals(toUnit)) {
            toValue = fromValue*(1.0E-21d);
        } else if (mContext.getString(R.string.string_units_list_voltage_gigavolt).equals(toUnit)) {
            toValue = fromValue *( 1.0E-18d);
        } else if (mContext.getString(R.string.string_units_list_voltage_megavolt).equals(toUnit)) {
            toValue = fromValue * (1.0E-15d);
        } else if (mContext.getString(R.string.string_units_list_voltage_kilovolt).equals(toUnit)) {
            toValue = fromValue * (1.0E-12d);
        } else if (mContext.getString(R.string.string_units_list_voltage_hektovolt).equals(toUnit)) {
            toValue = fromValue * (1.0E-11d);
        } else if (mContext.getString(R.string.string_units_list_voltage_volt).equals(toUnit)) {
            toValue = fromValue * (1.0E-9d);
        } else if (mContext.getString(R.string.string_units_list_voltage_decivolt).equals(toUnit)) {
            toValue = fromValue * (1.0E-8d);
        } else if (mContext.getString(R.string.string_units_list_voltage_centivolt).equals(toUnit)) {
            toValue = fromValue * (1.0E-7d);
        } else if (mContext.getString(R.string.string_units_list_voltage_millivolt).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_microvolt).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_voltage_nanovolt).equals(toUnit)) {
            toValue = fromValue ;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

}