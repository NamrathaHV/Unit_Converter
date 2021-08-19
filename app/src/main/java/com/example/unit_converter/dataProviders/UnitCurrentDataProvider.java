package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitCurrentDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_current_ampere", R.string.string_units_list_current_ampere, "[ A ]", "quantities_current", "ic_quantities_current.png"));
        addItem(new DataItemUnits("unit_current_kiloampere", R.string.string_units_list_current_kiloampere, "[ kA ]", "quantities_current", "ic_quantities_current.png"));
        addItem(new DataItemUnits("unit_current_milliampere", R.string.string_units_list_current_milliampere, "[ mA ]", "quantities_current", "ic_quantities_current.png"));
        addItem(new DataItemUnits("unit_current_biot", R.string.string_units_list_current_biot, "[ Bi ]", "quantities_current", "ic_quantities_current.png"));
        addItem(new DataItemUnits("unit_current_abampere", R.string.string_units_list_current_abampere, "[ abA]", "quantities_current", "ic_quantities_current.png"));
        addItem(new DataItemUnits("unit_current_emuofcurrent", R.string.string_units_list_current_emuofcurrent, "[ EMU ]", "quantities_current", "ic_quantities_current.png"));
        addItem(new DataItemUnits("unit_current_statampere", R.string.string_units_list_current_statampere, "[ stA ]", "quantities_current", "ic_quantities_current.png"));
        addItem(new DataItemUnits("unit_current_esuofcurrent", R.string.string_units_list_current_esuofcurrent, "[ ESU ]", "quantities_current", "ic_quantities_current.png"));
        addItem(new DataItemUnits("unit_current_cgsemunit", R.string.string_units_list_current_cgsemunit, "[ em ]", "quantities_current", "ic_quantities_current.png"));
        addItem(new DataItemUnits("unit_current_cgsesunit", R.string.string_units_list_current_cgsesunit, "[ es ]", "quantities_current", "ic_quantities_current.png"));
    }
    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}