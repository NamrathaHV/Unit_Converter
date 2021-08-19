package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitIlluminanceDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_illuminance_lux", R.string.string_units_list_illuminance_lux, "[ lux ]", "quantities_illuminance", "ic_quantities_illuminance.png"));
        addItem(new DataItemUnits("unit_illuminance_lumepermtsq", R.string.string_units_list_illuminance_lumepermtsq, "[ lm/m² ]", "quantities_illuminance", "ic_quantities_illuminance.png"));
        addItem(new DataItemUnits("unit_illuminance_metercandle", R.string.string_units_list_illuminance_metercandle, "[ mc ]", "quantities_illuminance", "ic_quantities_illuminance.png"));
        addItem(new DataItemUnits("unit_illuminance_lumenperftsq", R.string.string_units_list_illuminance_lumenperftsq, "[  lm ft−2 ]", "quantities_illuminance", "ic_quantities_illuminance.png"));
        addItem(new DataItemUnits("unit_illuminance_footcandle", R.string.string_units_list_illuminance_footcandle, "[ ftc ]", "quantities_illuminance", "ic_quantities_illuminance.png"));
        addItem(new DataItemUnits("unit_illuminance_lumenpercmsq", R.string.string_units_list_illuminance_lumenpercmsq, "[ lm/cm2 ]", "quantities_illuminance", "ic_quantities_illuminance.png"));
        addItem(new DataItemUnits("unit_illuminance_phot", R.string.string_units_list_illuminance_phot, "[ phot ]", "quantities_illuminance", "ic_quantities_illuminance.png"));
        addItem(new DataItemUnits("unit_illuminance_microwattpercmsq", R.string.string_units_list_illuminance_microwattpercmsq, "[ mW/cm2 ]", "quantities_illuminance", "ic_quantities_illuminance.png"));
    }
    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}
