package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;

public class AngleConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public AngleConverter(Context context, String fromUnit, String toUnit, double fromValue,
                          double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_angle_radian).equals(fromUnit)) {
            angleRadian();
        } else if (mContext.getString(R.string.string_units_list_angle_second).equals(fromUnit)) {
            angleSecond();
        } else if (mContext.getString(R.string.string_units_list_angle_minute).equals(fromUnit)) {
            angleMinute();
        } else if (mContext.getString(R.string.string_units_list_angle_degree).equals(fromUnit)) {
            angleDegree();
        } else if (mContext.getString(R.string.string_units_list_angle_gradian).equals(fromUnit)) {
            angleGradian();
        } else if (mContext.getString(R.string.string_units_list_angle_percentslope).equals(fromUnit)) {
            anglePercentSlope();
        } else if (mContext.getString(R.string.string_units_list_angle_circle).equals(fromUnit)) {
            angleCircle();
        } else if (mContext.getString(R.string.string_units_list_angle_mil).equals(fromUnit)) {
            angleMil();
        }

    }

    private void angleRadian() {
        if (mContext.getString(R.string.string_units_list_angle_radian).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_angle_second).equals(toUnit)) {
            toValue = fromValue * 206264.806d;
        } else if (mContext.getString(R.string.string_units_list_angle_minute).equals(toUnit)) {
            toValue = fromValue * 3437.74677d;
        } else if (mContext.getString(R.string.string_units_list_angle_degree).equals(toUnit)) {
            toValue = fromValue * 57.29572d;
        } else if (mContext.getString(R.string.string_units_list_angle_gradian).equals(toUnit)) {
            toValue = fromValue * 63.661977d;
        } else if (mContext.getString(R.string.string_units_list_angle_percentslope).equals(toUnit)) {
            toValue = fromValue * 155.740772d;
        } else if (mContext.getString(R.string.string_units_list_angle_circle).equals(toUnit)) {
            toValue = fromValue * 0.159155d;
        } else if (mContext.getString(R.string.string_units_list_angle_mil).equals(toUnit)) {
            toValue = fromValue * 1018.59164d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void angleSecond() {
        if (mContext.getString(R.string.string_units_list_angle_radian).equals(toUnit)) {
            toValue = fromValue*0.000005;
        } else if (mContext.getString(R.string.string_units_list_angle_second).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_angle_minute).equals(toUnit)) {
            toValue = fromValue * 0.016667d;
        } else if (mContext.getString(R.string.string_units_list_angle_degree).equals(toUnit)) {
            toValue = fromValue * 0.000278d;
        } else if (mContext.getString(R.string.string_units_list_angle_gradian).equals(toUnit)) {
            toValue = fromValue * 0.000309d;
        } else if (mContext.getString(R.string.string_units_list_angle_percentslope).equals(toUnit)) {
            toValue = fromValue * 0.000485;
        } else if (mContext.getString(R.string.string_units_list_angle_circle).equals(toUnit)) {
            toValue = fromValue * 7.716E-7d;
        } else if (mContext.getString(R.string.string_units_list_angle_mil).equals(toUnit)) {
            toValue = fromValue * 0.00463d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void angleMinute() {
        if (mContext.getString(R.string.string_units_list_angle_radian).equals(toUnit)) {
            toValue = fromValue*0.000291d;
        } else if (mContext.getString(R.string.string_units_list_angle_second).equals(toUnit)) {
            toValue = fromValue * 60d;
        } else if (mContext.getString(R.string.string_units_list_angle_minute).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_angle_degree).equals(toUnit)) {
            toValue = fromValue * 0.016667d;
        } else if (mContext.getString(R.string.string_units_list_angle_gradian).equals(toUnit)) {
            toValue = fromValue * 0.018519d;
        } else if (mContext.getString(R.string.string_units_list_angle_percentslope).equals(toUnit)) {
            toValue = fromValue * 0.029089d;
        } else if (mContext.getString(R.string.string_units_list_angle_circle).equals(toUnit)) {
            toValue = fromValue * 0.000046d;
        } else if (mContext.getString(R.string.string_units_list_angle_mil).equals(toUnit)) {
            toValue = fromValue * 0.277778d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void angleDegree() {
        if (mContext.getString(R.string.string_units_list_angle_radian).equals(toUnit)) {
            toValue = fromValue*0.017453d;
        } else if (mContext.getString(R.string.string_units_list_angle_second).equals(toUnit)) {
            toValue = fromValue * 3600d;
        } else if (mContext.getString(R.string.string_units_list_angle_minute).equals(toUnit)) {
            toValue = fromValue * 60d;
        } else if (mContext.getString(R.string.string_units_list_angle_degree).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_angle_gradian).equals(toUnit)) {
            toValue = fromValue * 1.111111d;
        } else if (mContext.getString(R.string.string_units_list_angle_percentslope).equals(toUnit)) {
            toValue = fromValue * 1.745506d;
        } else if (mContext.getString(R.string.string_units_list_angle_circle).equals(toUnit)) {
            toValue = fromValue * 0.002778d;
        } else if (mContext.getString(R.string.string_units_list_angle_mil).equals(toUnit)) {
            toValue = fromValue * 17.777778d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void angleGradian() {
        if (mContext.getString(R.string.string_units_list_angle_radian).equals(toUnit)) {
            toValue = fromValue*0.015708;
        } else if (mContext.getString(R.string.string_units_list_angle_second).equals(toUnit)) {
            toValue = fromValue * 3240d;
        } else if (mContext.getString(R.string.string_units_list_angle_minute).equals(toUnit)) {
            toValue = fromValue * 54d;
        } else if (mContext.getString(R.string.string_units_list_angle_degree).equals(toUnit)) {
            toValue = fromValue * 0.9d;
        } else if (mContext.getString(R.string.string_units_list_angle_gradian).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_angle_percentslope).equals(toUnit)) {
            toValue = fromValue * 1.570926d;
        } else if (mContext.getString(R.string.string_units_list_angle_circle).equals(toUnit)) {
            toValue = fromValue * 0.0025d;
        } else if (mContext.getString(R.string.string_units_list_angle_mil).equals(toUnit)) {
            toValue = fromValue * 16d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


    private void anglePercentSlope() {
        if (mContext.getString(R.string.string_units_list_angle_radian).equals(toUnit)) {
            toValue = fromValue*0.01d;
        } else if (mContext.getString(R.string.string_units_list_angle_second).equals(toUnit)) {
            toValue = fromValue * 2062.57931d;
        } else if (mContext.getString(R.string.string_units_list_angle_minute).equals(toUnit)) {
            toValue = fromValue * 34.376322d;
        } else if (mContext.getString(R.string.string_units_list_angle_degree).equals(toUnit)) {
            toValue = fromValue * 0.572939d;
        } else if (mContext.getString(R.string.string_units_list_angle_gradian).equals(toUnit)) {
            toValue = fromValue * 0.636599d;
        } else if (mContext.getString(R.string.string_units_list_angle_percentslope).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_angle_circle).equals(toUnit)) {
            toValue = fromValue * 0.001591d;
        } else if (mContext.getString(R.string.string_units_list_angle_mil).equals(toUnit)) {
            toValue = fromValue * 10.185577d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }



    private void angleCircle() {
        if (mContext.getString(R.string.string_units_list_angle_radian).equals(toUnit)) {
            toValue = fromValue*6.283185d;
        } else if (mContext.getString(R.string.string_units_list_angle_second).equals(toUnit)) {
            toValue = fromValue * 1296000d;
        } else if (mContext.getString(R.string.string_units_list_angle_minute).equals(toUnit)) {
            toValue = fromValue * 21600d;
        } else if (mContext.getString(R.string.string_units_list_angle_degree).equals(toUnit)) {
            toValue = fromValue * 360d;
        } else if (mContext.getString(R.string.string_units_list_angle_gradian).equals(toUnit)) {
            toValue = fromValue * 400d;
        } else if (mContext.getString(R.string.string_units_list_angle_percentslope).equals(toUnit)) {
            toValue = fromValue * 0d;
        } else if (mContext.getString(R.string.string_units_list_angle_circle).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_angle_mil).equals(toUnit)) {
            toValue = fromValue * 6400d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }






    private void angleMil() {
        if (mContext.getString(R.string.string_units_list_angle_radian).equals(toUnit)) {
            toValue = fromValue*0.000982d;
        } else if (mContext.getString(R.string.string_units_list_angle_second).equals(toUnit)) {
            toValue = fromValue * 202.5d;
        } else if (mContext.getString(R.string.string_units_list_angle_minute).equals(toUnit)) {
            toValue = fromValue * 3.375d;
        } else if (mContext.getString(R.string.string_units_list_angle_degree).equals(toUnit)) {
            toValue = fromValue * 0.05625d;
        } else if (mContext.getString(R.string.string_units_list_angle_gradian).equals(toUnit)) {
            toValue = fromValue * 0.0625d;
        } else if (mContext.getString(R.string.string_units_list_angle_percentslope).equals(toUnit)) {
            toValue = fromValue * 0.098715d;
        } else if (mContext.getString(R.string.string_units_list_angle_circle).equals(toUnit)) {
            toValue = fromValue * 0.000156d;
        } else if (mContext.getString(R.string.string_units_list_angle_mil).equals(toUnit)) {
            toValue = fromValue ;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }


}
