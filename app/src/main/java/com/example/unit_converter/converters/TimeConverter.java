package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;

public class TimeConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public TimeConverter(Context context, String fromUnit, String toUnit, double fromValue,
                         double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_time_year).equals(fromUnit)) {
            timeYear();
        } else if (mContext.getString(R.string.string_units_list_time_month).equals(fromUnit)) {
            timeMonth();
        } else if (mContext.getString(R.string.string_units_list_time_week).equals(fromUnit)) {
            timeWeek();
        } else if (mContext.getString(R.string.string_units_list_time_day).equals(fromUnit)) {
            timeDay();
        } else if (mContext.getString(R.string.string_units_list_time_hour).equals(fromUnit)) {
            timeHour();
        } else if (mContext.getString(R.string.string_units_list_time_minute).equals(fromUnit)) {
            timeMinute();
        } else if (mContext.getString(R.string.string_units_list_time_second).equals(fromUnit)) {
            timeSecond();
        } else if (mContext.getString(R.string.string_units_list_time_millisecond).equals(fromUnit)) {
            timeMilliSecond();
        }
        else if (mContext.getString(R.string.string_units_list_time_nanosecond).equals(fromUnit)) {
            timeNanoSecond();
        }

    }

    private void timeYear() {
        if (mContext.getString(R.string.string_units_list_time_year).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_time_month).equals(toUnit)) {
            toValue = fromValue * 12d ;
        } else if (mContext.getString(R.string.string_units_list_time_week).equals(toUnit)) {
            toValue = fromValue * 52d;
        } else if (mContext.getString(R.string.string_units_list_time_day).equals(toUnit)) {
            toValue = fromValue * 365d;
        } else if (mContext.getString(R.string.string_units_list_time_hour).equals(toUnit)) {
            toValue = fromValue * 8760d;
        } else if (mContext.getString(R.string.string_units_list_time_minute).equals(toUnit)) {
            toValue = fromValue * 525600d ;
        } else if (mContext.getString(R.string.string_units_list_time_second).equals(toUnit)) {
            toValue = fromValue * 31536000d;
        } else if (mContext.getString(R.string.string_units_list_time_millisecond).equals(toUnit)) {
            toValue = fromValue  * 3.154E+10d;
        } else if (mContext.getString(R.string.string_units_list_time_nanosecond).equals(toUnit)) {
            toValue = fromValue *3.154E+16d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void timeMonth() {
        if (mContext.getString(R.string.string_units_list_time_year).equals(toUnit)) {
            toValue = fromValue*0.0833d;
        } else if (mContext.getString(R.string.string_units_list_time_month).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_time_week).equals(toUnit)) {
            toValue = (fromValue * 4.3452d );
        } else if (mContext.getString(R.string.string_units_list_time_day).equals(toUnit)) {
            toValue = (fromValue *30.4167d );
        } else if (mContext.getString(R.string.string_units_list_time_hour).equals(toUnit)) {
            toValue = (fromValue * 730d);
        } else if (mContext.getString(R.string.string_units_list_time_minute).equals(toUnit)) {
            toValue = fromValue * 43800d ;
        } else if (mContext.getString(R.string.string_units_list_time_second).equals(toUnit)) {
            toValue = fromValue *2628000d ;
        } else if (mContext.getString(R.string.string_units_list_time_millisecond).equals(toUnit)) {
            toValue = (fromValue  * 2.528E+10d);
        } else if (mContext.getString(R.string.string_units_list_time_nanosecond).equals(toUnit)) {
            toValue = (fromValue *2.528E+16d);
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void timeWeek() {
        if (mContext.getString(R.string.string_units_list_time_year).equals(toUnit)) {
            toValue = fromValue*0.0192d;
        } else if (mContext.getString(R.string.string_units_list_time_month).equals(toUnit)) {
            toValue =  fromValue*0.2301d;
        } else if (mContext.getString(R.string.string_units_list_time_week).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_time_day).equals(toUnit)) {
            toValue = (fromValue *7d );
        } else if (mContext.getString(R.string.string_units_list_time_hour).equals(toUnit)) {
            toValue = (fromValue * 168d );
        } else if (mContext.getString(R.string.string_units_list_time_minute).equals(toUnit)) {
            toValue = fromValue * 10080d ;
        } else if (mContext.getString(R.string.string_units_list_time_second).equals(toUnit)) {
            toValue = fromValue * 604800d;
        } else if (mContext.getString(R.string.string_units_list_time_millisecond).equals(toUnit)) {
            toValue = (fromValue  * 6.048E+10d);
        } else if (mContext.getString(R.string.string_units_list_time_nanosecond).equals(toUnit)) {
            toValue = (fromValue *2.528E+16d);
        }
        mToNumberTV.setText(String.valueOf(toValue));

    }

    private void timeDay() {
        if (mContext.getString(R.string.string_units_list_time_year).equals(toUnit)) {
            toValue = fromValue*0.0027d;
        } else if (mContext.getString(R.string.string_units_list_time_month).equals(toUnit)) {
            toValue = fromValue * 0.0329d;
        } else if (mContext.getString(R.string.string_units_list_time_week).equals(toUnit)) {
            toValue = (fromValue *  0.1429d);
        } else if (mContext.getString(R.string.string_units_list_time_day).equals(toUnit)) {
            toValue = (fromValue  );
        } else if (mContext.getString(R.string.string_units_list_time_hour).equals(toUnit)) {
            toValue = (fromValue *24d );
        } else if (mContext.getString(R.string.string_units_list_time_minute).equals(toUnit)) {
            toValue = fromValue * 1440d ;
        } else if (mContext.getString(R.string.string_units_list_time_second).equals(toUnit)) {
            toValue = fromValue * 86400d;
        } else if (mContext.getString(R.string.string_units_list_time_millisecond).equals(toUnit)) {
            toValue = (fromValue  * 8.640E+10d);
        } else if (mContext.getString(R.string.string_units_list_time_nanosecond).equals(toUnit)) {
            toValue = (fromValue *8.640E+16d);
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void timeHour() {
        if (mContext.getString(R.string.string_units_list_time_year).equals(toUnit)) {
            toValue = fromValue*0.0001d;
        } else if (mContext.getString(R.string.string_units_list_time_month).equals(toUnit)) {
            toValue = fromValue*0.0014d ;
        } else if (mContext.getString(R.string.string_units_list_time_week).equals(toUnit)) {
            toValue = (fromValue * 0.006d );
        } else if (mContext.getString(R.string.string_units_list_time_day).equals(toUnit)) {
            toValue = (fromValue * 0.0417d);
        } else if (mContext.getString(R.string.string_units_list_time_hour).equals(toUnit)) {
            toValue = (fromValue );
        } else if (mContext.getString(R.string.string_units_list_time_minute).equals(toUnit)) {
            toValue = fromValue *  60d;
        } else if (mContext.getString(R.string.string_units_list_time_second).equals(toUnit)) {
            toValue = fromValue *3600d ;
        } else if (mContext.getString(R.string.string_units_list_time_millisecond).equals(toUnit)) {
            toValue = (fromValue  * 3.600E+10d);
        } else if (mContext.getString(R.string.string_units_list_time_nanosecond).equals(toUnit)) {
            toValue = (fromValue *3.600E+16d);
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void timeMinute() {
        if (mContext.getString(R.string.string_units_list_time_year).equals(toUnit)) {
            toValue = fromValue/525600d;
        } else if (mContext.getString(R.string.string_units_list_time_month).equals(toUnit)) {
            toValue = fromValue/43800d ;
        } else if (mContext.getString(R.string.string_units_list_time_week).equals(toUnit)) {
            toValue = (fromValue/10080d );
        } else if (mContext.getString(R.string.string_units_list_time_day).equals(toUnit)) {
            toValue = (fromValue * 0.0007d);
        } else if (mContext.getString(R.string.string_units_list_time_hour).equals(toUnit)) {
            toValue = (fromValue *0.0167d );
        } else if (mContext.getString(R.string.string_units_list_time_minute).equals(toUnit)) {
            toValue = fromValue  ;
        } else if (mContext.getString(R.string.string_units_list_time_second).equals(toUnit)) {
            toValue = fromValue *60d ;
        } else if (mContext.getString(R.string.string_units_list_time_millisecond).equals(toUnit)) {
            toValue = (fromValue  * 60000d);
        } else if (mContext.getString(R.string.string_units_list_time_nanosecond).equals(toUnit)) {
            toValue = (fromValue *6.000E+10d);
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void timeSecond() {
        if (mContext.getString(R.string.string_units_list_time_year).equals(toUnit)) {
            toValue = fromValue/3.154E+7d;
        } else if (mContext.getString(R.string.string_units_list_time_month).equals(toUnit)) {
            toValue = fromValue/2.628E+6d ;
        } else if (mContext.getString(R.string.string_units_list_time_week).equals(toUnit)) {
            toValue = (fromValue /604800d);
        } else if (mContext.getString(R.string.string_units_list_time_day).equals(toUnit)) {
            toValue = (fromValue *86400d);
        } else if (mContext.getString(R.string.string_units_list_time_hour).equals(toUnit)) {
            toValue = (fromValue *0.0003d );
        } else if (mContext.getString(R.string.string_units_list_time_minute).equals(toUnit)) {
            toValue = fromValue *0.0167d ;
        } else if (mContext.getString(R.string.string_units_list_time_second).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_time_millisecond).equals(toUnit)) {
            toValue = (fromValue  *1000d );
        } else if (mContext.getString(R.string.string_units_list_time_nanosecond).equals(toUnit)) {
            toValue = (fromValue *1000000000d);
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void timeMilliSecond() {
        if (mContext.getString(R.string.string_units_list_time_year).equals(toUnit)) {
            toValue = fromValue/3.154e+10d;
        } else if (mContext.getString(R.string.string_units_list_time_month).equals(toUnit)) {
            toValue = fromValue/2.628e+9d;
        } else if (mContext.getString(R.string.string_units_list_time_week).equals(toUnit)) {
            toValue = (fromValue /6.048e+8d  );
        } else if (mContext.getString(R.string.string_units_list_time_day).equals(toUnit)) {
            toValue = (fromValue /8.64e+7d );
        } else if (mContext.getString(R.string.string_units_list_time_hour).equals(toUnit)) {
            toValue = (fromValue /3.6E+6d);
        } else if (mContext.getString(R.string.string_units_list_time_minute).equals(toUnit)) {
            toValue = fromValue/60000d ;
        } else if (mContext.getString(R.string.string_units_list_time_second).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_time_millisecond).equals(toUnit)) {
            toValue = (fromValue );
        } else if (mContext.getString(R.string.string_units_list_time_nanosecond).equals(toUnit)) {
            toValue = (fromValue *1000000d);
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void timeNanoSecond() {
        if (mContext.getString(R.string.string_units_list_time_year).equals(toUnit)) {
            toValue = fromValue/3.154e+16d;
        } else if (mContext.getString(R.string.string_units_list_time_month).equals(toUnit)) {
            toValue = fromValue/2.628E+15d;
        } else if (mContext.getString(R.string.string_units_list_time_week).equals(toUnit)) {
            toValue = (fromValue /6.048e+14d );
        } else if (mContext.getString(R.string.string_units_list_time_day).equals(toUnit)) {
            toValue = (fromValue /8.64E+13d );
        } else if (mContext.getString(R.string.string_units_list_time_hour).equals(toUnit)) {
            toValue = (fromValue /3.6E+12d);
        } else if (mContext.getString(R.string.string_units_list_time_minute).equals(toUnit)) {
            toValue = fromValue *6E+10d ;
        } else if (mContext.getString(R.string.string_units_list_time_second).equals(toUnit)) {
            toValue = fromValue/ 1E+9d;
        } else if (mContext.getString(R.string.string_units_list_time_millisecond).equals(toUnit)) {
            toValue = (fromValue /1E+6d);
        } else if (mContext.getString(R.string.string_units_list_time_nanosecond).equals(toUnit)) {
            toValue = (fromValue);
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }


}