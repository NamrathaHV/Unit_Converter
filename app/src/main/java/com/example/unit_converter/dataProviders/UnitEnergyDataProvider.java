package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitEnergyDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_energy_joule", R.string.string_units_list_energy_joule, "[ J ]", "quantities_energy", "ic_quantities_energy.png"));
        addItem(new DataItemUnits("unit_energy_kilojoule", R.string.string_units_list_energy_kilojoule, "[ KJ ]", "quantities_energy", "ic_quantities_energy.png"));
        addItem(new DataItemUnits("unit_energy_calorie", R.string.string_units_list_energy_calorie, "[ Cal ]", "quantities_energy", "ic_quantities_energy.png"));
        addItem(new DataItemUnits("unit_energy_kilocalorie", R.string.string_units_list_energy_kilocalorie, "[ KCal ]", "quantities_energy", "ic_quantities_energy.png"));
        addItem(new DataItemUnits("unit_energy_btu", R.string.string_units_list_energy_btu, "[ btu ]", "quantities_energy", "ic_quantities_energy.png"));
        addItem(new DataItemUnits("unit_energy_ftlbf", R.string.string_units_list_energy_ftlbf, "[ ft-lbf ]", "quantities_energy", "ic_quantities_energy.png"));
        addItem(new DataItemUnits("unit_energy_inlbf", R.string.string_units_list_energy_inlbf, "[ in-lbf ]", "quantities_energy", "ic_quantities_energy.png"));
        addItem(new DataItemUnits("unit_energy_kilowatthour", R.string.string_units_list_energy_kilowatthour, "[ kWh]", "quantities_energy", "ic_quantities_energy.png"));

    }
    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}