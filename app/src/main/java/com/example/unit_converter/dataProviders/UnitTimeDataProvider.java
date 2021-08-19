package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitTimeDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_time_year", R.string.string_units_list_time_year, "[ Y ]", "quantities_time", "ic_quantities_time.png"));
        addItem(new DataItemUnits("unit_time_square_month", R.string.string_units_list_time_month, "[ mm ]", "quantities_time", "ic_quantities_time.png"));
        addItem(new DataItemUnits("unit_time_square_week", R.string.string_units_list_time_week, "[ W ]", "quantities_time", "ic_quantities_time.png"));
        addItem(new DataItemUnits("unit_time_square_day", R.string.string_units_list_time_day, "[ dd ]", "quantities_time", "ic_quantities_time.png"));
        addItem(new DataItemUnits("unit_time_square_hour", R.string.string_units_list_time_hour, "[ h ]", "quantities_time", "ic_quantities_time.png"));
        addItem(new DataItemUnits("unit_time_minute", R.string.string_units_list_time_minute, "[ m ]", "quantities_time", "ic_quantities_time.png"));
        addItem(new DataItemUnits("unit_time_second", R.string.string_units_list_time_second, "[ s ]", "quantities_time", "ic_quantities_time.png"));
        addItem(new DataItemUnits("unit_time_millisecond", R.string.string_units_list_time_millisecond, "[ ms ]", "quantities_time", "ic_quantities_time.png"));
        addItem(new DataItemUnits("unit_time_nanosecond", R.string.string_units_list_time_nanosecond, "[ ns ]", "quantities_time", "ic_quantities_time.png"));

    }

    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}
