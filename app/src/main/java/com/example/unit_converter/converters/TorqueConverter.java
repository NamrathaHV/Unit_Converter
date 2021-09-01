package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;

public class TorqueConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public TorqueConverter(Context context, String fromUnit, String toUnit, double fromValue,
                           double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(fromUnit)) {
            torqueNewtonMeter();
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(fromUnit)) {
            torqueMilliNewtonMeter();
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(fromUnit)) {
            torqueCentiNewtonMeter();
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(fromUnit)) {
            torqueKiloNewtonMeter();
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(fromUnit)) {
            torqueMegaNewtonMeter();
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(fromUnit)) {
            torqueMicroNewtonMeter();
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(fromUnit)) {
            torqueNewtonMillimeter();
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(fromUnit)) {
            torqueNewtonCentiMeter();
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(fromUnit)) {
            torqueDyneMeter();
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(fromUnit)) {
            torqueDyneCentimeter();
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(fromUnit)) {
            torqueDyneMillimeter();
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(fromUnit)) {
            torqueKiloPoundMeter();
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(fromUnit)) {
            torqueGramCentimeter();
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(fromUnit)) {
            torqueGramMillimeter();
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(fromUnit)) {
            torqueGramMeter();
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(fromUnit)) {
            torqueKilogramCentimeter();
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(fromUnit)) {
            torqueKilogramMillimeter();
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(fromUnit)) {
            torqueKilogramMeter();
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(fromUnit)) {
            torqueKilogramForceMeter();
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(fromUnit)) {
            torqueGramForceMeter();
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(fromUnit)) {
            torqueKilogramForceCentimeter();
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(fromUnit)) {
            torqueGramForceCentimeter();
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(fromUnit)) {
            torquePoundForceFoot();
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(fromUnit)) {
            torquePoundForceInch();
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(fromUnit)) {
            torqueOunceForceInch();
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(fromUnit)) {
            torqueOunceForceFoot();
        }
    }

    private void torqueNewtonMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.80665d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueMilliNewtonMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue / 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue / 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue / 1.0E+6d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue / 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue / 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue / 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.010197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-7d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9806.65d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.010197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.0088507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.14161193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.011800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueCentiNewtonMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue / 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 10d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+6d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 2.2480894309971E-6d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1019.7162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  980.665d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 980.665d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 135.6d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.088507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 1.4161193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.11800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueKiloNewtonMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+10d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+11d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197162.129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971621.29779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197162.129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 737.56214728;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8850.7457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141611.93227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11800.994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueMegaNewtonMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E+11d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+13d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197162129.779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971621297.79d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101971621.29779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197162.129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971621.29779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101971621.29779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197162.129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197162129.779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 737562.14728;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8850745.7673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141611932.27806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11800994.356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueMicroNewtonMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-7d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.010197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-4d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-5d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-4d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-7d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-7d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-4d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-5d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.010197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 7.3756214728E-7d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787E-6d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 1.4161193227806E-4d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 1.1800994356505E-5d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueNewtonMillimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue / 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue / 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue / 1.0E+6d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue / 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue / 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue / 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.010197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-7d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9806.65d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.010197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.0088507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.14161193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.011800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueNewtonCentiMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue / 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 10d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+6d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 2.2480894309971E-6d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1019.7162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  980.665d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 980.665d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 135.6d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.088507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 1.4161193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.11800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueDyneMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueDyneCentimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueDyneMillimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueKiloPoundMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueGramCentimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueGramMillimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueGramMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueKilogramCentimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueKilogramMillimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueKilogramMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueKilogramForceMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueGramForceMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueKilogramForceCentimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void torqueGramForceCentimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torquePoundForceFoot() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torquePoundForceInch() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueOunceForceInch() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457673787d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 11.800994356505d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueOunceForceFoot() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_pound_meter).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue /  9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue / 9.807d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 1.356d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 8.8507457d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 141.61193227806d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue ;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

}

