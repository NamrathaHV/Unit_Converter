package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitCurrencyDataProvider {
    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_currency_australian_dollar", R.string.string_units_list_currency_australian_dollar, "[ AUD ]", "quantities_currency", "ic_quantities_currency_aud.png"));
        addItem(new DataItemUnits("unit_currency_brazilian_real", R.string.string_units_list_currency_brazilian_real, "[ BRL ]", "quantities_currency", "ic_quantities_currency_brl.png"));
        addItem(new DataItemUnits("unit_currency_british_pound", R.string.string_units_list_currency_british_pound, "[ GBP ]", "quantities_currency", "ic_quantities_currency_gbp.png"));
        addItem(new DataItemUnits("unit_currency_chinese_yuan", R.string.string_units_list_currency_chinese_yuan, "[ CNY ]", "quantities_currency", "ic_quantities_currency_cny.png"));
        addItem(new DataItemUnits("unit_currency_egyptian_pound", R.string.string_units_list_currency_egyptian_pound, "[ EGP ]", "quantities_currency", "ic_quantities_currency_egp.png"));
        addItem(new DataItemUnits("unit_currency_euro", R.string.string_units_list_currency_euro, "[ EUR ]", "quantities_currency", "ic_quantities_currency_eur.png"));
        addItem(new DataItemUnits("unit_currency_indian_rupee", R.string.string_units_list_currency_indian_rupee, "[ INR ]", "quantities_currency", "ic_quantities_currency_inr.png"));
        addItem(new DataItemUnits("unit_currency_japanese_yen", R.string.string_units_list_currency_japanese_yen, "[ JPY ]", "quantities_currency", "ic_quantities_currency_jpy.png"));
        addItem(new DataItemUnits("unit_currency_philippine_peso", R.string.string_units_list_currency_philippine_peso, "[ PHP ]", "quantities_currency", "ic_quantities_currency_php.png"));
        addItem(new DataItemUnits("unit_currency_russian_ruble", R.string.string_units_list_currency_russian_ruble, "[ RUB ]", "quantities_currency", "ic_quantities_currency_rub.png"));
        addItem(new DataItemUnits("unit_currency_saudi_riyal", R.string.string_units_list_currency_saudi_riyal, "[ SAR ]", "quantities_currency", "ic_quantities_currency_sar.png"));
        addItem(new DataItemUnits("unit_currency_south_korean_won", R.string.string_units_list_currency_south_korean_won, "[ KRW ]", "quantities_currency", "ic_quantities_currency_krw.png"));
        addItem(new DataItemUnits("unit_currency_thai_baht", R.string.string_units_list_currency_thai_baht, "[ THB ]", "quantities_currency", "ic_quantities_currency_thb.png"));
        addItem(new DataItemUnits("unit_currency_united_states_dollar", R.string.string_units_list_currency_united_states_dollar, "[ USD ]", "quantities_currency", "ic_quantities_currency_usd.png"));

    }
    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }

}
