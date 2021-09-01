package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;
import com.example.unit_converter.R;

public class ForceConverter {
    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public ForceConverter(Context context, String fromUnit, String toUnit, double fromValue, double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(fromUnit)) {
            forceNewton();
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(fromUnit)) {
            forceGramForce();
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(fromUnit)) {
            forceKilogramForce();
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(fromUnit)) {
            forceTonForce();
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(fromUnit)) {
            forceExaNewton();
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(fromUnit)) {
            forcePetaNewton();
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(fromUnit)) {
            forceTeraNewton();
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(fromUnit)) {
            forceGigaNewton();
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(fromUnit)) {
            forceMegaNewton();
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(fromUnit)) {
            forceKiloNewton();
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(fromUnit)) {
            forceHectoNewton();
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(fromUnit)) {
            forceDecaNewton();
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(fromUnit)) {
            forceDeciNewton();
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(fromUnit)) {
            forceCentiNewton();
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(fromUnit)) {
            forceMilliNewton();
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(fromUnit)) {
            forceMicroNewton();
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(fromUnit)) {
            forceNanoNewton();
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(fromUnit)) {
            forcePicoNewton();
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(fromUnit)) {
            forceFemtoNewton();
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(fromUnit)) {
            forceDyne();
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(fromUnit)) {
            forceJoulePerMeter();
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(fromUnit)) {
            forceJoulePerCentieter();
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(fromUnit)) {
            forceKilopoundForce();
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(fromUnit)) {
            forcePoundForce();
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(fromUnit)) {
            forceOunceForce();
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(fromUnit)) {
            forcePoundal();
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(fromUnit)) {
            forcePoundFootPerSquareSecond();
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(fromUnit)) {
            forcePond();
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(fromUnit)) {
            forceKilopond();
        }
    }

    private void forceNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-4d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 0.0002248089d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 0.2248089431d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  3.5969430896d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 7.2330138512d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 7.2330138512d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceGramForce() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  0.000001d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-21d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-18d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 0.0000980665d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.000980665;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 0.0980665d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 0.980665d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 9806650d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.980665d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.2046226E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 0.0022046226d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  0.0352739619d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 0.0709316353d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 0.0709316353d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceKilogramForce() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  1000d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-18d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 0.0980665d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.980665;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 98.0665d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 9806650d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 980665E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 980665d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 0.0022046226d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 2.2046226d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  35.27396195d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 70.931635284d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 70.931635284d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceTonForce() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  1000000d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  1000d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 98.0665d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 980.665;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 98066.5d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 980665d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 9806650d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E+18d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 980665000d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 980665d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.2046226219d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 2204.6226219d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  35273.96195d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 70931.635284d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 70931.635284d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 1000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceExaNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E+20d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E+17d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E+14d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+19d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+20d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+27d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+30d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+33d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 1.0E+23d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+20d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E+14d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E+17d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  3.5969430896E+18d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 7.2330138512099E+18d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 7.2330138512099E+18d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E+20d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E+17d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forcePetaNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E+17d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E+14d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E+11d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+13d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+27d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+30d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 1.0E+20d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E+11d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E+14d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  3.5969430896E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 7.2330138512099E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 7.2330138512099E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E+17d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E+14d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceTeraNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E+14d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E+11d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E+8d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+10d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+11d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+13d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+27d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E+8d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E+11d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  3.5969430896E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 7.2330138512099E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 7.2330138512099E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E+14d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E+11d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceGigaNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  101971621297.79d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  101971621.29779d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+10d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+11d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+11d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 224808.9431d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 224808943.1d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  3596943089.6d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 7233013851.2099d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 7233013851.2099d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 101971621297.79d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 101971621.29779d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceMegaNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  101971621.29779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 1.0E+11d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 224.8089431d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 224808.9431d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  3596943.0896d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 7233013.8512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 7233013.8512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 101971621.29779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceKiloNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 0.2248089431d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 224.8089431d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  3596.9430896d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 7233.0138512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 7233.0138512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceHectoNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  0.010197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 0.0000001d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+11d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 0.02248089431d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 22.48089431d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  359.69430896d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 723.30138512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 723.30138512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 10197.162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceDecaNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  1019.7162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  0.0010197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+10d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+13d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 0.002248089431d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  35.969430896d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 72.330138512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 72.330138512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 1019.7162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceDeciNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  0.010197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-5d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-19d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+8d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+11d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E-5d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 0.02248089431d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  0.35969430896d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 0.72330138512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 0.72330138512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 10.197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 0.010197162129779d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceCentiNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  0.0010197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-20d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+10d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+13d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 0.002248089431d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  0.035969430896d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 0.072330138512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 0.072330138512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 0.0010197162129779d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceMilliNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  0.00010197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue *0.1;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 0.0002248089431d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  0.0035969430896d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 0.0072330138512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 0.0072330138512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 0.00010197162129779d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceMicroNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-4d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 0.0001;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 0.001;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+6d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue * 3.5969430896E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 7.2330138512099E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 7.2330138512099E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-4d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-7d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceNanoNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-13d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-27d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 0.000001;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 0.001;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+6d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E-13d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue * 3.5969430896E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 7.2330138512099E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 7.2330138512099E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-10d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forcePicoNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-13d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-16d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-30d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-27d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 0.000001;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 0.001;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E-16d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E-13d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue * 3.5969430896E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 7.2330138512099E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 7.2330138512099E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-13d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceFemtoNewton() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-13d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-16d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-19d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-33d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-30d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-27d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E-19d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E-16d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue * 3.5969430896E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 7.2330138512099E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 7.2330138512099E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-13d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-16d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceDyne() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  0.0010197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-23d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-20d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+10d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  3.5969430896E-5d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 7.2330138512E-5d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 7.2330138512E-5d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 0.0010197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-6d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceJoulePerMeter() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  0.10197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-4d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 0.0002248089d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 0.2248089431d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  3.5969430896d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 7.2330138512d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 7.2330138512d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 101.97162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 0.10197162129779d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceJoulePerCentieter() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  0.0010197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.0197162129779E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-20d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+7d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+10d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 1.0E+13d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.248089431E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 0.002248089431d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  0.035969430896d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 0.072330138512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 0.072330138512099d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 0.0010197162129779d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceKilopoundForce() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 4448.221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  453592.37d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  453.59237d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  0.45359237d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 4.448221615254772E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 4.448221615254772E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 4.448221615254772E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 4.448221615254772E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 0.004448221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 4.448221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 44.48221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 444.8221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 44482.21615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 444822.1615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 4448221.615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 4448221615.254772d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 4448221615254.772d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 4448221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 4448221615254771000d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 444822161.5254772d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 4448.221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 444822.1615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  16000d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 32174.048556d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 32174.048556d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 453592.37d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 453.59237d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forcePoundForce() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 4.448221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  453.59237d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  0.45359237d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  0.00045359237d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 4.448221615254772E-18d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 4.448221615254772E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 4.448221615254772E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 4.448221615254772E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 4.448221615254772E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 0.004448221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 0.04448221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.4448221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 44.48221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 444.8221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 4448.221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 4448221.615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 4448221615.254772d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 4448221615254.772d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 4448221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 444822.1615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 4.448221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 444.8221615254772d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  16d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 32.174048556d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 32.174048556d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 453.59237d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 0.45359237d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forceOunceForce() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 0.27801385095342323d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  28.349523125d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  0.028349523125d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  2.8349523125E-5d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 2.7801385095342323E-19d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 2.7801385095342323E-16d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 2.7801385095342323E-13d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 2.7801385095342323E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 2.7801385095342323E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 2.7801385095342323E-4d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 2.7801385095342323E-3d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.027801385095342323d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 2.7801385095342323d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 27.801385095342323d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 278.01385095342323d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 278013.85095342323d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 278013850.95342323d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 278013850953.42323d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 278013850953423.23d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 27801.385095342323d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 0.27801385095342323d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 27.801385095342323d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 0.0000625d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 0.0625d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 2.0108780348d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 2.0108780348d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 28.349523125d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 0.028349523125d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forcePoundal() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 0.138254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  14.09808185d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  0.01409808185d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.409808185E-5d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.38254954376E-19d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.38254954376E-16d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.38254954376E-13d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.38254954376E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1.38254954376E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 1.38254954376E-4d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 0.00138254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.0138254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 1.38254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 13.8254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 138.254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 138254.954376d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 138254954.376d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 138254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 138254954376000d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 13825.4954376d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 0.138254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 13.8254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 3.10809502E-5d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 0.0310809502d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  0.4972952027d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 14.09808185;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 0.01409808185;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forcePoundFootPerSquareSecond() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 0.138254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  14.09808185d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  0.01409808185d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  1.409808185E-5d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 1.38254954376E-19d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 1.38254954376E-16d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 1.38254954376E-13d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 1.38254954376E-10d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 1.38254954376E-7d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 1.38254954376E-4d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 0.00138254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.0138254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 1.38254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 13.8254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 138.254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 138254.954376d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 138254954.376d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 138254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 138254954376000d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 13825.4954376d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 0.138254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 13.8254954376d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 3.10809502E-5d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 0.0310809502d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  0.4972952027d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 14.09808185;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 0.01409808185;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void forcePond() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue *  0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  0.000001d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-21d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-18d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 0.0000980665d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.000980665;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 0.0980665;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 0.980665d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 9806650d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.980665d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 2.2046226E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 0.0022046226d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  0.0352739619d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 0.0709316353d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 0.0709316353d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void forceKilopond() {
        if (mContext.getString(R.string.string_units_list_force_newton).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_force_gram_force).equals(toUnit)) {
            toValue = fromValue *  1000d;
        } else if (mContext.getString(R.string.string_units_list_force_kilogram_force).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_force_ton_force).equals(toUnit)) {
            toValue = fromValue *  0.001d;
        } else if (mContext.getString(R.string.string_units_list_force_exanewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-18d;
        } else if (mContext.getString(R.string.string_units_list_force_petanewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-15d;
        } else if (mContext.getString(R.string.string_units_list_force_teranewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-12d;
        } else if (mContext.getString(R.string.string_units_list_force_giganewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-9d;
        } else if (mContext.getString(R.string.string_units_list_force_meganewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E-6d;
        } else if (mContext.getString(R.string.string_units_list_force_kilonewton).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_force_hectonewton).equals(toUnit)) {
            toValue = fromValue * 0.0980665d;
        } else if (mContext.getString(R.string.string_units_list_force_decanewton).equals(toUnit)) {
            toValue = fromValue * 0.980665;
        } else if (mContext.getString(R.string.string_units_list_force_decinewton).equals(toUnit)) {
            toValue = fromValue * 98.0665d;
        } else if (mContext.getString(R.string.string_units_list_force_centinewton).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_force_millinewton).equals(toUnit)) {
            toValue = fromValue * 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_force_micronewton).equals(toUnit)) {
            toValue = fromValue * 9806650d;
        } else if (mContext.getString(R.string.string_units_list_force_nanonewton).equals(toUnit)) {
            toValue = fromValue * 980665E+9d;
        } else if (mContext.getString(R.string.string_units_list_force_piconewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E+12d;
        } else if (mContext.getString(R.string.string_units_list_force_femtonewton).equals(toUnit)) {
            toValue = fromValue * 9.80665E+15d;
        } else if (mContext.getString(R.string.string_units_list_force_dyne).equals(toUnit)) {
            toValue = fromValue * 980665d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_meter).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_force_joule_per_centimeter).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopound_force).equals(toUnit)) {
            toValue = fromValue * 0.0022046226d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_force).equals(toUnit)) {
            toValue = fromValue * 2.2046226d;
        } else if (mContext.getString(R.string.string_units_list_force_ounce_force).equals(toUnit)) {
            toValue = fromValue *  35.27396195d;
        } else if (mContext.getString(R.string.string_units_list_force_poundal).equals(toUnit)) {
            toValue = fromValue * 70.931635284d;
        } else if (mContext.getString(R.string.string_units_list_force_pound_foot_per_square_second).equals(toUnit)) {
            toValue = fromValue * 70.931635284d;
        } else if (mContext.getString(R.string.string_units_list_force_pond).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_force_kilopond).equals(toUnit)) {
            toValue = fromValue;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }


}