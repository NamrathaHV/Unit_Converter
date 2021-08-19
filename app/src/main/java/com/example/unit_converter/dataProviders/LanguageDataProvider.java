package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemMore;

import java.util.ArrayList;
import java.util.List;

public class LanguageDataProvider {

    public static List<DataItemMore> dataItemMoreList;

    static {
        dataItemMoreList = new ArrayList<>();

        addItem(new DataItemMore("language_english", R.string.string_language_list_english));
        addItem(new DataItemMore("language_kannada", R.string.string_language_list_kannada));
        addItem(new DataItemMore("language_hindi", R.string.string_language_list_hindi));
        addItem(new DataItemMore("language_korean", R.string.string_language_list_korean));
        addItem(new DataItemMore("language_japanese", R.string.string_language_list_japanese));
        addItem(new DataItemMore("language_urdu", R.string.string_language_list_urdu));
    }

    private static void addItem(DataItemMore item) {
        dataItemMoreList.add(item);
    }
}