package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import com.example.unit_converter.adapters.QuantitiesAdapter;
import com.example.unit_converter.adapters.UnitsAdapter;
import com.example.unit_converter.dataProviders.UnitAngleDataProvider;
import com.example.unit_converter.dataProviders.UnitAreaDataProvider;
import com.example.unit_converter.dataProviders.UnitCurrencyDataProvider;
import com.example.unit_converter.dataProviders.UnitCurrentDataProvider;
import com.example.unit_converter.dataProviders.UnitEnergyDataProvider;
import com.example.unit_converter.dataProviders.UnitForceDataProvider;
import com.example.unit_converter.dataProviders.UnitFrequencyDataProvider;
import com.example.unit_converter.dataProviders.UnitIlluminanceDataProvider;
import com.example.unit_converter.dataProviders.UnitLengthDataProvider;
import com.example.unit_converter.dataProviders.UnitPowerDataProvider;
import com.example.unit_converter.dataProviders.UnitPressureDataProvider;
import com.example.unit_converter.dataProviders.UnitResistanceDataProvider;
import com.example.unit_converter.dataProviders.UnitSoundDataProvider;
import com.example.unit_converter.dataProviders.UnitSpeedDataProvider;
import com.example.unit_converter.dataProviders.UnitStorageDataProvider;
import com.example.unit_converter.dataProviders.UnitTemperatureDataProvider;
import com.example.unit_converter.dataProviders.UnitTimeDataProvider;
import com.example.unit_converter.dataProviders.UnitTorqueDataProvider;
import com.example.unit_converter.dataProviders.UnitVoltageDataProvider;
import com.example.unit_converter.dataProviders.UnitVolumeDataProvider;
import com.example.unit_converter.dataProviders.UnitWeightDataProvider;
import com.example.unit_converter.models.DataItemQuantities;
import com.example.unit_converter.models.DataItemUnits;

import java.util.List;
import java.util.Objects;

public class UnitsActivity extends AppCompatActivity {

    public DataItemQuantities itemQuantities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);
        Toolbar toolbar = findViewById(R.id.toolbar_units);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        itemQuantities = Objects.requireNonNull(getIntent().getExtras()).
                getParcelable(QuantitiesAdapter.ITEM_KEY);

        if (itemQuantities == null) {
            throw new AssertionError("Null data item received!");
        } else {
            unitsRecyclerViews();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return false;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void unitsRecyclerViews() {
        RecyclerView unitsRV = findViewById(R.id.rv_units);

        //todo Update after adding a quantity
        switch (itemQuantities.getId()) {
            case "quantities_length":
                List<DataItemUnits> dataItemUnitLengthList = UnitLengthDataProvider.dataItemUnitsList;
                UnitsAdapter unitsAdapter = new UnitsAdapter(this, dataItemUnitLengthList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_area":
                List<DataItemUnits> dataItemUnitAreaList = UnitAreaDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitAreaList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_weight":
                List<DataItemUnits> dataItemUnitWeightList = UnitWeightDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitWeightList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_volume":
                List<DataItemUnits> dataItemUnitVolumeList = UnitVolumeDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitVolumeList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_temperature":
                List<DataItemUnits> dataItemUnitTemperatureList = UnitTemperatureDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitTemperatureList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_time":
                List<DataItemUnits> dataItemUnitTimeList = UnitTimeDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitTimeList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_speed":
                List<DataItemUnits> dataItemUnitSpeedList = UnitSpeedDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitSpeedList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_digital":
                break;
            case "quantities_age":
                break;
            case "quantities_binary":
                break;
            case "quantities_angle":
                List<DataItemUnits> dataItemUnitAngleList = UnitAngleDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitAngleList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_pressure":
                List<DataItemUnits> dataItemUnitPressureList = UnitPressureDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitPressureList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_voltage":
                List<DataItemUnits> dataItemUnitVoltageList = UnitVoltageDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitVoltageList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_current":
                List<DataItemUnits> dataItemUnitCurrentList = UnitCurrentDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitCurrentList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_power":
                List<DataItemUnits> dataItemUnitPowerList = UnitPowerDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitPowerList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_flow":
                break;
            case "quantities_frequency":
                List<DataItemUnits> dataItemUnitFrequencyList = UnitFrequencyDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitFrequencyList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_illuminance":
                List<DataItemUnits> dataItemUnitIlluminanceList = UnitIlluminanceDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitIlluminanceList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_energy":
                List<DataItemUnits> dataItemUnitEnergyList = UnitEnergyDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitEnergyList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_storage":
                List<DataItemUnits> dataItemUnitStorageList = UnitStorageDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitStorageList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_force":
                List<DataItemUnits> dataItemUnitForceList = UnitForceDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitForceList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_sound":
                List<DataItemUnits> dataItemUnitSoundList = UnitSoundDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitSoundList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_resistance":
                List<DataItemUnits> dataItemUnitResistanceList = UnitResistanceDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitResistanceList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_luminance":
                break;
            case "quantities_capacitance":
                break;
            case "quantities_surface_tension":
                break;
            case "quantities_density":
                break;
            case "quantities_torque":
                List<DataItemUnits> dataItemUnitTorqueList = UnitTorqueDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitTorqueList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_currency":
                List<DataItemUnits> dataItemUnitCurrencyList = UnitCurrencyDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitCurrencyList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
        }
    }
}