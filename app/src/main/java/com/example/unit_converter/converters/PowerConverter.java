package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;

public class PowerConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public PowerConverter(Context context, String fromUnit, String toUnit, double fromValue,
                          double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_power_watt).equals(fromUnit)) {
            powerWatt();
        } else if (mContext.getString(R.string.string_units_list_power_kilowatt).equals(fromUnit)) {
            powerKilowatt();
        } else if (mContext.getString(R.string.string_units_list_power_megawatt).equals(fromUnit)) {
            powerMegawatt();
        } else if (mContext.getString(R.string.string_units_list_power_hpmetric).equals(fromUnit)) {
            powerHpmetric();
        } else if (mContext.getString(R.string.string_units_list_power_hpmechanical).equals(fromUnit)) {
            powerHpmechanical();
        } else if (mContext.getString(R.string.string_units_list_power_ftlbfpersecond).equals(fromUnit)) {
            powerFtlbpersecond();
        } else if (mContext.getString(R.string.string_units_list_power_caloriepersecond).equals(fromUnit)) {
            powerCaloriepersecond();
        } else if (mContext.getString(R.string.string_units_list_power_btupersecond).equals(fromUnit)) {
            powerBtupersecond();
        } else if (mContext.getString(R.string.string_units_list_power_kva).equals(fromUnit)) {
            powerKva();
        }

    }

    private void powerWatt() {
        if (mContext.getString(R.string.string_units_list_power_watt).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_power_kilowatt).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_power_megawatt).equals(toUnit)) {
            toValue = fromValue /1E+6d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmetric).equals(toUnit)) {
            toValue = fromValue * 0.0014d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmechanical).equals(toUnit)) {
            toValue = fromValue * 0.0013d;
        } else if (mContext.getString(R.string.string_units_list_power_ftlbfpersecond).equals(toUnit)) {
            toValue = fromValue * 0.7376d;
        } else if (mContext.getString(R.string.string_units_list_power_caloriepersecond).equals(toUnit)) {
            toValue = fromValue * 0.2388d;
        } else if (mContext.getString(R.string.string_units_list_power_btupersecond).equals(toUnit)) {
            toValue = fromValue * 0.0009d;
        } else if (mContext.getString(R.string.string_units_list_power_kva).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void powerKilowatt() {
        if (mContext.getString(R.string.string_units_list_power_watt).equals(toUnit)) {
            toValue = fromValue*1000d;
        } else if (mContext.getString(R.string.string_units_list_power_kilowatt).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_power_megawatt).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmetric).equals(toUnit)) {
            toValue = fromValue * 1.3596d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmechanical).equals(toUnit)) {
            toValue = fromValue * 1.341d;
        } else if (mContext.getString(R.string.string_units_list_power_ftlbfpersecond).equals(toUnit)) {
            toValue = fromValue * 737.5621;
        } else if (mContext.getString(R.string.string_units_list_power_caloriepersecond).equals(toUnit)) {
            toValue = fromValue * 238.8459d;
        } else if (mContext.getString(R.string.string_units_list_power_btupersecond).equals(toUnit)) {
            toValue = fromValue * 0.9458d;
        } else if (mContext.getString(R.string.string_units_list_power_kva).equals(toUnit)) {
            toValue = fromValue * 1d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void powerMegawatt() {
        if (mContext.getString(R.string.string_units_list_power_watt).equals(toUnit)) {
            toValue = fromValue*1000000d;
        } else if (mContext.getString(R.string.string_units_list_power_kilowatt).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_power_megawatt).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_power_hpmetric).equals(toUnit)) {
            toValue = fromValue * 1359.6216d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmechanical).equals(toUnit)) {
            toValue = fromValue * 1341.0221d;
        } else if (mContext.getString(R.string.string_units_list_power_ftlbfpersecond).equals(toUnit)) {
            toValue = fromValue * 737562.1493d;
        } else if (mContext.getString(R.string.string_units_list_power_caloriepersecond).equals(toUnit)) {
            toValue = fromValue * 238845.8966d;
        } else if (mContext.getString(R.string.string_units_list_power_btupersecond).equals(toUnit)) {
            toValue = fromValue * 947.8171d;
        } else if (mContext.getString(R.string.string_units_list_power_kva).equals(toUnit)) {
            toValue = fromValue * 1000d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void powerHpmetric() {
        if (mContext.getString(R.string.string_units_list_power_watt).equals(toUnit)) {
            toValue = fromValue*735.4988d;
        } else if (mContext.getString(R.string.string_units_list_power_kilowatt).equals(toUnit)) {
            toValue = fromValue * 0.7355d;
        } else if (mContext.getString(R.string.string_units_list_power_megawatt).equals(toUnit)) {
            toValue = fromValue * 0.0007d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmetric).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_power_hpmechanical).equals(toUnit)) {
            toValue = fromValue * 0.9863d;
        } else if (mContext.getString(R.string.string_units_list_power_ftlbfpersecond).equals(toUnit)) {
            toValue = fromValue * 542.476d;
        } else if (mContext.getString(R.string.string_units_list_power_caloriepersecond).equals(toUnit)) {
            toValue = fromValue * 175.6709;
        } else if (mContext.getString(R.string.string_units_list_power_btupersecond).equals(toUnit)) {
            toValue = fromValue * 0.6971d;
        } else if (mContext.getString(R.string.string_units_list_power_kva).equals(toUnit)) {
            toValue = fromValue * 0.7355d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void powerHpmechanical() {
        if (mContext.getString(R.string.string_units_list_power_watt).equals(toUnit)) {
            toValue = fromValue*745.6999d;
        } else if (mContext.getString(R.string.string_units_list_power_kilowatt).equals(toUnit)) {
            toValue = fromValue * 0.7457d;
        } else if (mContext.getString(R.string.string_units_list_power_megawatt).equals(toUnit)) {
            toValue = fromValue * 0.0007d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmetric).equals(toUnit)) {
            toValue = fromValue * 1.0139d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmechanical).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_power_ftlbfpersecond).equals(toUnit)) {
            toValue = fromValue * 550d;
        } else if (mContext.getString(R.string.string_units_list_power_caloriepersecond).equals(toUnit)) {
            toValue = fromValue * 178.1074d;
        } else if (mContext.getString(R.string.string_units_list_power_btupersecond).equals(toUnit)) {
            toValue = fromValue * 0.7068d;
        } else if (mContext.getString(R.string.string_units_list_power_kva).equals(toUnit)) {
            toValue = fromValue * 0.7457d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void powerFtlbpersecond() {
        if (mContext.getString(R.string.string_units_list_power_watt).equals(toUnit)) {
            toValue = fromValue*1.3558d;
        } else if (mContext.getString(R.string.string_units_list_power_kilowatt).equals(toUnit)) {
            toValue = fromValue * 10.0014d;
        } else if (mContext.getString(R.string.string_units_list_power_megawatt).equals(toUnit)) {
            toValue = fromValue * 0.0000014d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmetric).equals(toUnit)) {
            toValue = fromValue * 0.0018d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmechanical).equals(toUnit)) {
            toValue = fromValue * 0.0018d;
        } else if (mContext.getString(R.string.string_units_list_power_ftlbfpersecond).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_power_caloriepersecond).equals(toUnit)) {
            toValue = fromValue * 0.3238d;
        } else if (mContext.getString(R.string.string_units_list_power_btupersecond).equals(toUnit)) {
            toValue = fromValue * 0.0013d;
        } else if (mContext.getString(R.string.string_units_list_power_kva).equals(toUnit)) {
            toValue = fromValue *0.0014d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }



    private void powerCaloriepersecond() {
        if (mContext.getString(R.string.string_units_list_power_watt).equals(toUnit)) {
            toValue = fromValue*4.1868d;
        } else if (mContext.getString(R.string.string_units_list_power_kilowatt).equals(toUnit)) {
            toValue = fromValue * 0.0042d;
        } else if (mContext.getString(R.string.string_units_list_power_megawatt).equals(toUnit)) {
            toValue = fromValue * 0.0000041868d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmetric).equals(toUnit)) {
            toValue = fromValue * 0.0057d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmechanical).equals(toUnit)) {
            toValue = fromValue * 0.0056d;
        } else if (mContext.getString(R.string.string_units_list_power_ftlbfpersecond).equals(toUnit)) {
            toValue = fromValue * 3.088d;
        } else if (mContext.getString(R.string.string_units_list_power_caloriepersecond).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_power_btupersecond).equals(toUnit)) {
            toValue = fromValue * 0.004d;
        } else if (mContext.getString(R.string.string_units_list_power_kva).equals(toUnit)) {
            toValue = fromValue * 0.0042d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }



    private void powerBtupersecond() {
        if (mContext.getString(R.string.string_units_list_power_watt).equals(toUnit)) {
            toValue = fromValue*1055.0559d;
        } else if (mContext.getString(R.string.string_units_list_power_kilowatt).equals(toUnit)) {
            toValue = fromValue * 1.0551d;
        } else if (mContext.getString(R.string.string_units_list_power_megawatt).equals(toUnit)) {
            toValue = fromValue * 0.0011d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmetric).equals(toUnit)) {
            toValue = fromValue * 1.4325d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmechanical).equals(toUnit)) {
            toValue = fromValue * 1.4149d;
        } else if (mContext.getString(R.string.string_units_list_power_ftlbfpersecond).equals(toUnit)) {
            toValue = fromValue * 778.1693d;
        } else if (mContext.getString(R.string.string_units_list_power_caloriepersecond).equals(toUnit)) {
            toValue = fromValue * 251.9958d;
        } else if (mContext.getString(R.string.string_units_list_power_btupersecond).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_power_kva).equals(toUnit)) {
            toValue = fromValue*1.0551d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void powerKva() {
        if (mContext.getString(R.string.string_units_list_power_watt).equals(toUnit)) {
            toValue = fromValue*1000d;
        } else if (mContext.getString(R.string.string_units_list_power_kilowatt).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_power_megawatt).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmetric).equals(toUnit)) {
            toValue = fromValue * 1.3596d;
        } else if (mContext.getString(R.string.string_units_list_power_hpmechanical).equals(toUnit)) {
            toValue = fromValue * 1.341d;
        } else if (mContext.getString(R.string.string_units_list_power_ftlbfpersecond).equals(toUnit)) {
            toValue = fromValue * 737.5621d;
        } else if (mContext.getString(R.string.string_units_list_power_caloriepersecond).equals(toUnit)) {
            toValue = fromValue * 238.8459d;
        } else if (mContext.getString(R.string.string_units_list_power_btupersecond).equals(toUnit)) {
            toValue = fromValue * 0.9478d;
        } else if (mContext.getString(R.string.string_units_list_power_kva).equals(toUnit)) {
            toValue = fromValue ;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


}
