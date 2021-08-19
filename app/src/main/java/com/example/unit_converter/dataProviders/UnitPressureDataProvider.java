package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitPressureDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_pressure_megapascal", R.string.string_units_list_pressure_megapascal, "[ Mpa ]", "quantities_pressure", "ic_quantities_pressure.png"));
        addItem(new DataItemUnits("unit_pressure_kilopascal", R.string.string_units_list_pressure_kilopascal, "[ kpa ]", "quantities_pressure", "ic_quantities_pressure.png"));
        addItem(new DataItemUnits("unit_pressure_pascal", R.string.string_units_list_pressure_pascal, "[ Pa ]", "quantities_pressure", "ic_quantities_pressure.png"));
        addItem(new DataItemUnits("unit_pressure_bar", R.string.string_units_list_pressure_bar, "[ bar ]", "quantities_pressure", "ic_quantities_pressure.png"));
        addItem(new DataItemUnits("unit_pressure_psi", R.string.string_units_list_pressure_psi, "[ Ψ ]", "quantities_pressure", "ic_quantities_pressure.png"));
        addItem(new DataItemUnits("unit_pressure_psf", R.string.string_units_list_pressure_psf, "[ psf ]", "quantities_pressure", "ic_quantities_pressure.png"));
        addItem(new DataItemUnits("unit_pressure_atmosphere", R.string.string_units_list_pressure_atmosphere, "[ atm ]", "quantities_pressure", "ic_quantities_pressure.png"));
        addItem(new DataItemUnits("unit_pressure_technicalatm", R.string.string_units_list_pressure_technicalatm, "[ atm ]", "quantities_pressure", "ic_quantities_pressure.png"));
        addItem(new DataItemUnits("unit_pressure_mmhg", R.string.string_units_list_pressure_mmhg, "[ mm hg ]", "quantities_pressure", "ic_quantities_pressure.png"));
        addItem(new DataItemUnits("unit_length_pressure_torr", R.string.string_units_list_pressure_torr, "[ torr ]", "quantities_pressure", "ic_quantities_pressure.png"));
    }
    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}