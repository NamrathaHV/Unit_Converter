package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;

public class StorageConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public StorageConverter(Context context, String fromUnit, String toUnit, double fromValue,
                            double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_storage_bit).equals(fromUnit)) {
            storageBit();
        } else if (mContext.getString(R.string.string_units_list_storage_byte).equals(fromUnit)) {
            storageByte();
        } else if (mContext.getString(R.string.string_units_list_storage_kilobit).equals(fromUnit)) {
            storageKilobit();
        } else if (mContext.getString(R.string.string_units_list_storage_kilobyte).equals(fromUnit)) {
            storageKilobyte();
        } else if (mContext.getString(R.string.string_units_list_storage_megabit).equals(fromUnit)) {
            storageMegabit();
        } else if (mContext.getString(R.string.string_units_list_storage_megabyte).equals(fromUnit)) {
            storageMegabyte();
        } else if (mContext.getString(R.string.string_units_list_storage_gigabit).equals(fromUnit)) {
            storageGigabit();
        } else if (mContext.getString(R.string.string_units_list_storage_gigabyte).equals(fromUnit)) {
            storageGigabyte();
        } else if (mContext.getString(R.string.string_units_list_storage_terabit).equals(fromUnit)) {
            storageTerabit();
        } else if (mContext.getString(R.string.string_units_list_storage_terabyte).equals(fromUnit)) {
            storageTerabyte();
        }

    }

    private void storageBit() {
        if (mContext.getString(R.string.string_units_list_storage_bit).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_storage_byte).equals(toUnit)) {
            toValue = fromValue * 0.125d;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobit).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobyte).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_storage_megabit).equals(toUnit)) {
            toValue = fromValue /1E+6d;
        } else if (mContext.getString(R.string.string_units_list_storage_megabyte).equals(toUnit)) {
            toValue = fromValue * 0.0000001192d;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabit).equals(toUnit)) {
            toValue = fromValue /1E+9d;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabyte).equals(toUnit)) {
            toValue = fromValue /8E+9d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabit).equals(toUnit)) {
            toValue = fromValue /1E+12d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabyte).equals(toUnit)) {
            toValue = fromValue /8E+12d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void storageByte() {
        if (mContext.getString(R.string.string_units_list_storage_bit).equals(toUnit)) {
            toValue = fromValue*8d;
        } else if (mContext.getString(R.string.string_units_list_storage_byte).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobit).equals(toUnit)) {
            toValue = fromValue * 0.0078d;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobyte).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_storage_megabit).equals(toUnit)) {
            toValue = fromValue /125000d;
        } else if (mContext.getString(R.string.string_units_list_storage_megabyte).equals(toUnit)) {
            toValue = fromValue /1E+6d;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabit).equals(toUnit)) {
            toValue = fromValue /1.25E+8d;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabyte).equals(toUnit)) {
            toValue = fromValue /1E+9d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabit).equals(toUnit)) {
            toValue = fromValue /1.25E+11d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabyte).equals(toUnit)) {
            toValue = fromValue /1E+12d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void storageKilobit() {


        if (mContext.getString(R.string.string_units_list_storage_bit).equals(toUnit)) {
            toValue = fromValue*1024d;
        } else if (mContext.getString(R.string.string_units_list_storage_byte).equals(toUnit)) {
            toValue = fromValue*128d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobit).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobyte).equals(toUnit)) {
            toValue = fromValue * 0.125d;
        } else if (mContext.getString(R.string.string_units_list_storage_megabit).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_storage_megabyte).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabit).equals(toUnit)) {
            toValue = fromValue /1E+6d;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabyte).equals(toUnit)) {
            toValue = fromValue /8E+6d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabit).equals(toUnit)) {
            toValue = fromValue /1E+9d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabyte).equals(toUnit)) {
            toValue = fromValue /8E+9d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void storageKilobyte() {
        if (mContext.getString(R.string.string_units_list_storage_bit).equals(toUnit)) {
            toValue = fromValue*8192d;
        } else if (mContext.getString(R.string.string_units_list_storage_byte).equals(toUnit)) {
            toValue = fromValue*1024d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobit).equals(toUnit)) {
            toValue = fromValue*8d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobyte).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_storage_megabit).equals(toUnit)) {
            toValue = fromValue * 0.0078d;
        } else if (mContext.getString(R.string.string_units_list_storage_megabyte).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabit).equals(toUnit)) {
            toValue = fromValue /125000d;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabyte).equals(toUnit)) {
            toValue = fromValue /1E+6d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabit).equals(toUnit)) {
            toValue = fromValue /(1.25E+8d);
        } else if (mContext.getString(R.string.string_units_list_storage_terabyte).equals(toUnit)) {
            toValue = fromValue /1E+9;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void storageMegabit() {
        if (mContext.getString(R.string.string_units_list_storage_bit).equals(toUnit)) {
            toValue = fromValue*1048576d;
        } else if (mContext.getString(R.string.string_units_list_storage_byte).equals(toUnit)) {
            toValue = fromValue*131072d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobit).equals(toUnit)) {
            toValue = fromValue*1024d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobyte).equals(toUnit)) {
            toValue = fromValue*128d ;
        } else if (mContext.getString(R.string.string_units_list_storage_megabit).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_storage_megabyte).equals(toUnit)) {
            toValue = fromValue * 0.125d;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabit).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabyte).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabit).equals(toUnit)) {
            toValue = fromValue /1E+6d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabyte).equals(toUnit)) {
            toValue = fromValue /8E+6d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void storageMegabyte() {
        if (mContext.getString(R.string.string_units_list_storage_bit).equals(toUnit)) {
            toValue = fromValue*8388608d;
        } else if (mContext.getString(R.string.string_units_list_storage_byte).equals(toUnit)) {
            toValue = fromValue*1048576d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobit).equals(toUnit)) {
            toValue = fromValue*8192d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobyte).equals(toUnit)) {
            toValue = fromValue*1024d ;
        } else if (mContext.getString(R.string.string_units_list_storage_megabit).equals(toUnit)) {
            toValue = fromValue*8d ;
        } else if (mContext.getString(R.string.string_units_list_storage_megabyte).equals(toUnit)) {
            toValue = fromValue  ;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabit).equals(toUnit)) {
            toValue = fromValue * 0.0078d;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabyte).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabit).equals(toUnit)) {
            toValue = fromValue * 7.62939453125E-6d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabyte).equals(toUnit)) {
            toValue = fromValue /1E+6d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void storageGigabit() {
        if (mContext.getString(R.string.string_units_list_storage_bit).equals(toUnit)) {
            toValue = fromValue*1073741824d;
        } else if (mContext.getString(R.string.string_units_list_storage_byte).equals(toUnit)) {
            toValue = fromValue*134217728d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobit).equals(toUnit)) {
            toValue = fromValue*1048576d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobyte).equals(toUnit)) {
            toValue = fromValue*131072d ;
        } else if (mContext.getString(R.string.string_units_list_storage_megabit).equals(toUnit)) {
            toValue = fromValue*1024d ;
        } else if (mContext.getString(R.string.string_units_list_storage_megabyte).equals(toUnit)) {
            toValue = fromValue *128d ;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabit).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabyte).equals(toUnit)) {
            toValue = fromValue * 0.125d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabit).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabyte).equals(toUnit)) {
            toValue = fromValue /8000d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void storageGigabyte() {
        if (mContext.getString(R.string.string_units_list_storage_bit).equals(toUnit)) {
            toValue = fromValue*8589934592d;
        } else if (mContext.getString(R.string.string_units_list_storage_byte).equals(toUnit)) {
            toValue = fromValue*1073741824d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobit).equals(toUnit)) {
            toValue = fromValue*8388608d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobyte).equals(toUnit)) {
            toValue = fromValue*1048576d ;
        } else if (mContext.getString(R.string.string_units_list_storage_megabit).equals(toUnit)) {
            toValue = fromValue*8192d ;
        } else if (mContext.getString(R.string.string_units_list_storage_megabyte).equals(toUnit)) {
            toValue = fromValue *1024d ;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabit).equals(toUnit)) {
            toValue = fromValue*8d ;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabyte).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_storage_terabit).equals(toUnit)) {
            toValue = fromValue *0.0078d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabyte).equals(toUnit)) {
            toValue = fromValue *0.001d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void storageTerabit() {
        if (mContext.getString(R.string.string_units_list_storage_bit).equals(toUnit)) {
            toValue = fromValue*1099511627776d;
        } else if (mContext.getString(R.string.string_units_list_storage_byte).equals(toUnit)) {
            toValue = fromValue*137438953472d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobit).equals(toUnit)) {
            toValue = fromValue*1073741824d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobyte).equals(toUnit)) {
            toValue = fromValue*134217728d ;
        } else if (mContext.getString(R.string.string_units_list_storage_megabit).equals(toUnit)) {
            toValue = fromValue*1048576d ;
        } else if (mContext.getString(R.string.string_units_list_storage_megabyte).equals(toUnit)) {
            toValue = fromValue *131072d ;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabit).equals(toUnit)) {
            toValue = fromValue*1024d ;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabyte).equals(toUnit)) {
            toValue = fromValue * 128d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabit).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_storage_terabyte).equals(toUnit)) {
            toValue = fromValue * 0.125d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void storageTerabyte() {
        if (mContext.getString(R.string.string_units_list_storage_bit).equals(toUnit)) {
            toValue = fromValue*8796093022208d;
        } else if (mContext.getString(R.string.string_units_list_storage_byte).equals(toUnit)) {
            toValue = fromValue*1099511627776d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobit).equals(toUnit)) {
            toValue = fromValue*8589934592d ;
        } else if (mContext.getString(R.string.string_units_list_storage_kilobyte).equals(toUnit)) {
            toValue = fromValue*1073741824d ;
        } else if (mContext.getString(R.string.string_units_list_storage_megabit).equals(toUnit)) {
            toValue = fromValue*8388608d ;
        } else if (mContext.getString(R.string.string_units_list_storage_megabyte).equals(toUnit)) {
            toValue = fromValue *1048576d ;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabit).equals(toUnit)) {
            toValue = fromValue *8192d;
        } else if (mContext.getString(R.string.string_units_list_storage_gigabyte).equals(toUnit)) {
            toValue = fromValue *1024d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabit).equals(toUnit)) {
            toValue = fromValue * 8d;
        } else if (mContext.getString(R.string.string_units_list_storage_terabyte).equals(toUnit)) {
            toValue = fromValue ;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
}
