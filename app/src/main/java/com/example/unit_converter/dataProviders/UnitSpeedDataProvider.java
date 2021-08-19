package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitSpeedDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_speed_kilometerperhour", R.string.string_units_list_speed_kilometerperhour, "[ km/h ]", "quantities_speed", "ic_quantities_speed.png"));
        addItem(new DataItemUnits("unit_speed_mileperhour", R.string.string_units_list_speed_mileperhour, "[ mi/h ]", "quantities_speed", "ic_quantities_speed.png"));
        addItem(new DataItemUnits("unit_speed_meterpersecond", R.string.string_units_list_speed_meterpersecond, "[ m/s]", "quantities_speed", "ic_quantities_speed.png"));
        addItem(new DataItemUnits("unit_speed_footpersecond", R.string.string_units_list_speed_footpersecond, "[ ft/s ]", "quantities_speed", "ic_quantities_speed.png"));
        addItem(new DataItemUnits("unit_speed_knot", R.string.string_units_list_speed_knot, "[ kn ]", "quantities_speed", "ic_quantities_speed.png"));
    }
    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}