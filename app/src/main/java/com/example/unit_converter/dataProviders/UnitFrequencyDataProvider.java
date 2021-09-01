package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitFrequencyDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_frequency_hertz", R.string.string_units_list_frequency_hertz, "[ Hz ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_nanohertz", R.string.string_units_list_frequency_nanohertz, "[ nHz ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_microhertz", R.string.string_units_list_frequency_microhertz, "[ µHz ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_millihertz", R.string.string_units_list_frequency_millihertz, "[ mHz ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_centihertz", R.string.string_units_list_frequency_centihertz, "[ cHz ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_decihertz", R.string.string_units_list_frequency_decihertz, "[ dHz ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_decahertz", R.string.string_units_list_frequency_decahertz, "[ daHz ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_hectohertz", R.string.string_units_list_frequency_hectohertz, "[ hHz ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_kilohertz", R.string.string_units_list_frequency_kilohertz, "[ kHz ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_megahertz", R.string.string_units_list_frequency_megahertz, "[ MHz ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_gigahertz", R.string.string_units_list_frequency_gigahertz, "[ GHz ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_terahertz", R.string.string_units_list_frequency_terahertz, "[ THz ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_revs_per_hour", R.string.string_units_list_frequency_revs_per_hour, "[ rph ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_revs_per_minute", R.string.string_units_list_frequency_revs_per_minute, "[ rpm ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_revs_per_second", R.string.string_units_list_frequency_revs_per_second, "[ rps ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_radians_per_hour", R.string.string_units_list_frequency_radians_per_hour, "[ rad/hr ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_radians_per_minute", R.string.string_units_list_frequency_radians_per_minute, "[ rad/min ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_radians_per_second", R.string.string_units_list_frequency_radians_per_second, "[ rad/s ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_degrees_per_hour", R.string.string_units_list_frequency_degrees_per_hour, "[ deg/hr ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_degrees_per_minute", R.string.string_units_list_frequency_degrees_per_minute, "[ deg/min ]", "quantities_frequency", "ic_quantities_frequency.png"));
        addItem(new DataItemUnits("unit_frequency_degrees_per_second", R.string.string_units_list_frequency_degrees_per_second, "[ deg/s ]", "quantities_frequency", "ic_quantities_frequency.png"));

    }

    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }

}
