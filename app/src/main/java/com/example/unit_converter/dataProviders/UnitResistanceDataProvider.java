package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitResistanceDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_resistance_abohm", R.string.string_units_list_resistance_abohm, "[abΩ  ]", "quantities_resistance", "ic_quantities_resistance.png"));
        addItem(new DataItemUnits("unit_resistance_gigaohm", R.string.string_units_list_resistance_gigaohm, "[ GΩ ]", "quantities_resistance", "ic_quantities_resistance.png"));
        addItem(new DataItemUnits("unit_resistance_kiloohm", R.string.string_units_list_resistance_kiloohm, "[ kΩ ]", "quantities_resistance", "ic_quantities_resistance.png"));
        addItem(new DataItemUnits("unit_resistance_megaohm", R.string.string_units_list_resistance_megaohm, "[ MΩ ]", "quantities_resistance", "ic_quantities_resistance.png"));
        addItem(new DataItemUnits("unit_resistance_microohm", R.string.string_units_list_resistance_microohm, "[ µΩ ]", "quantities_resistance", "ic_quantities_resistance.png"));
        addItem(new DataItemUnits("unit_resistance_milliohm", R.string.string_units_list_resistance_milliohm, "[mΩ  ]", "quantities_resistance", "ic_quantities_resistance.png"));
        addItem(new DataItemUnits("unit_resistance_nanoohm", R.string.string_units_list_resistance_nanoohm, "[ nΩ  ]", "quantities_resistance", "ic_quantities_resistance.png"));
        addItem(new DataItemUnits("unit_resistance_ohm", R.string.string_units_list_resistance_ohm, "[Ω ]", "quantities_resistance", "ic_quantities_resistance.png"));
        addItem(new DataItemUnits("unit_resistance_voltperampere", R.string.string_units_list_resistance_voltperampere, "[ V/A ]", "quantities_resistance", "ic_quantities_resistance.png"));

    }
    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}