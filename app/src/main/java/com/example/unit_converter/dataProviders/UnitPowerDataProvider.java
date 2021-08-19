package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitPowerDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_power_watt", R.string.string_units_list_power_watt, "[M  ]", "quantities_power", "ic_quantities_power.png"));
        addItem(new DataItemUnits("unit_power_kilowatt", R.string.string_units_list_power_kilowatt, "[ kW ]", "quantities_power", "ic_quantities_power.png"));
        addItem(new DataItemUnits("unit_power_megawatt", R.string.string_units_list_power_megawatt, "[  MW]", "quantities_power", "ic_quantities_power.png"));
        addItem(new DataItemUnits("unit_power_hpmetric", R.string.string_units_list_power_hpmetric, "[ hp ]", "quantities_power", "ic_quantities_power.png"));
        addItem(new DataItemUnits("unit_power_hpmechanical", R.string.string_units_list_power_hpmechanical, "[ hp ]", "quantities_power", "ic_quantities_power.png"));
        addItem(new DataItemUnits("unit_pressure_ftlbfpersecond", R.string.string_units_list_power_ftlbfpersecond, "[ ft-lbf/s ]", "quantities_power", "ic_quantities_power.png"));
        addItem(new DataItemUnits("unit_pressure_caloriepersecond", R.string.string_units_list_power_caloriepersecond, "[ cal/s ]", "quantities_power", "ic_quantities_power.png"));
        addItem(new DataItemUnits("unit_pressure_btupersecond", R.string.string_units_list_power_btupersecond, "[ btu/s ]", "quantities_power", "ic_quantities_power.png"));
        addItem(new DataItemUnits("unit_pressure_kvag", R.string.string_units_list_power_kva, "[ kV-A ]", "quantities_power", "ic_quantities_power.png"));
    }
    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}
