package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitVoltageDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_voltage_teravolt", R.string.string_units_list_voltage_teravolt, "[ TV ]", "quantities_voltage", "ic_quantities_voltage.png"));
        addItem(new DataItemUnits("unit_voltage_gigaavolt", R.string.string_units_list_voltage_gigavolt, "[ GV ]", "quantities_voltage", "ic_quantities_voltage.png"));
        addItem(new DataItemUnits("unit_voltage_megavolt", R.string.string_units_list_voltage_megavolt, "[MV ]", "quantities_voltage", "ic_quantities_voltage.png"));
        addItem(new DataItemUnits("unit_voltage_kilovolt", R.string.string_units_list_voltage_kilovolt, "[ kV]", "quantities_voltage", "ic_quantities_voltage.png"));
        addItem(new DataItemUnits("unit_voltage_hektovolt", R.string.string_units_list_voltage_hektovolt, "[ hV ]", "quantities_voltage", "ic_quantities_voltage.png"));
        addItem(new DataItemUnits("unit_voltage_volt", R.string.string_units_list_voltage_volt, "[ V ]", "quantities_voltage", "ic_quantities_voltage.png"));
        addItem(new DataItemUnits("unit_voltage_decivolt", R.string.string_units_list_voltage_decivolt, "[ dV ]", "quantities_voltage", "ic_quantities_voltage.png"));
        addItem(new DataItemUnits("unit_voltage_centivolt", R.string.string_units_list_voltage_centivolt, "[ cV ]", "quantities_voltage", "ic_quantities_voltage.png"));
        addItem(new DataItemUnits("unit_voltage_millivolt", R.string.string_units_list_voltage_millivolt, "[ mV ]", "quantities_voltage", "ic_quantities_voltage.png"));
        addItem(new DataItemUnits("unit_voltage_microvolt", R.string.string_units_list_voltage_microvolt, "[ µV ]", "quantities_voltage", "ic_quantities_voltage.png"));
        addItem(new DataItemUnits("unit_voltage_nanovolt", R.string.string_units_list_voltage_nanovolt, "[ nV ]", "quantities_voltage", "ic_quantities_voltage.png"));

    }
    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}

