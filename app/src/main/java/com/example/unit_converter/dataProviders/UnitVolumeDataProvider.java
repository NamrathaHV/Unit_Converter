package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitVolumeDataProvider {


    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_volume_milliliter", R.string.string_units_list_volume_millilitre, "[ cc ]", "quantities_volume", "ic_quantities_volume.png"));
        addItem(new DataItemUnits("unit_volume_deciliter", R.string.string_units_list_volume_decilitre, "[ dl ]", "quantities_volume", "ic_quantities_volume.png"));
        addItem(new DataItemUnits("unit_volume_litre", R.string.string_units_list_volume_litre, "[ L ]", "quantities_volume", "ic_quantities_volume.png"));
        addItem(new DataItemUnits("unit_volume_cubicmillimeter", R.string.string_units_list_volume_cubicmillimeter, "[ mm^3 ]", "quantities_volume", "ic_quantities_volume.png"));
        addItem(new DataItemUnits("unit_volume_cubiccentimeter", R.string.string_units_list_volume_cubiccentimeter, "[ cm^3 ]", "quantities_volume", "ic_quantities_volume.png"));
        addItem(new DataItemUnits("unit_volume_cubicdecimeter", R.string.string_units_list_volume_cubicdecimeter, "[ dm^3 ]", "quantities_volume", "ic_quantities_volume.png"));
        addItem(new DataItemUnits("unit_volume_cubicmeter", R.string.string_units_list_volume_cubicmeter, "[ m^3 ]", "quantities_volume", "ic_quantities_volume.png"));
        addItem(new DataItemUnits("unit_volume_cubicinch", R.string.string_units_list_volume_cubicinch, "[ in^3 ]", "quantities_volume", "ic_quantities_volume.png"));
        addItem(new DataItemUnits("unit_volume_cubicfeet", R.string.string_units_list_volume_cubicfeet, "[ ft^3 ]", "quantities_volume", "ic_quantities_volume.png"));
        addItem(new DataItemUnits("unit_volume_cubicyard", R.string.string_units_list_volume_cubicyard, "[ yd^3 ]", "quantities_volume", "ic_quantities_volume.png"));
        addItem(new DataItemUnits("unit_volume_gallon", R.string.string_units_list_volume_gallon, "[ gal ]", "quantities_volume", "ic_quantities_volume.png"));
        addItem(new DataItemUnits("unit_volume_pints", R.string.string_units_list_volume_pints, "[ pt ]", "quantities_volume", "ic_quantities_volume.png"));
        addItem(new DataItemUnits("unit_volume_brass", R.string.string_units_list_volume_brass, "[ brass ]", "quantities_volume", "ic_quantities_volume.png"));
    }
    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}

