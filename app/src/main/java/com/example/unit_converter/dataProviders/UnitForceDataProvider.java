package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitForceDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_force_newton", R.string.string_units_list_force_newton, "[ N ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_gram_force", R.string.string_units_list_force_gram_force, "[ gf ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_kilogram_force", R.string.string_units_list_force_kilogram_force, "[ kgf ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_ton_force", R.string.string_units_list_force_ton_force, "[ tf ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_exanewton", R.string.string_units_list_force_exanewton, "[ EN ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_petanewton", R.string.string_units_list_force_petanewton, "[ PT ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_teranewton", R.string.string_units_list_force_teranewton, "[ TN ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_giganewton", R.string.string_units_list_force_giganewton, "[ GN ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_meganewton", R.string.string_units_list_force_meganewton, "[ MN ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_kilonewton", R.string.string_units_list_force_kilonewton, "[ kN ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_hectonewton", R.string.string_units_list_force_hectonewton, "[ hN ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_decanewton", R.string.string_units_list_force_decanewton, "[ daN ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_decinewton", R.string.string_units_list_force_decinewton, "[ dN ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_centinewton", R.string.string_units_list_force_centinewton, "[ cN ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_millinewton", R.string.string_units_list_force_millinewton, "[ mN ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_micronewton", R.string.string_units_list_force_micronewton, "[ µN ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_nanonewton", R.string.string_units_list_force_nanonewton, "[ nN ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_piconewton", R.string.string_units_list_force_piconewton, "[ pN ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_femtonewton", R.string.string_units_list_force_femtonewton, "[ fN ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_dyne", R.string.string_units_list_force_dyne, "[ dyn ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_joule_per_meter", R.string.string_units_list_force_joule_per_meter, "[ J/m ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_joule_per_centimeter", R.string.string_units_list_force_joule_per_centimeter, "[ J/cm ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_kilopound_force", R.string.string_units_list_force_kilopound_force, "[ kipf ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_pound_force", R.string.string_units_list_force_pound_force, "[ lbf ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_ounce_force", R.string.string_units_list_force_ounce_force, "[ ozf ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_poundal", R.string.string_units_list_force_poundal, "[ pdl ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_pound_foot_per_square_second", R.string.string_units_list_force_pound_foot_per_square_second, "[ lb⋅ft/s2 ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_pond", R.string.string_units_list_force_pond, "[ p ]", "quantities_force", "ic_quantities_force.png"));
        addItem(new DataItemUnits("unit_force_kilopond", R.string.string_units_list_force_kilopond, "[ kp ]", "quantities_force", "ic_quantities_force.png"));

    }

    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}
