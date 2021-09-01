package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;
import com.example.unit_converter.R;

public class FrequencyConverter {
    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public FrequencyConverter(Context context, String fromUnit, String toUnit, double fromValue, double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(fromUnit)) {
            frequencyHertz();
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(fromUnit)) {
            frequencyNanohertz();
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(fromUnit)) {
            frequencyMicrohertz();
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(fromUnit)) {
            frequencyMillihertz();
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(fromUnit)) {
            frequencyCentihertz();
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(fromUnit)) {
            frequencyDecihertz();
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(fromUnit)) {
            frequencyDecahertz();
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(fromUnit)) {
            frequencyHectohertz();
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(fromUnit)) {
            frequencyKilohertz();
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(fromUnit)) {
            frequencyMegahertz();
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(fromUnit)) {
            frequencyGigahertz();
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(fromUnit)) {
            frequencyTerahertz();
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(fromUnit)) {
            frequencyRevsPerHour();
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(fromUnit)) {
            frequencyRevsPerMinute();
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(fromUnit)) {
            frequencyRevsPerSecond();
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(fromUnit)) {
            frequencyRadiansPerHour();
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(fromUnit)) {
            frequencyRadiansPerMinute();
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(fromUnit)) {
            frequencyRadiansPerSecond();
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(fromUnit)) {
            frequencyDegreesPerHour();
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(fromUnit)) {
            frequencyDegreesPerMinute();
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(fromUnit)) {
            frequencyDegreesPerSecond();
        }
    }

    private void frequencyHertz() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 3600d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 60d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 22619.4671d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 376.991118d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 6.28318531d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 1296000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 21600d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 360d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyNanohertz() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 0.0000036d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 6.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 0.0000226194671d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 3.76991118E-7d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 6.28318531E-9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 0.001296d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 0.0000216d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 3.6E-7d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyMicrohertz() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 0.0036d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 0.00006d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 0.0226194671d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 3.76991118E-4d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 6.28318531E-6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 1.296d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 0.0216d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 0.00036d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyMillihertz() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 3.6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 0.06d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 22.6194671d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 0.376991118d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 0.00628318531d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 1296d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 21.6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 0.36d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyCentihertz() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 0.00001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 36d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 0.6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 226.194671d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 3.76991118d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 0.0628318531d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 12960d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 216d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 3.6d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyDecihertz() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 360d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 2261.94671d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 37.6991118d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 0.628318531d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 129600d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 2160d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 36d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyDecahertz() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 36000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 600d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 226194.671d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 3769.91118d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 62.8318531d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 12960000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 216000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 3600d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyHectohertz() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+11d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 360000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 6000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 2261946.71d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 37699.1118d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 628.318531d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 129600000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 2160000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 36000d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyKilohertz() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 3600000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 60000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 22619467.1d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 376991.118d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 6283.18531d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 1296000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 21600000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 360000d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyMegahertz() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 3600000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 60000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 22619467100d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 376991118d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 6283185.31d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 1296000000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 21600000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 360000000d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyGigahertz() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+11d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 3.6E+12d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 6E+10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 1.0E+9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 2.26194671E+13d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 3.76991118E+11d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 6283185310d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 1.296E+15d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 2.16E+13d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 3.6E+11d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyTerahertz() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+13d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+11d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 1.0E+10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 3.6E+15d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 6E+13d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 1.0E+12d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 2.26194671E+16d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 3.76991118E+14d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 6283185310000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 1.296E+18d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 2.16E+16d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 3.6E+14d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyRevsPerHour() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 0.000277777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 277777.778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 277.777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 0.277777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 0.0277777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 0.00277777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 0.0000277777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 0.00000277777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 2.77777778E-7d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 2.77777778E-10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 2.77777778E-13d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 2.77777778E-16d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue / 60d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue /3600d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 6.28318531d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 0.104719755d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 0.00174532925d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 360d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyRevsPerMinute() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 0.0166666667d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 16666666.7d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 16666.6667d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 16.6666667d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 1.66666667d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 0.166666667d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 0.00166666667d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 0.000166666667d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 0.0000166666667d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 1.66666667E-8d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 1.66666667E-11d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 1.66666667E-14d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 60d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue / 60d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 376.991118d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 6.28318531d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 0.104719755d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 21600d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 360d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 6d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyRevsPerSecond() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 0.000001d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 3600d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 60d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 22619.4671d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 376.991118d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 6.28318531d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 1296000d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 21600d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 360d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyRadiansPerHour() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 4.42097064E-5d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 44209.7064d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 44.2097064d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 0.0442097064d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 0.00442097064d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 0.000442097064d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 4.42097064E-6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 4.42097064E-7d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 4.42097064E-8d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 4.42097064E-11d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 4.42097064E-14d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 4.42097064E-17d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 0.159154943d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 0.00265258238d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 4.42097064E-5d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue / 60d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue / 3600d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 57.2957795d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 0.954929659d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 0.0159154943d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyRadiansPerMinute() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 0.00265258238d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 2652582.38d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 2652.58238d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 2.65258238d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 0.265258238d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 0.0265258238d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 0.000265258238d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 2.65258238E-5d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 2.65258238E-6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 2.65258238E-9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 2.65258238E-12d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 2.65258238E-15d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 9.54929659d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 0.159154943d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 0.00265258238d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 60d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue / 60d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 3437.74677d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 57.2957795d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 0.954929659d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyRadiansPerSecond() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 0.159154943d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 159154943d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 159154.943d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 159.154943d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 15.9154943d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 1.59154943d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 0.0159154943d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 0.00159154943d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 0.000159154943d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 1.59154943E-7d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 1.59154943E-10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 1.59154943E-13d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 572.957795d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 9.54929659d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 0.159154943d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 3600;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 60;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 206264.806d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 3437.74677d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue * 57.2957795d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyDegreesPerHour() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 7.71604938E-7d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 771.604938d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 0.771604938d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 0.000771604938d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 0.0000771604938d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 7.71604938E-6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 7.71604938E-8d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 7.71604938E-9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 7.71604938E-10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 7.71604938E-13d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 7.71604938E-16d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 7.71604938E-19d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 0.00277777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue * 0.0000462962963d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 7.71604938E-7d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 0.0174532925d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 0.000290888209d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 0.00000484813681d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue / 60d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue / 3600d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyDegreesPerMinute() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 0.0000462962963d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 46296.2963d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 46.2962963d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 0.0462962963d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 0.00462962963d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 0.000462962963d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 0.00000462962963d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 4.62962963E-7d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 4.62962963E-8d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 4.62962963E-11d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 4.62962963E-14d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 4.62962963E-17d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue / 6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue / 360d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue * 0.0000462962963d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 1.04719755d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 0.0174532925d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 0.000290888209d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 60d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue / 60d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void frequencyDegreesPerSecond() {
        if (mContext.getString(R.string.string_units_list_frequency_hertz).equals(toUnit)) {
            toValue = fromValue * 0.00277777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_nanohertz).equals(toUnit)) {
            toValue = fromValue * 2777777.78d;
        } else if (mContext.getString(R.string.string_units_list_frequency_microhertz).equals(toUnit)) {
            toValue = fromValue * 2777.77778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_millihertz).equals(toUnit)) {
            toValue = fromValue * 2.77777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_centihertz).equals(toUnit)) {
            toValue = fromValue * 0.277777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decihertz).equals(toUnit)) {
            toValue = fromValue * 0.0277777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_decahertz).equals(toUnit)) {
            toValue = fromValue * 0.000277777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_hectohertz).equals(toUnit)) {
            toValue = fromValue * 0.0000277777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_kilohertz).equals(toUnit)) {
            toValue = fromValue * 0.00000277777778d;
        } else if (mContext.getString(R.string.string_units_list_frequency_megahertz).equals(toUnit)) {
            toValue = fromValue * 2.77777778E-9d;
        } else if (mContext.getString(R.string.string_units_list_frequency_gigahertz).equals(toUnit)) {
            toValue = fromValue * 2.77777778E-12d;
        } else if (mContext.getString(R.string.string_units_list_frequency_terahertz).equals(toUnit)) {
            toValue = fromValue * 2.77777778E-15d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_hour).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_minute).equals(toUnit)) {
            toValue = fromValue / 6d;
        } else if (mContext.getString(R.string.string_units_list_frequency_revs_per_second).equals(toUnit)) {
            toValue = fromValue / 360d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_hour).equals(toUnit)) {
            toValue = fromValue * 62.8318531;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_minute).equals(toUnit)) {
            toValue = fromValue * 1.04719755d;
        } else if (mContext.getString(R.string.string_units_list_frequency_radians_per_second).equals(toUnit)) {
            toValue = fromValue * 0.0174532925d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_hour).equals(toUnit)) {
            toValue = fromValue * 3600d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_minute).equals(toUnit)) {
            toValue = fromValue * 60d;
        } else if (mContext.getString(R.string.string_units_list_frequency_degrees_per_second).equals(toUnit)) {
            toValue = fromValue;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

}
