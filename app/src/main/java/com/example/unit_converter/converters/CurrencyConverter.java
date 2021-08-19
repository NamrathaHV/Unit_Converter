package com.example.unit_converter.converters;

import android.content.Context;
import android.widget.TextView;

import com.example.unit_converter.R;

public class CurrencyConverter {
    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public CurrencyConverter(Context context, String fromUnit, String toUnit, double fromValue,
                             double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(fromUnit)) {
            currencyAustralianDollar();
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(fromUnit)) {
            currencyBrazilianReal();
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(fromUnit)) {
            currencyBritishPound();
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(fromUnit)) {
            currencyChineseYuan();
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(fromUnit)) {
            currencyEgyptianPound();
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(fromUnit)) {
            currencyEuro();
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(fromUnit)) {
            currencyIndianRupee();
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(fromUnit)) {
            currencyJapaneseYen();
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(fromUnit)) {
            currencyPhilippinePeso();
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(fromUnit)) {
            currencyRussianRuble();
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(fromUnit)) {
            currencySouthKoreanWon();
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(fromUnit)) {
            currencySaudiRiyal();
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(fromUnit)) {
            currencyThaiBaht();
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(fromUnit)) {
            currencyUnitedStatesDollar();
        }

    }

    private void currencyAustralianDollar() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(toUnit)) {
            toValue = fromValue * 3.76305d;
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(toUnit)) {
            toValue = fromValue * 0.52965d;
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(toUnit)) {
            toValue = fromValue * 4.77584d;
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(toUnit)) {
            toValue = fromValue * 11.5833d;
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(toUnit)) {
            toValue = fromValue * 0.62235d;
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(toUnit)) {
            toValue = fromValue * 54.7692d;
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(toUnit)) {
            toValue = fromValue * 81.04d;
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(toUnit)) {
            toValue = fromValue * 37.1141d;
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(toUnit)) {
            toValue = fromValue * 54.1082d;
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(toUnit)) {
            toValue = fromValue * 845.594d;
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(toUnit)) {
            toValue = fromValue * 2.76751d;
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(toUnit)) {
            toValue = fromValue * 24.2605d;
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(toUnit)) {
            toValue = fromValue * 0.73894d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void currencyBrazilianReal() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(toUnit)) {
            toValue = fromValue * 0.26551d;
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(toUnit)) {
            toValue = fromValue * 0.14066d;
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(toUnit)) {
            toValue = fromValue * 1.26829d;
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(toUnit)) {
            toValue = fromValue * 3.07612d;
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(toUnit)) {
            toValue = fromValue * 0.16527d;
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(toUnit)) {
            toValue = fromValue * 14.5448d;
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(toUnit)) {
            toValue = fromValue * 21.52d;
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(toUnit)) {
            toValue = fromValue * 9.85620d;
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(toUnit)) {
            toValue = fromValue * 14.3692d;
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(toUnit)) {
            toValue = fromValue * 224.560d;
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(toUnit)) {
            toValue = fromValue * 0.73495d;
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(toUnit)) {
            toValue = fromValue * 6.44274d;
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(toUnit)) {
            toValue = fromValue * 0.19624d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void currencyBritishPound() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(toUnit)) {
            toValue = fromValue * 1.88806d;
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(toUnit)) {
            toValue = fromValue * 7.10959d;
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(toUnit)) {
            toValue = fromValue * 9.01577d;
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(toUnit)) {
            toValue = fromValue * 21.8669d;
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(toUnit)) {
            toValue = fromValue * 1.17482d;
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(toUnit)) {
            toValue = fromValue * 103.393d;
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(toUnit)) {
            toValue = fromValue * 152.99d;
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(toUnit)) {
            toValue = fromValue * 70.0636d;
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(toUnit)) {
            toValue = fromValue * 102.145d;
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(toUnit)) {
            toValue = fromValue * 1596.30d;
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(toUnit)) {
            toValue = fromValue * 5.22448d;
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(toUnit)) {
            toValue = fromValue * 45.7987d;
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(toUnit)) {
            toValue = fromValue * 1.39496d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void currencyChineseYuan() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(toUnit)) {
            toValue = fromValue * 0.20925d;
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(toUnit)) {
            toValue = fromValue * 0.78757d;
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(toUnit)) {
            toValue = fromValue * 0.11085d;
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(toUnit)) {
            toValue = fromValue * 2.42427d;
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(toUnit)) {
            toValue = fromValue * 0.13024d;
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(toUnit)) {
            toValue = fromValue * 11.4626d;
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(toUnit)) {
            toValue = fromValue * 16.96d;
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(toUnit)) {
            toValue = fromValue * 7.76759d;
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(toUnit)) {
            toValue = fromValue * 11.3243d;
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(toUnit)) {
            toValue = fromValue * 176.974d;
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(toUnit)) {
            toValue = fromValue * 0.57921d;
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(toUnit)) {
            toValue = fromValue * 5.07747d;
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(toUnit)) {
            toValue = fromValue * 0.15465d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void currencyEgyptianPound() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(toUnit)) {
            toValue = fromValue * 0.08598d;
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(toUnit)) {
            toValue = fromValue * 0.32361d;
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(toUnit)) {
            toValue = fromValue * 0.04555d;
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(toUnit)) {
            toValue = fromValue * 0.41071d;
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(toUnit)) {
            toValue = fromValue * 0.05352d;
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(toUnit)) {
            toValue = fromValue * 4.71004d;
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(toUnit)) {
            toValue = fromValue * 6.97d;
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(toUnit)) {
            toValue = fromValue * 3.19174d;
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(toUnit)) {
            toValue = fromValue * 4.65319d;
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(toUnit)) {
            toValue = fromValue * 72.7193d;
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(toUnit)) {
            toValue = fromValue * 0.23800d;
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(toUnit)) {
            toValue = fromValue * 2.08635d;
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(toUnit)) {
            toValue = fromValue * 0.06355d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void currencyEuro() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(toUnit)) {
            toValue = fromValue * 1.61193d;
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(toUnit)) {
            toValue = fromValue * 6.08508d;
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(toUnit)) {
            toValue = fromValue * 0.85226d;
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(toUnit)) {
            toValue = fromValue * 7.67114d;
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(toUnit)) {
            toValue = fromValue * 18.6164d;
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(toUnit)) {
            toValue = fromValue * 88.1115d;
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(toUnit)) {
            toValue = fromValue * 130.20d;
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(toUnit)) {
            toValue = fromValue * 59.4274d;
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(toUnit)) {
            toValue = fromValue * 86.8239d;
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(toUnit)) {
            toValue = fromValue * 1364.89d;
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(toUnit)) {
            toValue = fromValue * 4.44801d;
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(toUnit)) {
            toValue = fromValue * 39.0208d;
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(toUnit)) {
            toValue = fromValue * 1.18764d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void currencyIndianRupee() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(toUnit)) {
            toValue = fromValue * 0.01826d;
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(toUnit)) {
            toValue = fromValue * 0.06894d;
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(toUnit)) {
            toValue = fromValue * 0.00965d;
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(toUnit)) {
            toValue = fromValue * 0.08690d;
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(toUnit)) {
            toValue = fromValue * 0.21090d;
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(toUnit)) {
            toValue = fromValue * 0.01133d;
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(toUnit)) {
            toValue = fromValue * 1.47d;
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(toUnit)) {
            toValue = fromValue * 0.67323d;
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(toUnit)) {
            toValue = fromValue * 0.98360d;
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(toUnit)) {
            toValue = fromValue * 15.4624d;
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(toUnit)) {
            toValue = fromValue * 0.05039d;
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(toUnit)) {
            toValue = fromValue * 0.44205d;
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(toUnit)) {
            toValue = fromValue * 0.01345d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void currencyJapaneseYen() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(toUnit)) {
            toValue = fromValue * 0.01238d;
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(toUnit)) {
            toValue = fromValue * 0.04673d;
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(toUnit)) {
            toValue = fromValue * 0.00654d;
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(toUnit)) {
            toValue = fromValue * 0.05891d;
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(toUnit)) {
            toValue = fromValue * 0.14297d;
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(toUnit)) {
            toValue = fromValue * 0.00768d;
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(toUnit)) {
            toValue = fromValue * 0.67667d;
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(toUnit)) {
            toValue = fromValue * 0.45639d;
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(toUnit)) {
            toValue = fromValue * 0.66678d;
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(toUnit)) {
            toValue = fromValue * 10.4820d;
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(toUnit)) {
            toValue = fromValue * 0.03416d;
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(toUnit)) {
            toValue = fromValue * 0.29967d;
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(toUnit)) {
            toValue = fromValue * 0.00912d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void currencyPhilippinePeso() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(toUnit)) {
            toValue = fromValue * 0.02708d;
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(toUnit)) {
            toValue = fromValue * 0.10225d;
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(toUnit)) {
            toValue = fromValue * 0.01432d;
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(toUnit)) {
            toValue = fromValue * 0.12890d;
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(toUnit)) {
            toValue = fromValue * 0.31282d;
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(toUnit)) {
            toValue = fromValue * 0.01680d;
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(toUnit)) {
            toValue = fromValue * 1.48057d;
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(toUnit)) {
            toValue = fromValue * 2.19d;
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(toUnit)) {
            toValue = fromValue * 1.45894d;
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(toUnit)) {
            toValue = fromValue * 22.9348d;
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(toUnit)) {
            toValue = fromValue * 0.07474d;
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(toUnit)) {
            toValue = fromValue * 0.65568d;
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(toUnit)) {
            toValue = fromValue * 0.01996d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void currencyRussianRuble() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(toUnit)) {
            toValue = fromValue * 0.01855d;
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(toUnit)) {
            toValue = fromValue * 0.07004d;
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(toUnit)) {
            toValue = fromValue * 0.00981d;
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(toUnit)) {
            toValue = fromValue * 0.08829d;
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(toUnit)) {
            toValue = fromValue * 0.21426d;
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(toUnit)) {
            toValue = fromValue * 0.01151d;
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(toUnit)) {
            toValue = fromValue * 1.01410d;
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(toUnit)) {
            toValue = fromValue * 1.50d;
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(toUnit)) {
            toValue = fromValue * 0.68397d;
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(toUnit)) {
            toValue = fromValue * 15.7090d;
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(toUnit)) {
            toValue = fromValue * 0.05119d;
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(toUnit)) {
            toValue = fromValue * 0.44910d;
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(toUnit)) {
            toValue = fromValue * 0.01367d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void currencySouthKoreanWon() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(toUnit)) {
            toValue = fromValue * 0.00118d;
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(toUnit)) {
            toValue = fromValue * 0.00445d;
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(toUnit)) {
            toValue = fromValue * 0.00062d;
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(toUnit)) {
            toValue = fromValue * 0.00561d;
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(toUnit)) {
            toValue = fromValue * 0.01362d;
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(toUnit)) {
            toValue = fromValue * 0.00073d;
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(toUnit)) {
            toValue = fromValue * 0.06447d;
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(toUnit)) {
            toValue = fromValue * 0.10d;
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(toUnit)) {
            toValue = fromValue * 0.04348d;
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(toUnit)) {
            toValue = fromValue * 0.06353d;
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(toUnit)) {
            toValue = fromValue ;
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(toUnit)) {
            toValue = fromValue * 0.00325d;
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(toUnit)) {
            toValue = fromValue * 0.02855d;
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(toUnit)) {
            toValue = fromValue * 0.00087d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void currencySaudiRiyal() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(toUnit)) {
            toValue = fromValue * 0.36139d;
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(toUnit)) {
            toValue = fromValue * 1.36440d;
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(toUnit)) {
            toValue = fromValue * 0.19109d;
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(toUnit)) {
            toValue = fromValue * 1.72003d;
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(toUnit)) {
            toValue = fromValue * 4.17419d;
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(toUnit)) {
            toValue = fromValue * 0.22419d;
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(toUnit)) {
            toValue = fromValue * 19.7565d;
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(toUnit)) {
            toValue = fromValue * 29.19d;
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(toUnit)) {
            toValue = fromValue * 13.3249d;
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(toUnit)) {
            toValue = fromValue * 19.4678d;
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(toUnit)) {
            toValue = fromValue * 306.038d;
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(toUnit)) {
            toValue = fromValue * 8.74929d;
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(toUnit)) {
            toValue = fromValue * 0.26630d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void currencyThaiBaht() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(toUnit)) {
            toValue = fromValue * 0.04121d;
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(toUnit)) {
            toValue = fromValue * 0.15557d;
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(toUnit)) {
            toValue = fromValue * 0.02179d;
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(toUnit)) {
            toValue = fromValue * 0.19612d;
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(toUnit)) {
            toValue = fromValue * 0.47596d;
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(toUnit)) {
            toValue = fromValue * 0.02556d;
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(toUnit)) {
            toValue = fromValue * 2.25270d;
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(toUnit)) {
            toValue = fromValue * 3.33d;
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(toUnit)) {
            toValue = fromValue * 1.51934d;
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(toUnit)) {
            toValue = fromValue * 2.21978d;
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(toUnit)) {
            toValue = fromValue * 34.8954d;
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(toUnit)) {
            toValue = fromValue * 0.11372d;
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(toUnit)) {
            toValue = fromValue * 0.03036d;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
    private void currencyUnitedStatesDollar() {
        if (mContext.getString(R.string.string_units_list_currency_australian_dollar).equals(toUnit)) {
            toValue = fromValue * 1.35711d;
        } else if (mContext.getString(R.string.string_units_list_currency_brazilian_real).equals(toUnit)) {
            toValue = fromValue * 5.12367d;
        } else if (mContext.getString(R.string.string_units_list_currency_british_pound).equals(toUnit)) {
            toValue = fromValue * 0.71758d;
        } else if (mContext.getString(R.string.string_units_list_currency_chinese_yuan).equals(toUnit)) {
            toValue = fromValue * 6.45913d;
        } else if (mContext.getString(R.string.string_units_list_currency_egyptian_pound).equals(toUnit)) {
            toValue = fromValue * 15.6751d;
        } else if (mContext.getString(R.string.string_units_list_currency_euro).equals(toUnit)) {
            toValue = fromValue * 0.84190d;
        } else if (mContext.getString(R.string.string_units_list_currency_indian_rupee).equals(toUnit)) {
            toValue = fromValue * 74.1903d;
        } else if (mContext.getString(R.string.string_units_list_currency_japanese_yen).equals(toUnit)) {
            toValue = fromValue * 109.62d;
        } else if (mContext.getString(R.string.string_units_list_currency_philippine_peso).equals(toUnit)) {
            toValue = fromValue * 50.0381d;
        } else if (mContext.getString(R.string.string_units_list_currency_russian_ruble).equals(toUnit)) {
            toValue = fromValue * 73.1061d;
        } else if (mContext.getString(R.string.string_units_list_currency_south_korean_won).equals(toUnit)) {
            toValue = fromValue * 1149.24d;
        } else if (mContext.getString(R.string.string_units_list_currency_saudi_riyal).equals(toUnit)) {
            toValue = fromValue * 3.74524d;
        } else if (mContext.getString(R.string.string_units_list_currency_thai_baht).equals(toUnit)) {
            toValue = fromValue * 32.8557d;
        } else if (mContext.getString(R.string.string_units_list_currency_united_states_dollar).equals(toUnit)) {
            toValue = fromValue;
        }
        mToNumberTV.setText(String.valueOf(toValue));
    }
}
