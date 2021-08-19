package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;

public class CurrentConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public CurrentConverter(Context context, String fromUnit, String toUnit, double fromValue,
                            double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_current_ampere).equals(fromUnit)) {
            currentAmpere();
        } else if (mContext.getString(R.string.string_units_list_current_kiloampere).equals(fromUnit)) {
            currentKiloampere();
        } else if (mContext.getString(R.string.string_units_list_current_milliampere).equals(fromUnit)) {
            currentMilliampere();
        } else if (mContext.getString(R.string.string_units_list_current_biot).equals(fromUnit)) {
            currentBiot();
        } else if (mContext.getString(R.string.string_units_list_current_abampere).equals(fromUnit)) {
            currentAbampere();
        } else if (mContext.getString(R.string.string_units_list_current_emuofcurrent).equals(fromUnit)) {
            currenEmuofcurrent();
        } else if (mContext.getString(R.string.string_units_list_current_statampere).equals(fromUnit)) {
            currentStatampere();
        } else if (mContext.getString(R.string.string_units_list_current_esuofcurrent).equals(fromUnit)) {
            currentEsuofcurrent();
        } else if (mContext.getString(R.string.string_units_list_current_cgsemunit).equals(fromUnit)) {
            currentCgsemunit();
        } else if (mContext.getString(R.string.string_units_list_current_cgsesunit).equals(fromUnit)) {
            currentCgsesunit();
        }

    }

    private void currentAmpere() {
        if (mContext.getString(R.string.string_units_list_current_ampere).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_current_kiloampere).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_current_milliampere).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_current_biot).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_current_abampere).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_current_emuofcurrent).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_current_statampere).equals(toUnit)) {
            toValue = fromValue * 2997924536.8d;
        } else if (mContext.getString(R.string.string_units_list_current_esuofcurrent).equals(toUnit)) {
            toValue = fromValue * 2997924536.8d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsemunit).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsesunit).equals(toUnit)) {
            toValue = fromValue * 2997924536.8d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void currentKiloampere() {
        if (mContext.getString(R.string.string_units_list_current_ampere).equals(toUnit)) {
            toValue = fromValue*1000d;
        } else if (mContext.getString(R.string.string_units_list_current_kiloampere).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_current_milliampere).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_current_biot).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_current_abampere).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_current_emuofcurrent).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_current_statampere).equals(toUnit)) {
            toValue = fromValue * 2997924536843d;
        } else if (mContext.getString(R.string.string_units_list_current_esuofcurrent).equals(toUnit)) {
            toValue = fromValue * 2997924536843d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsemunit).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsesunit).equals(toUnit)) {
            toValue = fromValue * 2997924536843d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void currentMilliampere() {


        if (mContext.getString(R.string.string_units_list_current_ampere).equals(toUnit)) {
            toValue = fromValue*0.001d;
        } else if (mContext.getString(R.string.string_units_list_current_kiloampere).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_current_milliampere).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_current_biot).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_current_abampere).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_current_emuofcurrent).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_current_statampere).equals(toUnit)) {
            toValue = fromValue * 2997924.5368d;
        } else if (mContext.getString(R.string.string_units_list_current_esuofcurrent).equals(toUnit)) {
            toValue = fromValue * 2997924.5368d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsemunit).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsesunit).equals(toUnit)) {
            toValue = fromValue * 2997924.5368d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void currentBiot() {
        if (mContext.getString(R.string.string_units_list_current_ampere).equals(toUnit)) {
            toValue = fromValue*10d;
        } else if (mContext.getString(R.string.string_units_list_current_kiloampere).equals(toUnit)) {
            toValue = fromValue * 0.101d;
        } else if (mContext.getString(R.string.string_units_list_current_milliampere).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_current_biot).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_current_abampere).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_emuofcurrent).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_statampere).equals(toUnit)) {
            toValue = fromValue * 29979245368d;
        } else if (mContext.getString(R.string.string_units_list_current_esuofcurrent).equals(toUnit)) {
            toValue = fromValue * 29979245368d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsemunit).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsesunit).equals(toUnit)) {
            toValue = fromValue *29979245368d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void currentAbampere() {
        if (mContext.getString(R.string.string_units_list_current_ampere).equals(toUnit)) {
            toValue = fromValue*10d;
        } else if (mContext.getString(R.string.string_units_list_current_kiloampere).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_current_milliampere).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_current_biot).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_abampere).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_current_emuofcurrent).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_statampere).equals(toUnit)) {
            toValue = fromValue * 29979245368d;;
        } else if (mContext.getString(R.string.string_units_list_current_esuofcurrent).equals(toUnit)) {
            toValue = fromValue * 29979245368d;;
        } else if (mContext.getString(R.string.string_units_list_current_cgsemunit).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsesunit).equals(toUnit)) {
            toValue = fromValue * 29979245368d;;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void currenEmuofcurrent() {
        if (mContext.getString(R.string.string_units_list_current_ampere).equals(toUnit)) {
            toValue = fromValue*10d;
        } else if (mContext.getString(R.string.string_units_list_current_kiloampere).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_current_milliampere).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_current_biot).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_abampere).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_emuofcurrent).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_current_statampere).equals(toUnit)) {
            toValue = fromValue * 29979245368d;;
        } else if (mContext.getString(R.string.string_units_list_current_esuofcurrent).equals(toUnit)) {
            toValue = fromValue * 29979245368d;;
        } else if (mContext.getString(R.string.string_units_list_current_cgsemunit).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsesunit).equals(toUnit)) {
            toValue = fromValue * 29979245368d;;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void currentStatampere() {
        if (mContext.getString(R.string.string_units_list_current_ampere).equals(toUnit)) {
            toValue = fromValue*3.335641E-10;
        } else if (mContext.getString(R.string.string_units_list_current_kiloampere).equals(toUnit)) {
            toValue = fromValue * 3.335641E-13d;
        } else if (mContext.getString(R.string.string_units_list_current_milliampere).equals(toUnit)) {
            toValue = fromValue * 3.335641E-7d;
        } else if (mContext.getString(R.string.string_units_list_current_biot).equals(toUnit)) {
            toValue = fromValue * 3.335641E-11d;
        } else if (mContext.getString(R.string.string_units_list_current_abampere).equals(toUnit)) {
            toValue = fromValue * 3.335641E-11d;
        } else if (mContext.getString(R.string.string_units_list_current_emuofcurrent).equals(toUnit)) {
            toValue = fromValue * 3.335641E-11d;
        } else if (mContext.getString(R.string.string_units_list_current_statampere).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_current_esuofcurrent).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsemunit).equals(toUnit)) {
            toValue = fromValue * 3.335641E-11d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsesunit).equals(toUnit)) {
            toValue = fromValue * 1d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void currentEsuofcurrent() {
        if (mContext.getString(R.string.string_units_list_current_ampere).equals(toUnit)) {
            toValue = fromValue*3.335641E-10d;
        } else if (mContext.getString(R.string.string_units_list_current_kiloampere).equals(toUnit)) {
            toValue = fromValue *3.335641E-13d;
        } else if (mContext.getString(R.string.string_units_list_current_milliampere).equals(toUnit)) {
            toValue = fromValue * 3.335641E-7d;
        } else if (mContext.getString(R.string.string_units_list_current_biot).equals(toUnit)) {
            toValue = fromValue *3.335641E-11d;
        } else if (mContext.getString(R.string.string_units_list_current_abampere).equals(toUnit)) {
            toValue = fromValue * 3.335641E-11d;
        } else if (mContext.getString(R.string.string_units_list_current_emuofcurrent).equals(toUnit)) {
            toValue = fromValue * 3.335641E-11d;
        } else if (mContext.getString(R.string.string_units_list_current_statampere).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_esuofcurrent).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_current_cgsemunit).equals(toUnit)) {
            toValue = fromValue *3.335641E-11d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsesunit).equals(toUnit)) {
            toValue = fromValue * 1d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void currentCgsemunit() {
        if (mContext.getString(R.string.string_units_list_current_ampere).equals(toUnit)) {
            toValue = fromValue*10d;
        } else if (mContext.getString(R.string.string_units_list_current_kiloampere).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_current_milliampere).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_current_biot).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_abampere).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_emuofcurrent).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_statampere).equals(toUnit)) {
            toValue = fromValue * 29979245368d;
        } else if (mContext.getString(R.string.string_units_list_current_esuofcurrent).equals(toUnit)) {
            toValue = fromValue * 29979245368d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsemunit).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_current_cgsesunit).equals(toUnit)) {
            toValue = fromValue * 29979245368d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void currentCgsesunit() {
        if (mContext.getString(R.string.string_units_list_current_ampere).equals(toUnit)) {
            toValue = fromValue*3.335641E-10d;
        } else if (mContext.getString(R.string.string_units_list_current_kiloampere).equals(toUnit)) {
            toValue = fromValue * 3.335641E-13d;
        } else if (mContext.getString(R.string.string_units_list_current_milliampere).equals(toUnit)) {
            toValue = fromValue * 3.335641E-7d;
        } else if (mContext.getString(R.string.string_units_list_current_biot).equals(toUnit)) {
            toValue = fromValue * 3.335641E-11d;
        } else if (mContext.getString(R.string.string_units_list_current_abampere).equals(toUnit)) {
            toValue = fromValue * 3.335641E-11d;
        } else if (mContext.getString(R.string.string_units_list_current_emuofcurrent).equals(toUnit)) {
            toValue = fromValue * 3.335641E-11d;
        } else if (mContext.getString(R.string.string_units_list_current_statampere).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_esuofcurrent).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsemunit).equals(toUnit)) {
            toValue = fromValue * 3.335641E-11d;
        } else if (mContext.getString(R.string.string_units_list_current_cgsesunit).equals(toUnit)) {
            toValue = fromValue ;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
}
