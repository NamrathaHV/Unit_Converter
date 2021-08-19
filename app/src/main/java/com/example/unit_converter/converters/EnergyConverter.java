package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;


public class EnergyConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public EnergyConverter(Context context, String fromUnit, String toUnit, double fromValue,
                           double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_energy_joule).equals(fromUnit)) {
            energyJoule();
        } else if (mContext.getString(R.string.string_units_list_energy_kilojoule).equals(fromUnit)) {
            energyKilojoule();
        } else if (mContext.getString(R.string.string_units_list_energy_calorie).equals(fromUnit)) {
            energyCalorie();
        } else if (mContext.getString(R.string.string_units_list_energy_kilocalorie).equals(fromUnit)) {
            energyKilocalorie();
        } else if (mContext.getString(R.string.string_units_list_energy_btu).equals(fromUnit)) {
            energyBtu();
        } else if (mContext.getString(R.string.string_units_list_energy_ftlbf).equals(fromUnit)) {
            energyFtlbf();
        } else if (mContext.getString(R.string.string_units_list_energy_inlbf).equals(fromUnit)) {
            energyInlbf();
        } else if (mContext.getString(R.string.string_units_list_energy_kilowatthour).equals(fromUnit)) {
            energyKilowatthour();
        }

    }

    private void energyJoule() {
        if (mContext.getString(R.string.string_units_list_energy_joule).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_energy_kilojoule).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_energy_calorie).equals(toUnit)) {
            toValue = fromValue * 0.239d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilocalorie).equals(toUnit)) {
            toValue = fromValue * 0.0002d;
        } else if (mContext.getString(R.string.string_units_list_energy_btu).equals(toUnit)) {
            toValue = fromValue * 0.0009d;
        } else if (mContext.getString(R.string.string_units_list_energy_ftlbf).equals(toUnit)) {
            toValue = fromValue * 0.7376d;
        } else if (mContext.getString(R.string.string_units_list_energy_inlbf).equals(toUnit)) {
            toValue = fromValue * 8.8507d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilowatthour).equals(toUnit)) {
            toValue = fromValue /3.6E+6d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void energyKilojoule() {
        if (mContext.getString(R.string.string_units_list_energy_joule).equals(toUnit)) {
            toValue = fromValue*1000d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilojoule).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_energy_calorie).equals(toUnit)) {
            toValue = fromValue * 239.0057d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilocalorie).equals(toUnit)) {
            toValue = fromValue * 0.239d;
        } else if (mContext.getString(R.string.string_units_list_energy_btu).equals(toUnit)) {
            toValue = fromValue * 0.9478d;
        } else if (mContext.getString(R.string.string_units_list_energy_ftlbf).equals(toUnit)) {
            toValue = fromValue * 737.5621d;
        } else if (mContext.getString(R.string.string_units_list_energy_inlbf).equals(toUnit)) {
            toValue = fromValue * 8850.7458d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilowatthour).equals(toUnit)) {
            toValue = fromValue * 0.0003d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void energyCalorie() {
        if (mContext.getString(R.string.string_units_list_energy_joule).equals(toUnit)) {
            toValue = fromValue*4.184d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilojoule).equals(toUnit)) {
            toValue = fromValue *0.0042d;
        } else if (mContext.getString(R.string.string_units_list_energy_calorie).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_energy_kilocalorie).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_energy_btu).equals(toUnit)) {
            toValue = fromValue * 0.004d;
        } else if (mContext.getString(R.string.string_units_list_energy_ftlbf).equals(toUnit)) {
            toValue = fromValue * 3.086d;
        } else if (mContext.getString(R.string.string_units_list_energy_inlbf).equals(toUnit)) {
            toValue = fromValue * 37.0315d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilowatthour).equals(toUnit)) {
            toValue = fromValue /860421d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void energyKilocalorie() {
        if (mContext.getString(R.string.string_units_list_energy_joule).equals(toUnit)) {
            toValue = fromValue*4184d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilojoule).equals(toUnit)) {
            toValue = fromValue *4.184d;
        } else if (mContext.getString(R.string.string_units_list_energy_calorie).equals(toUnit)) {
            toValue = fromValue *1000d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilocalorie).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_energy_btu).equals(toUnit)) {
            toValue = fromValue *3.9657d;
        } else if (mContext.getString(R.string.string_units_list_energy_ftlbf).equals(toUnit)) {
            toValue = fromValue * 3085.96d;
        } else if (mContext.getString(R.string.string_units_list_energy_inlbf).equals(toUnit)) {
            toValue = fromValue * 37031.5204d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilowatthour).equals(toUnit)) {
            toValue = fromValue * 0.0012d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void energyBtu() {
        if (mContext.getString(R.string.string_units_list_energy_joule).equals(toUnit)) {
            toValue = fromValue*1055.0559d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilojoule).equals(toUnit)) {
            toValue = fromValue *1.0551d;
        } else if (mContext.getString(R.string.string_units_list_energy_calorie).equals(toUnit)) {
            toValue = fromValue *252.1644d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilocalorie).equals(toUnit)) {
            toValue = fromValue *0.2522d;
        } else if (mContext.getString(R.string.string_units_list_energy_btu).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_energy_ftlbf).equals(toUnit)) {
            toValue = fromValue * 778.1693d;
        } else if (mContext.getString(R.string.string_units_list_energy_inlbf).equals(toUnit)) {
            toValue = fromValue * 9338.0311d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilowatthour).equals(toUnit)) {
            toValue = fromValue * 0.0003d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void energyFtlbf() {
        if (mContext.getString(R.string.string_units_list_energy_joule).equals(toUnit)) {
            toValue = fromValue*1.3668d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilojoule).equals(toUnit)) {
            toValue = fromValue *0.0014d;
        } else if (mContext.getString(R.string.string_units_list_energy_calorie).equals(toUnit)) {
            toValue = fromValue *0.324d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilocalorie).equals(toUnit)) {
            toValue = fromValue *0.0003d;
        } else if (mContext.getString(R.string.string_units_list_energy_btu).equals(toUnit)) {
            toValue = fromValue *0.0013d;
        } else if (mContext.getString(R.string.string_units_list_energy_ftlbf).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_energy_inlbf).equals(toUnit)) {
            toValue = fromValue * 12d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilowatthour).equals(toUnit)) {
            toValue = fromValue /2.655E+6d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }



    private void energyInlbf() {
        if (mContext.getString(R.string.string_units_list_energy_joule).equals(toUnit)) {
            toValue = fromValue*0.113d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilojoule).equals(toUnit)) {
            toValue = fromValue *0.0001d;
        } else if (mContext.getString(R.string.string_units_list_energy_calorie).equals(toUnit)) {
            toValue = fromValue *0.027d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilocalorie).equals(toUnit)) {
            toValue = fromValue *0d;
        } else if (mContext.getString(R.string.string_units_list_energy_btu).equals(toUnit)) {
            toValue = fromValue *0.0001d;
        } else if (mContext.getString(R.string.string_units_list_energy_ftlbf).equals(toUnit)) {
            toValue = fromValue*0.0833d ;
        } else if (mContext.getString(R.string.string_units_list_energy_inlbf).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_energy_kilowatthour).equals(toUnit)) {
            toValue = fromValue * 0d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }



    private void energyKilowatthour() {
        if (mContext.getString(R.string.string_units_list_energy_joule).equals(toUnit)) {
            toValue = fromValue*3600000d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilojoule).equals(toUnit)) {
            toValue = fromValue *3600d;
        } else if (mContext.getString(R.string.string_units_list_energy_calorie).equals(toUnit)) {
            toValue = fromValue *860420.6501d;
        } else if (mContext.getString(R.string.string_units_list_energy_kilocalorie).equals(toUnit)) {
            toValue = fromValue *860.4207d;
        } else if (mContext.getString(R.string.string_units_list_energy_btu).equals(toUnit)) {
            toValue = fromValue *3412.1416d;
        } else if (mContext.getString(R.string.string_units_list_energy_ftlbf).equals(toUnit)) {
            toValue = fromValue*2655223.738d ;
        } else if (mContext.getString(R.string.string_units_list_energy_inlbf).equals(toUnit)) {
            toValue = fromValue *31862684.8566;
        } else if (mContext.getString(R.string.string_units_list_energy_kilowatthour).equals(toUnit)) {
            toValue = fromValue ;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

}
