package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;

public class PressureConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public PressureConverter(Context context, String fromUnit, String toUnit, double fromValue,
                             double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_pressure_megapascal).equals(fromUnit)) {
            pressureMegapascal();
        } else if (mContext.getString(R.string.string_units_list_pressure_kilopascal).equals(fromUnit)) {
            pressureKiloPascal();
        } else if (mContext.getString(R.string.string_units_list_pressure_pascal).equals(fromUnit)) {
            pressurePascal();
        } else if (mContext.getString(R.string.string_units_list_pressure_bar).equals(fromUnit)) {
            pressureBar();
        } else if (mContext.getString(R.string.string_units_list_pressure_psi).equals(fromUnit)) {
            pressurePsi();
        } else if (mContext.getString(R.string.string_units_list_pressure_psf).equals(fromUnit)) {
            pressurePsf();
        } else if (mContext.getString(R.string.string_units_list_pressure_atmosphere).equals(fromUnit)) {
            pressureAtmosphere();
        } else if (mContext.getString(R.string.string_units_list_pressure_technicalatm).equals(fromUnit)) {
            pressureTechnicalatm();
        } else if (mContext.getString(R.string.string_units_list_pressure_mmhg).equals(fromUnit)) {
            pressureMmhg();
        } else if (mContext.getString(R.string.string_units_list_pressure_torr).equals(fromUnit)) {
            pressureTorr();
        }

    }

    private void pressureMegapascal() {
        if (mContext.getString(R.string.string_units_list_pressure_megapascal).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_pressure_kilopascal).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_pressure_pascal).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_pressure_bar).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psi).equals(toUnit)) {
            toValue = fromValue * 145.0377d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psf).equals(toUnit)) {
            toValue = fromValue * 20885.4342d;
        } else if (mContext.getString(R.string.string_units_list_pressure_atmosphere).equals(toUnit)) {
            toValue = fromValue * 9.8692d;
        } else if (mContext.getString(R.string.string_units_list_pressure_technicalatm).equals(toUnit)) {
            toValue = fromValue * 10.1972d;
        } else if (mContext.getString(R.string.string_units_list_pressure_mmhg).equals(toUnit)) {
            toValue = fromValue * 7500.6158d;
        } else if (mContext.getString(R.string.string_units_list_pressure_torr).equals(toUnit)) {
            toValue = fromValue * 7500.6168d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void pressureKiloPascal() {
        if (mContext.getString(R.string.string_units_list_pressure_megapascal).equals(toUnit)) {
            toValue = fromValue*0.001d;
        } else if (mContext.getString(R.string.string_units_list_pressure_kilopascal).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_pressure_pascal).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_pressure_bar).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psi).equals(toUnit)) {
            toValue = fromValue * 0.145d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psf).equals(toUnit)) {
            toValue = fromValue * 20.8854d;
        } else if (mContext.getString(R.string.string_units_list_pressure_atmosphere).equals(toUnit)) {
            toValue = fromValue * 0.0099d;
        } else if (mContext.getString(R.string.string_units_list_pressure_technicalatm).equals(toUnit)) {
            toValue = fromValue *0.0102d;
        } else if (mContext.getString(R.string.string_units_list_pressure_mmhg).equals(toUnit)) {
            toValue = fromValue * 7.5006d;
        } else if (mContext.getString(R.string.string_units_list_pressure_torr).equals(toUnit)) {
            toValue = fromValue * 7.5006d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void pressurePascal() {


        if (mContext.getString(R.string.string_units_list_pressure_megapascal).equals(toUnit)) {
            toValue = fromValue/1E+6d;
        } else if (mContext.getString(R.string.string_units_list_pressure_kilopascal).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_pressure_pascal).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_pressure_bar).equals(toUnit)) {
            toValue = fromValue /100000d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psi).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psf).equals(toUnit)) {
            toValue = fromValue * 0.0209d;
        } else if (mContext.getString(R.string.string_units_list_pressure_atmosphere).equals(toUnit)) {
            toValue = fromValue /101325d;
        } else if (mContext.getString(R.string.string_units_list_pressure_technicalatm).equals(toUnit)) {
            toValue = fromValue * 0d;
        } else if (mContext.getString(R.string.string_units_list_pressure_mmhg).equals(toUnit)) {
            toValue = fromValue * 0.0075d;
        } else if (mContext.getString(R.string.string_units_list_pressure_torr).equals(toUnit)) {
            toValue = fromValue * 0.0075d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void pressureBar() {
        if (mContext.getString(R.string.string_units_list_pressure_megapascal).equals(toUnit)) {
            toValue = fromValue*0.1d;
        } else if (mContext.getString(R.string.string_units_list_pressure_kilopascal).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_pressure_pascal).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_pressure_bar).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_pressure_psi).equals(toUnit)) {
            toValue = fromValue * 14.5308d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psf).equals(toUnit)) {
            toValue = fromValue * 2088.5434d;
        } else if (mContext.getString(R.string.string_units_list_pressure_atmosphere).equals(toUnit)) {
            toValue = fromValue * 0.9869d;
        } else if (mContext.getString(R.string.string_units_list_pressure_technicalatm).equals(toUnit)) {
            toValue = fromValue * 1.0197d;
        } else if (mContext.getString(R.string.string_units_list_pressure_mmhg).equals(toUnit)) {
            toValue = fromValue * 750.0616d;
        } else if (mContext.getString(R.string.string_units_list_pressure_torr).equals(toUnit)) {
            toValue = fromValue * 750.0617d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void pressurePsi() {
        if (mContext.getString(R.string.string_units_list_pressure_megapascal).equals(toUnit)) {
            toValue = fromValue*0.0069d;
        } else if (mContext.getString(R.string.string_units_list_pressure_kilopascal).equals(toUnit)) {
            toValue = fromValue * 6.8948d;
        } else if (mContext.getString(R.string.string_units_list_pressure_pascal).equals(toUnit)) {
            toValue = fromValue * 6894.7573d;
        } else if (mContext.getString(R.string.string_units_list_pressure_bar).equals(toUnit)) {
            toValue = fromValue * 0.0689d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psi).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_pressure_psf).equals(toUnit)) {
            toValue = fromValue * 144d;
        } else if (mContext.getString(R.string.string_units_list_pressure_atmosphere).equals(toUnit)) {
            toValue = fromValue * 0.068d;
        } else if (mContext.getString(R.string.string_units_list_pressure_technicalatm).equals(toUnit)) {
            toValue = fromValue * 0.0703d;
        } else if (mContext.getString(R.string.string_units_list_pressure_mmhg).equals(toUnit)) {
            toValue = fromValue * 51.7149d;
        } else if (mContext.getString(R.string.string_units_list_pressure_torr).equals(toUnit)) {
            toValue = fromValue * 51.7149d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void pressurePsf() {
        if (mContext.getString(R.string.string_units_list_pressure_megapascal).equals(toUnit)) {
            toValue = fromValue*20885d;
        } else if (mContext.getString(R.string.string_units_list_pressure_kilopascal).equals(toUnit)) {
            toValue = fromValue * 0.0479d;
        } else if (mContext.getString(R.string.string_units_list_pressure_pascal).equals(toUnit)) {
            toValue = fromValue * 47.8803d;
        } else if (mContext.getString(R.string.string_units_list_pressure_bar).equals(toUnit)) {
            toValue = fromValue * 0.0005d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psi).equals(toUnit)) {
            toValue = fromValue * 0.0069d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psf).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_pressure_atmosphere).equals(toUnit)) {
            toValue = fromValue * 0.0005d;
        } else if (mContext.getString(R.string.string_units_list_pressure_technicalatm).equals(toUnit)) {
            toValue = fromValue * 0.0005d;
        } else if (mContext.getString(R.string.string_units_list_pressure_mmhg).equals(toUnit)) {
            toValue = fromValue * 0.3591d;
        } else if (mContext.getString(R.string.string_units_list_pressure_torr).equals(toUnit)) {
            toValue = fromValue * 0.3591d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void pressureAtmosphere() {
        if (mContext.getString(R.string.string_units_list_pressure_megapascal).equals(toUnit)) {
            toValue = fromValue*0.1013d;
        } else if (mContext.getString(R.string.string_units_list_pressure_kilopascal).equals(toUnit)) {
            toValue = fromValue * 101.35d;
        } else if (mContext.getString(R.string.string_units_list_pressure_pascal).equals(toUnit)) {
            toValue = fromValue * 10135d;
        } else if (mContext.getString(R.string.string_units_list_pressure_bar).equals(toUnit)) {
            toValue = fromValue * 1.0132d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psi).equals(toUnit)) {
            toValue = fromValue * 14.6959d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psf).equals(toUnit)) {
            toValue = fromValue * 2116.2166d;
        } else if (mContext.getString(R.string.string_units_list_pressure_atmosphere).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_pressure_technicalatm).equals(toUnit)) {
            toValue = fromValue * 1.0332d;
        } else if (mContext.getString(R.string.string_units_list_pressure_mmhg).equals(toUnit)) {
            toValue = fromValue * 759.9999d;
        } else if (mContext.getString(R.string.string_units_list_pressure_torr).equals(toUnit)) {
            toValue = fromValue * 760d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void pressureTechnicalatm() {
        if (mContext.getString(R.string.string_units_list_pressure_megapascal).equals(toUnit)) {
            toValue = fromValue*0.0981d;
        } else if (mContext.getString(R.string.string_units_list_pressure_kilopascal).equals(toUnit)) {
            toValue = fromValue * 98.0665d;
        } else if (mContext.getString(R.string.string_units_list_pressure_pascal).equals(toUnit)) {
            toValue = fromValue * 98066.5d;
        } else if (mContext.getString(R.string.string_units_list_pressure_bar).equals(toUnit)) {
            toValue = fromValue * 0.9807d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psi).equals(toUnit)) {
            toValue = fromValue * 14.2233d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psf).equals(toUnit)) {
            toValue = fromValue * 2048.1616d;
        } else if (mContext.getString(R.string.string_units_list_pressure_atmosphere).equals(toUnit)) {
            toValue = fromValue * 0.9678d;
        } else if (mContext.getString(R.string.string_units_list_pressure_technicalatm).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_pressure_mmhg).equals(toUnit)) {
            toValue = fromValue * 735.5591d;
        } else if (mContext.getString(R.string.string_units_list_pressure_torr).equals(toUnit)) {
            toValue = fromValue * 735.5592d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void pressureMmhg() {
        if (mContext.getString(R.string.string_units_list_pressure_megapascal).equals(toUnit)) {
            toValue = fromValue*0.0001;
        } else if (mContext.getString(R.string.string_units_list_pressure_kilopascal).equals(toUnit)) {
            toValue = fromValue * 0.1333d;
        } else if (mContext.getString(R.string.string_units_list_pressure_pascal).equals(toUnit)) {
            toValue = fromValue * 133.3224d;
        } else if (mContext.getString(R.string.string_units_list_pressure_bar).equals(toUnit)) {
            toValue = fromValue * 0.0013d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psi).equals(toUnit)) {
            toValue = fromValue * 0.0193d;
        } else if (mContext.getString(R.string.string_units_list_pressure_psf).equals(toUnit)) {
            toValue = fromValue * 2.7845d;
        } else if (mContext.getString(R.string.string_units_list_pressure_atmosphere).equals(toUnit)) {
            toValue = fromValue * 0.0013d;
        } else if (mContext.getString(R.string.string_units_list_pressure_technicalatm).equals(toUnit)) {
            toValue = fromValue * 0.0014d;
        } else if (mContext.getString(R.string.string_units_list_pressure_mmhg).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_pressure_torr).equals(toUnit)) {
            toValue = fromValue * 1d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void pressureTorr() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            if (mContext.getString(R.string.string_units_list_pressure_megapascal).equals(toUnit)) {
                toValue = fromValue*0.0001d;
            } else if (mContext.getString(R.string.string_units_list_pressure_kilopascal).equals(toUnit)) {
                toValue = fromValue * 0.1333d;
            } else if (mContext.getString(R.string.string_units_list_pressure_pascal).equals(toUnit)) {
                toValue = fromValue * 133.3244d;
            } else if (mContext.getString(R.string.string_units_list_pressure_bar).equals(toUnit)) {
                toValue = fromValue * 0.0013d;
            } else if (mContext.getString(R.string.string_units_list_pressure_psi).equals(toUnit)) {
                toValue = fromValue * 0.0913d;
            } else if (mContext.getString(R.string.string_units_list_pressure_psf).equals(toUnit)) {
                toValue = fromValue * 2.7845d;
            } else if (mContext.getString(R.string.string_units_list_pressure_atmosphere).equals(toUnit)) {
                toValue = fromValue * 0.0013d;
            } else if (mContext.getString(R.string.string_units_list_pressure_technicalatm).equals(toUnit)) {
                toValue = fromValue * 0.0014d;
            } else if (mContext.getString(R.string.string_units_list_pressure_mmhg).equals(toUnit)) {
                toValue = fromValue * 1d;
            } else if (mContext.getString(R.string.string_units_list_pressure_torr).equals(toUnit)) {
                toValue = fromValue ;
            }
            mToNumberTV.setText(String.valueOf(toValue));
        }
    }
}