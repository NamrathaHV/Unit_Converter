package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitSoundDataProvider{

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_sound_bel", R.string.string_units_list_sound_bel, "[ B ]", "quantities_sound", "ic_quantities_sound.png"));
        addItem(new DataItemUnits("unit_sound_centidecibel", R.string.string_units_list_sound_centidecibel, "[ cdB ]", "quantities_sound", "ic_quantities_sound.png"));
        addItem(new DataItemUnits("unit_sound_decibel", R.string.string_units_list_sound_decibel, "[ dB]", "quantities_sound", "ic_quantities_sound.png"));
        addItem(new DataItemUnits("unit_sound_millidecibel", R.string.string_units_list_sound_millidecibel, "[ mdB ]", "quantities_sound", "ic_quantities_sound.png"));
        addItem(new DataItemUnits("unit_sound_neper", R.string.string_units_list_sound_neper, "[ Np ]", "quantities_sound", "ic_quantities_sound.png"));
    }
    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}