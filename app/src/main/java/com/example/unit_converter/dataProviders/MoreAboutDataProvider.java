package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemMore;

import java.util.ArrayList;
import java.util.List;

public class MoreAboutDataProvider {

    public static List<DataItemMore> dataItemMoreList;

    static {
        dataItemMoreList = new ArrayList<>();

        addItem(new DataItemMore("about_disclaimer", R.string.string_more_list_about_disclaimer));
        addItem(new DataItemMore("about_linkedin1", R.string.string_more_list_about_linkedin1));
        addItem(new DataItemMore("about_linkedin2", R.string.string_more_list_about_linkedin2));
    }

    private static void addItem(DataItemMore item) {
        dataItemMoreList.add(item);
    }
}
