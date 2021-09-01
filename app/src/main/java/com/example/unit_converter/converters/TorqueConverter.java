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
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.00000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.101971621d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.019716213d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 0.001019716d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.000101972d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.001019716d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 0.00000102d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.00000102d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.001019716d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.000101972d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.101971621d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.000007376d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.000088507d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.001416119d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.00011801d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueDyneCentimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0001d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.001019716d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.010197162d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 0.000010197d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.00000102d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.000010197d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue *  0.00000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.00000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.000010197d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.00000102d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.001019716d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.000000074d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.000000885d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.000014161d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.00000118d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueDyneMillimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.00000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.00001d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.000101972d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.001019716d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 0.00000102d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.000000102d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.00000102d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 0.000000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.000000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.00000102d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.000000102d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.000101972d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.000000007d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.000000089d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.000001416d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.000000118d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueGramCentimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000098066d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0980665d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000000098d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665E-11d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 98.0665d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.0980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.0000723301d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.0008679616d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.0138873862d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.0011572822d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueGramMillimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0000098066d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.00980665d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.806649999E-9d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.806649999E-12d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.000980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 0.980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 98.0665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.000007233;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.0000867962d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.0013887386d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.0001157282d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueGramMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0098066d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0000098066d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665E-9d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 98066.5d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 98066.5d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.0072330136d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.0867961629d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 1.3887386229d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.1157282186d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueKilogramCentimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.098066d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 98.0665d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0000980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665E-8d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 98066.5d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 98.0665d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 980665;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 9806650d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.0723301358d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.8679616291d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 13.887386229d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 1.1572821857d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueKilogramMillimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0098066d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0000098066d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665E-9d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 98066.5d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 98066.5d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.0072330136d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.0867961629d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 1.3887386229d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.1157282186d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueKilogramMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.8066d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9806.65d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665E-6d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9806650d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 980665;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 98066500d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 980665000d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 7.2330135756d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 86.796162907d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 1388.7386229d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 115.72821857d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueKilogramForceMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.8066d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9806.65d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665E-6d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9806650d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 980665;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 98066500d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 980665000d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 7.2330135756d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 86.796162907d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 1388.7386229d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 115.72821857d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueGramForceMeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0098066d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0000098066d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665E-9d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 98066.5d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 98066.5d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.0072330136d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.0867961629d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 1.3887386229d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.1157282186d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueKilogramForceCentimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.098066d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 98.0665d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0000980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665E-8d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 98066.5d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 98.0665d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 980665;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 9806650d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.0723301358d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.8679616291d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 13.887386229d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 1.1572821857d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueGramForceCentimeter() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000098066d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0980665d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000000098d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665E-11d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 98.0665d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.0980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.0000723301d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.0008679616d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.0138873862d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.0011572822d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torquePoundForceFoot() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.355818d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1355.818d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 135.5818d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.001355818d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.000001355818d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1355818d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 1355.818d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 135.5818d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 135581.8d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 13558180d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 135581800d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 13825.495964d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 138254.95964d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 138.25495964d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 13.825495964d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 138.25495964d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 0.1382549596d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.1382549596d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 138.25495964d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 13.825495964d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 13825.495964d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 12d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 192.00000227d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 16.000000189;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torquePoundForceInch() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.1129848333d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 112.98483333d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 11.298483333d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0001129848d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0000001129848;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 112984.83333d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 112.98483333d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 11.298483333d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 11298.483333d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 1129848.3333d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 11298483.333d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 1152.1246637d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 11521.246637d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 11.521246637d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.1521246637d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 11.521246637d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 0.0115212466d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.0115212466d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 11.521246637d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.1521246637d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 1152.1246637d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue / 12d ;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 16.000000189d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue * 1.3333333491d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueOunceForceInch() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.007061552d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 7.061552d;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.7061552d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0000070616;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 1.129848E-10d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 7061.552d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 7.061552d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.7061552d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 706.1552d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 70615.52d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 706155.2d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 72.007790632d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 720.07790632d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 0.7200779063d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.0720077906d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.7200779063d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 0.0007200779d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.0007200779d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.7200779063d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.0720077906d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 72.007790632d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.0052083333d ;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.0624999993d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue / 12d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void torqueOunceForceFoot() {
        if (mContext.getString(R.string.string_units_list_torque_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.7499999911d;
        } else if (mContext.getString(R.string.string_units_list_torque_milli_newton_meter).equals(toUnit)) {
            toValue = fromValue * 84.738624d ;
        } else if (mContext.getString(R.string.string_units_list_torque_centi_newton_meter).equals(toUnit)) {
            toValue = fromValue * 8.4738624d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilo_newton_meter).equals(toUnit)) {
            toValue = fromValue * 0.0000847386d;
        } else if (mContext.getString(R.string.string_units_list_torque_mega_newton_meter).equals(toUnit)) {
            toValue = fromValue * 8.47386E-8d;
        } else if (mContext.getString(R.string.string_units_list_torque_micro_newton_meter).equals(toUnit)) {
            toValue = fromValue * 84738.624d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_millimeter).equals(toUnit)) {
            toValue = fromValue * 84.738624d;
        } else if (mContext.getString(R.string.string_units_list_torque_newton_centimeter).equals(toUnit)) {
            toValue = fromValue * 8.4738624d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_meter).equals(toUnit)) {
            toValue = fromValue * 8473.8624d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_centimeter).equals(toUnit)) {
            toValue = fromValue * 847386.24d;
        } else if (mContext.getString(R.string.string_units_list_torque_dyne_millimeter).equals(toUnit)) {
            toValue = fromValue * 8473862.4d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_centimeter).equals(toUnit)) {
            toValue = fromValue * 864.09348758d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_millimeter).equals(toUnit)) {
            toValue = fromValue * 8640.9348758d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_meter).equals(toUnit)) {
            toValue = fromValue * 8.6409348758d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.8640934876d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_millimeter).equals(toUnit)) {
            toValue = fromValue * 8.6409348758d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_meter).equals(toUnit)) {
            toValue = fromValue * 0.0086409349d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_meter).equals(toUnit)) {
            toValue = fromValue * 0.0086409349d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_meter).equals(toUnit)) {
            toValue = fromValue * 8.6409348758d;
        } else if (mContext.getString(R.string.string_units_list_torque_kilogram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.8640934876d;
        } else if (mContext.getString(R.string.string_units_list_torque_gram_force_centimeter).equals(toUnit)) {
            toValue = fromValue * 864.09348758d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_foot).equals(toUnit)) {
            toValue = fromValue * 0.0624999993d;
        } else if (mContext.getString(R.string.string_units_list_torque_pound_force_inch).equals(toUnit)) {
            toValue = fromValue * 0.7499999911d ;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_inch).equals(toUnit)) {
            toValue = fromValue * 12d;
        } else if (mContext.getString(R.string.string_units_list_torque_ounce_force_foot).equals(toUnit)) {
            toValue = fromValue ;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

}

