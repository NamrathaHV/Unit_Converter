package com.example.unit_converter.converters;



import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;

public class VolumeConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public VolumeConverter(Context context, String fromUnit, String toUnit, double fromValue,
                           double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_volume_millilitre).equals(fromUnit)) {
            volumeMillilitre();
        } else if (mContext.getString(R.string.string_units_list_volume_decilitre).equals(fromUnit)) {
            volumeDecilitre();
        } else if (mContext.getString(R.string.string_units_list_volume_litre).equals(fromUnit)) {
            volumeLitre();
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmillimeter).equals(fromUnit)) {
            volumeCubicmillimeter();
        } else if (mContext.getString(R.string.string_units_list_volume_cubiccentimeter).equals(fromUnit)) {
            volumeCubiccentimeter();
        } else if (mContext.getString(R.string.string_units_list_volume_cubicdecimeter).equals(fromUnit)) {
            volumeCubicdecimeter();
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmeter).equals(fromUnit)) {
            volumeCubicmeter();
        } else if (mContext.getString(R.string.string_units_list_volume_cubicinch).equals(fromUnit)) {
            volumeCubicinch();
        } else if (mContext.getString(R.string.string_units_list_volume_cubicfeet).equals(fromUnit)) {
            volumeCubicfeet();
        } else if (mContext.getString(R.string.string_units_list_volume_cubicyard).equals(fromUnit)) {
            volumeCubicyard();
        } else if (mContext.getString(R.string.string_units_list_volume_gallon).equals(fromUnit)) {
            volumeGallon();
        } else if (mContext.getString(R.string.string_units_list_volume_pints).equals(fromUnit)) {
            volumePints();
        } else if (mContext.getString(R.string.string_units_list_volume_brass).equals(fromUnit)) {
            volumeBrass();
        }

    }

    private void volumeMillilitre() {
        if (mContext.getString(R.string.string_units_list_volume_millilitre).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_volume_decilitre).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_volume_litre).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmillimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubiccentimeter).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicdecimeter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmeter).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicinch).equals(toUnit)) {
            toValue = fromValue * 0.061024d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicfeet).equals(toUnit)) {
            toValue = fromValue * 0.000035d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicyard).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_volume_gallon).equals(toUnit)) {
            toValue = fromValue * 0.000264d;
        } else if (mContext.getString(R.string.string_units_list_volume_pints).equals(toUnit)) {
            toValue = fromValue * 0.002113d;
        } else if (mContext.getString(R.string.string_units_list_volume_brass).equals(toUnit)) {
            toValue = fromValue * 3.5315E-7d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void volumeDecilitre() {
        if (mContext.getString(R.string.string_units_list_volume_millilitre).equals(toUnit)) {
            toValue = fromValue*100d;
        } else if (mContext.getString(R.string.string_units_list_volume_decilitre).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_volume_litre).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmillimeter).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubiccentimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicdecimeter).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmeter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicinch).equals(toUnit)) {
            toValue = fromValue * 6.102374d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicfeet).equals(toUnit)) {
            toValue = fromValue * 0.003531d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicyard).equals(toUnit)) {
            toValue = fromValue * 0.000131d;
        } else if (mContext.getString(R.string.string_units_list_volume_gallon).equals(toUnit)) {
            toValue = fromValue * 0.026417d;
        } else if (mContext.getString(R.string.string_units_list_volume_pints).equals(toUnit)) {
            toValue = fromValue * 0.211338d;
        } else if (mContext.getString(R.string.string_units_list_volume_brass).equals(toUnit)) {
            toValue = fromValue * 0.000035d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void volumeLitre() {


        if (mContext.getString(R.string.string_units_list_volume_millilitre).equals(toUnit)) {
            toValue = fromValue*1000d;
        } else if (mContext.getString(R.string.string_units_list_volume_decilitre).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_volume_litre).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmillimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubiccentimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicdecimeter).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmeter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicinch).equals(toUnit)) {
            toValue = fromValue * 61.023744d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicfeet).equals(toUnit)) {
            toValue = fromValue * 0.035315d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicyard).equals(toUnit)) {
            toValue = fromValue * 0.001308d;
        } else if (mContext.getString(R.string.string_units_list_volume_gallon).equals(toUnit)) {
            toValue = fromValue * 0.264172d;
        } else if (mContext.getString(R.string.string_units_list_volume_pints).equals(toUnit)) {
            toValue = fromValue * 2.113376d;
        } else if (mContext.getString(R.string.string_units_list_volume_brass).equals(toUnit)) {
            toValue = fromValue * 0.000353;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void volumeCubicmillimeter() {
        if (mContext.getString(R.string.string_units_list_volume_millilitre).equals(toUnit)) {
            toValue = fromValue*0.001d;
        } else if (mContext.getString(R.string.string_units_list_volume_decilitre).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_volume_litre).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmillimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_volume_cubiccentimeter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicdecimeter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicinch).equals(toUnit)) {
            toValue = fromValue * 0.000061d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicfeet).equals(toUnit)) {
            toValue = fromValue * 3.5315E-8d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicyard).equals(toUnit)) {
            toValue = fromValue * 1.308E-9d;
        } else if (mContext.getString(R.string.string_units_list_volume_gallon).equals(toUnit)) {
            toValue = fromValue * 2.6417E-7d;
        } else if (mContext.getString(R.string.string_units_list_volume_pints).equals(toUnit)) {
            toValue = fromValue * 0.000002d;
        } else if (mContext.getString(R.string.string_units_list_volume_brass).equals(toUnit)) {
            toValue = fromValue * 3.5315E-10d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void volumeCubiccentimeter() {
        if (mContext.getString(R.string.string_units_list_volume_millilitre).equals(toUnit)) {
            toValue = fromValue*1d;
        } else if (mContext.getString(R.string.string_units_list_volume_decilitre).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_volume_litre).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmillimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubiccentimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicdecimeter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmeter).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicinch).equals(toUnit)) {
            toValue = fromValue * 0.061024d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicfeet).equals(toUnit)) {
            toValue = fromValue * 0.000035d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicyard).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_volume_gallon).equals(toUnit)) {
            toValue = fromValue * 0.0000264d;
        } else if (mContext.getString(R.string.string_units_list_volume_pints).equals(toUnit)) {
            toValue = fromValue * 0.002113d;
        } else if (mContext.getString(R.string.string_units_list_volume_brass).equals(toUnit)) {
            toValue = fromValue * 3.5315E-7d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void volumeCubicdecimeter() {
        if (mContext.getString(R.string.string_units_list_volume_millilitre).equals(toUnit)) {
            toValue = fromValue*1000d;
        } else if (mContext.getString(R.string.string_units_list_volume_decilitre).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_volume_litre).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmillimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubiccentimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicdecimeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmeter).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicinch).equals(toUnit)) {
            toValue = fromValue * 61.023744d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicfeet).equals(toUnit)) {
            toValue = fromValue * 0.035315d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicyard).equals(toUnit)) {
            toValue = fromValue * 0.001308d;
        } else if (mContext.getString(R.string.string_units_list_volume_gallon).equals(toUnit)) {
            toValue = fromValue * 0.264172d;
        } else if (mContext.getString(R.string.string_units_list_volume_pints).equals(toUnit)) {
            toValue = fromValue *2.113376d;
        } else if (mContext.getString(R.string.string_units_list_volume_brass).equals(toUnit)) {
            toValue = fromValue * 0.000353d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void volumeCubicmeter() {
        if (mContext.getString(R.string.string_units_list_volume_millilitre).equals(toUnit)) {
            toValue = fromValue*1000000d;
        } else if (mContext.getString(R.string.string_units_list_volume_decilitre).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_volume_litre).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmillimeter).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubiccentimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicdecimeter).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmeter).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicinch).equals(toUnit)) {
            toValue = fromValue * 61023.7441d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicfeet).equals(toUnit)) {
            toValue = fromValue *35.314667d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicyard).equals(toUnit)) {
            toValue = fromValue * 1.307951d;
        } else if (mContext.getString(R.string.string_units_list_volume_gallon).equals(toUnit)) {
            toValue = fromValue * 264.172052d;
        } else if (mContext.getString(R.string.string_units_list_volume_pints).equals(toUnit)) {
            toValue = fromValue * 2113.37642d;
        } else if (mContext.getString(R.string.string_units_list_volume_brass).equals(toUnit)) {
            toValue = fromValue *0.353147d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void volumeCubicinch() {
        if (mContext.getString(R.string.string_units_list_volume_millilitre).equals(toUnit)) {
            toValue = fromValue*16.387064d;
        } else if (mContext.getString(R.string.string_units_list_volume_decilitre).equals(toUnit)) {
            toValue = fromValue * 0.163871d;
        } else if (mContext.getString(R.string.string_units_list_volume_litre).equals(toUnit)) {
            toValue = fromValue * 0.016387d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmillimeter).equals(toUnit)) {
            toValue = fromValue * 16387.064d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubiccentimeter).equals(toUnit)) {
            toValue = fromValue * 16.387064d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicdecimeter).equals(toUnit)) {
            toValue = fromValue * 20885.4342d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmeter).equals(toUnit)) {
            toValue = fromValue * 0.000016d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicinch).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicfeet).equals(toUnit)) {
            toValue = fromValue * 0.000579d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicyard).equals(toUnit)) {
            toValue = fromValue * 0.000021d;
        } else if (mContext.getString(R.string.string_units_list_volume_gallon).equals(toUnit)) {
            toValue = fromValue * 0.004329d;
        } else if (mContext.getString(R.string.string_units_list_volume_pints).equals(toUnit)) {
            toValue = fromValue * 0.034632d;
        } else if (mContext.getString(R.string.string_units_list_volume_brass).equals(toUnit)) {
            toValue = fromValue *0.000006d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void volumeCubicfeet() {
        if (mContext.getString(R.string.string_units_list_volume_millilitre).equals(toUnit)) {
            toValue = fromValue*28316.8466d;
        } else if (mContext.getString(R.string.string_units_list_volume_decilitre).equals(toUnit)) {
            toValue = fromValue * 283.168466d;
        } else if (mContext.getString(R.string.string_units_list_volume_litre).equals(toUnit)) {
            toValue = fromValue * 28.316847d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmillimeter).equals(toUnit)) {
            toValue = fromValue * 28316846.6d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubiccentimeter).equals(toUnit)) {
            toValue = fromValue * 28316.8466d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicdecimeter).equals(toUnit)) {
            toValue = fromValue * 28.3168467d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmeter).equals(toUnit)) {
            toValue = fromValue * 0.028317d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicinch).equals(toUnit)) {
            toValue = fromValue *1728d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicfeet).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicyard).equals(toUnit)) {
            toValue = fromValue * 0.037037d;
        } else if (mContext.getString(R.string.string_units_list_volume_gallon).equals(toUnit)) {
            toValue = fromValue * 7.480519d;
        } else if (mContext.getString(R.string.string_units_list_volume_pints).equals(toUnit)) {
            toValue = fromValue * 59.844156d;
        } else if (mContext.getString(R.string.string_units_list_volume_brass).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void volumeCubicyard() {
        if (mContext.getString(R.string.string_units_list_volume_millilitre).equals(toUnit)) {
            toValue = fromValue*764554.858d;
        } else if (mContext.getString(R.string.string_units_list_volume_decilitre).equals(toUnit)) {
            toValue = fromValue *7645.54858d ;
        } else if (mContext.getString(R.string.string_units_list_volume_litre).equals(toUnit)) {
            toValue = fromValue *764.554858d ;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmillimeter).equals(toUnit)) {
            toValue = fromValue *764554858d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubiccentimeter).equals(toUnit)) {
            toValue = fromValue * 764554.858d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicdecimeter).equals(toUnit)) {
            toValue = fromValue *764.554858d ;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmeter).equals(toUnit)) {
            toValue = fromValue * 0.764555d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicinch).equals(toUnit)) {
            toValue = fromValue * 46656d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicfeet).equals(toUnit)) {
            toValue = fromValue * 27d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicyard).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_volume_gallon).equals(toUnit)) {
            toValue = fromValue * 7201.874026d;
        } else if (mContext.getString(R.string.string_units_list_volume_pints).equals(toUnit)) {
            toValue = fromValue * 1615.79221d;
        } else if (mContext.getString(R.string.string_units_list_volume_brass).equals(toUnit)) {
            toValue = fromValue * 0.27d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void volumeGallon() {
        if (mContext.getString(R.string.string_units_list_volume_millilitre).equals(toUnit)) {
            toValue = fromValue*3785.41178d;
        } else if (mContext.getString(R.string.string_units_list_volume_decilitre).equals(toUnit)) {
            toValue = fromValue * 37.8541178d;
        } else if (mContext.getString(R.string.string_units_list_volume_litre).equals(toUnit)) {
            toValue = fromValue * 3.7854128d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmillimeter).equals(toUnit)) {
            toValue = fromValue *3785411.78d ;
        } else if (mContext.getString(R.string.string_units_list_volume_cubiccentimeter).equals(toUnit)) {
            toValue = fromValue * 3785.41178d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicdecimeter).equals(toUnit)) {
            toValue = fromValue * 3.785412d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmeter).equals(toUnit)) {
            toValue = fromValue * 0.003785d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicinch).equals(toUnit)) {
            toValue = fromValue * 231d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicfeet).equals(toUnit)) {
            toValue = fromValue * 0.133681d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicyard).equals(toUnit)) {
            toValue = fromValue * 0.004951d;
        } else if (mContext.getString(R.string.string_units_list_volume_gallon).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_volume_pints).equals(toUnit)) {
            toValue = fromValue * 8d;
        } else if (mContext.getString(R.string.string_units_list_volume_brass).equals(toUnit)) {
            toValue = fromValue * 0.001337d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void volumePints() {
        if (mContext.getString(R.string.string_units_list_volume_millilitre).equals(toUnit)) {
            toValue = fromValue*473.176473d;
        } else if (mContext.getString(R.string.string_units_list_volume_decilitre).equals(toUnit)) {
            toValue = fromValue * 4.731765d;
        } else if (mContext.getString(R.string.string_units_list_volume_litre).equals(toUnit)) {
            toValue = fromValue *0.473176d ;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmillimeter).equals(toUnit)) {
            toValue = fromValue * 473176.473d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubiccentimeter).equals(toUnit)) {
            toValue = fromValue * 473.176473d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicdecimeter).equals(toUnit)) {
            toValue = fromValue *0.473176d ;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmeter).equals(toUnit)) {
            toValue = fromValue * 0.000473d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicinch).equals(toUnit)) {
            toValue = fromValue * 28.875d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicfeet).equals(toUnit)) {
            toValue = fromValue * 0.01671d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicyard).equals(toUnit)) {
            toValue = fromValue * 0.000619d;
        } else if (mContext.getString(R.string.string_units_list_volume_gallon).equals(toUnit)) {
            toValue = fromValue * 0.125d;
        } else if (mContext.getString(R.string.string_units_list_volume_pints).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_volume_brass).equals(toUnit)) {
            toValue = fromValue * 0.000167d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void volumeBrass() {
        if (mContext.getString(R.string.string_units_list_volume_millilitre).equals(toUnit)) {
            toValue = fromValue*2831684.66d;
        } else if (mContext.getString(R.string.string_units_list_volume_decilitre).equals(toUnit)) {
            toValue = fromValue *28316.8466d;
        } else if (mContext.getString(R.string.string_units_list_volume_litre).equals(toUnit)) {
            toValue = fromValue *2831.68466d ;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmillimeter).equals(toUnit)) {
            toValue = fromValue *2831684659d ;
        } else if (mContext.getString(R.string.string_units_list_volume_cubiccentimeter).equals(toUnit)) {
            toValue = fromValue * 2831684.66d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicdecimeter).equals(toUnit)) {
            toValue = fromValue * 2831.68466d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicmeter).equals(toUnit)) {
            toValue = fromValue * 2.831685d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicinch).equals(toUnit)) {
            toValue = fromValue * 172800d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicfeet).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_volume_cubicyard).equals(toUnit)) {
            toValue = fromValue * 3.703704d;
        } else if (mContext.getString(R.string.string_units_list_volume_gallon).equals(toUnit)) {
            toValue = fromValue *748.051948d;
        } else if (mContext.getString(R.string.string_units_list_volume_pints).equals(toUnit)) {
            toValue = fromValue * 5984.41558d;
        } else if (mContext.getString(R.string.string_units_list_volume_brass).equals(toUnit)) {
            toValue = fromValue ;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
}

