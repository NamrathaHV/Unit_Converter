package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitAngleDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_angle_radian", R.string.string_units_list_angle_radian, "[ rad ]", "quantities_angle", "ic_quantities_angle.png"));
        addItem(new DataItemUnits("unit_angle_second", R.string.string_units_list_angle_second, "[ \" ]", "quantities_angle", "ic_quantities_angle.png"));
        addItem(new DataItemUnits("unit_angle_minute", R.string.string_units_list_angle_minute, "[ ' ]", "quantities_angle", "ic_quantities_angle.png"));
        addItem(new DataItemUnits("unit_angle_degree", R.string.string_units_list_angle_degree, "[ °   ]", "quantities_angle", "ic_quantities_angle.png"));
        addItem(new DataItemUnits("unit_angle_gradian", R.string.string_units_list_angle_gradian, "[ grad ]", "quantities_angle", "ic_quantities_angle.png"));
        addItem(new DataItemUnits("unit_angle_percentslope", R.string.string_units_list_angle_percentslope, "[ % ]", "quantities_angle", "ic_quantities_angle.png"));
        addItem(new DataItemUnits("unit_angle_circle", R.string.string_units_list_angle_circle, "[ circle ]", "quantities_angle", "ic_quantities_angle.png"));
        addItem(new DataItemUnits("unit_angle_mil", R.string.string_units_list_angle_mil, "[ mil ]", "quantities_angle", "ic_quantities_angle.png"));
    }
    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}
