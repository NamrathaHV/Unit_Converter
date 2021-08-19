package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitStorageDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_storage_bit", R.string.string_units_list_storage_bit, "[ b ]", "quantities_storage", "ic_quantities_storage.png"));
        addItem(new DataItemUnits("unit_storage_byte", R.string.string_units_list_storage_byte, "[ B ]", "quantities_storage", "ic_quantities_storage.png"));
        addItem(new DataItemUnits("unit_storage_kilobit", R.string.string_units_list_storage_kilobit, "[ kb ]", "quantities_storage", "ic_quantities_storage.png"));
        addItem(new DataItemUnits("unit_storage_kilobyte", R.string.string_units_list_storage_kilobyte, "[ kB ]", "quantities_storage", "ic_quantities_storage.png"));
        addItem(new DataItemUnits("unit_storage_megabit", R.string.string_units_list_storage_megabit, "[ Mb ]", "quantities_storage", "ic_quantities_storage.png"));
        addItem(new DataItemUnits("unit_storage_megabyte", R.string.string_units_list_storage_megabyte, "[ MB ]", "quantities_storage", "ic_quantities_storage.png"));
        addItem(new DataItemUnits("unit_storage_gigabit", R.string.string_units_list_storage_gigabit, "[ Gb ]", "quantities_storage", "ic_quantities_storage.png"));
        addItem(new DataItemUnits("unit_storage_gigabyte", R.string.string_units_list_storage_gigabyte, "[ GB ]", "quantities_storage", "ic_quantities_storage.png"));
        addItem(new DataItemUnits("unit_storage_terabit", R.string.string_units_list_storage_terabit, "[ Tb ]", "quantities_storage", "ic_quantities_storage.png"));
        addItem(new DataItemUnits("unit_storage_terabyte", R.string.string_units_list_storage_terabyte, "[ TB ]", "quantities_storage", "ic_quantities_storage.png"));
    }
    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}
