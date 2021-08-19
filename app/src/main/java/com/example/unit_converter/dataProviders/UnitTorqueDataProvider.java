package com.example.unit_converter.dataProviders;

import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitTorqueDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_torque_newton_meter", R.string.string_units_list_torque_newton_meter, "[ N.m ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_milli_newton_meter", R.string.string_units_list_torque_milli_newton_meter, "[ mN.m ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_centi_newton_meter", R.string.string_units_list_torque_centi_newton_meter, "[ cN.m ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_kilo_newton_meter", R.string.string_units_list_torque_kilo_newton_meter, "[ kN.m ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_mega_newton_meter", R.string.string_units_list_torque_mega_newton_meter, "[ MN.m ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_micro_newton_meter", R.string.string_units_list_torque_micro_newton_meter, "[ µN.m ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_newton_millimeter", R.string.string_units_list_torque_newton_millimeter, "[ N.mm ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_newton_centimeter", R.string.string_units_list_torque_newton_centimeter, "[ N.cm ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_dyne_meter", R.string.string_units_list_torque_dyne_meter, "[ dyn.m ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_dyne_centimeter", R.string.string_units_list_torque_dyne_centimeter, "[ dyn.cm ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_dyne_millimeter", R.string.string_units_list_torque_dyne_millimeter, "[ dyn.mm ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_kilo_pound_meter", R.string.string_units_list_torque_kilo_pound_meter, "[ klb.m ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_gram_centimeter", R.string.string_units_list_torque_gram_centimeter, "[ g.cm ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_gram_millimeter", R.string.string_units_list_torque_gram_millimeter, "[ g.mm ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_gram_meter", R.string.string_units_list_torque_gram_meter, "[ g.m) ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_kilogram_centimeter", R.string.string_units_list_torque_kilogram_centimeter, "[ kg.cm) ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_kilogram_millimeter", R.string.string_units_list_torque_kilogram_millimeter, "[ kg.mm ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_kilogram_meter", R.string.string_units_list_torque_kilogram_meter, "[ kg.m ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_kilogram_force_meter", R.string.string_units_list_torque_kilogram_force_meter, "[ kgf.m ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_gram_force_meter", R.string.string_units_list_torque_gram_force_meter, "[ gf.m ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_kilogram_force_centimeter", R.string.string_units_list_torque_kilogram_force_centimeter, "[ kgf.cm ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_gram_force_centimeter", R.string.string_units_list_torque_gram_force_centimeter, "[ gf.cm ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_pound_force_foot", R.string.string_units_list_torque_pound_force_foot, "[ lbf.ft ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_pound_force_inch", R.string.string_units_list_torque_pound_force_inch, "[ lbf.in ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_ounce_force_inch", R.string.string_units_list_torque_ounce_force_inch, "[ ozf.in ]", "quantities_torque", "ic_quantities_torque.png"));
        addItem(new DataItemUnits("unit_torque_ounce_force_foot", R.string.string_units_list_torque_ounce_force_foot, "[ ozf.ft ]", "quantities_torque", "ic_quantities_torque.png"));

    }

    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}

