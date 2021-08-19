package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.unit_converter.adapters.QuantitiesAdapter;
import  com.example.unit_converter.adapters.UnitsAdapter;
import com.example.unit_converter.converters.AngleConverter;
import  com.example.unit_converter.converters.AreaConverter;
import com.example.unit_converter.converters.CurrencyConverter;
import com.example.unit_converter.converters.CurrentConverter;
import com.example.unit_converter.converters.EnergyConverter;
import com.example.unit_converter.converters.IlluminanceConverter;
import  com.example.unit_converter.converters.LengthConverter;
import com.example.unit_converter.converters.PowerConverter;
import com.example.unit_converter.converters.PressureConverter;
import com.example.unit_converter.converters.SpeedConverter;
import com.example.unit_converter.converters.StorageConverter;
import  com.example.unit_converter.converters.TemperatureConverter;
import com.example.unit_converter.converters.TorqueConverter;
import com.example.unit_converter.converters.VolumeConverter;
import  com.example.unit_converter.converters.WeightConverter;
import  com.example.unit_converter.converters.TimeConverter;
import com.example.unit_converter.dataProviders.UnitAngleDataProvider;
import  com.example.unit_converter.dataProviders.UnitAreaDataProvider;
import com.example.unit_converter.dataProviders.UnitCurrencyDataProvider;
import com.example.unit_converter.dataProviders.UnitCurrentDataProvider;
import com.example.unit_converter.dataProviders.UnitEnergyDataProvider;
import com.example.unit_converter.dataProviders.UnitIlluminanceDataProvider;
import  com.example.unit_converter.dataProviders.UnitLengthDataProvider;
import com.example.unit_converter.dataProviders.UnitPowerDataProvider;
import com.example.unit_converter.dataProviders.UnitPressureDataProvider;
import com.example.unit_converter.dataProviders.UnitSpeedDataProvider;
import com.example.unit_converter.dataProviders.UnitStorageDataProvider;
import  com.example.unit_converter.dataProviders.UnitTemperatureDataProvider;
import com.example.unit_converter.dataProviders.UnitTorqueDataProvider;
import com.example.unit_converter.dataProviders.UnitVolumeDataProvider;
import  com.example.unit_converter.dataProviders.UnitWeightDataProvider;
import  com.example.unit_converter.dataProviders.UnitTimeDataProvider;


import  com.example.unit_converter.models.DataItemQuantities;
import  com.example.unit_converter.models.DataItemUnits;

import java.util.List;
import java.util.Objects;

public class ConverterActivity extends AppCompatActivity {

    public static String FROM_UNIT_SELECTION_KEY = "unit_selection_key";
    public static String TO_UNIT_SELECTION_KEY = "unit_selection_key";
    public static String ITEM_CATEGORY;

    private List<DataItemUnits> dataItemUnitsList;
    private DataItemQuantities itemQuantities;

    private String[] unitsTitleArray;
    private static String FROM_UNIT_TITLE, TO_UNIT_TITLE;

    private TextView fromNumberTV, toNumberTV;
    private TextView fromUnitTV, toUnitTV;

    private String fromCurrentValue;
    private String fromUnit, toUnit, fromNumber, toNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        Toolbar toolbar = findViewById(R.id.toolbar_converter);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        itemQuantities = Objects.requireNonNull(getIntent().getExtras()).
                getParcelable(QuantitiesAdapter.ITEM_KEY);

        if (itemQuantities == null) {
            throw new AssertionError("Null data item received!");
        } else {
            ConverterInitializer();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        FROM_UNIT_SELECTION_KEY = "unit_selection_key";
        TO_UNIT_SELECTION_KEY = "unit_selection_key";
        MainActivity.BACK_FROM_CHILD_KEY = "quantities_fragment";
        return super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        FROM_UNIT_SELECTION_KEY = "unit_selection_key";
        TO_UNIT_SELECTION_KEY = "unit_selection_key";
        MainActivity.BACK_FROM_CHILD_KEY = "quantities_fragment";
        super.onSupportNavigateUp();
    }

    private void ConverterInitializer() {
        unitsListInitializer();
        ITEM_CATEGORY = itemQuantities.getId();
        setTitle(itemQuantities.getTitle());

        fromUnitTV = findViewById(R.id.tv_converter_from_unit);
        toUnitTV = findViewById(R.id.tv_converter_to_unit);

        fromNumberTV = findViewById(R.id.tv_converter_from_number);
        toNumberTV = findViewById(R.id.tv_converter_to_number);

        //fromUnitTV SetText
        switch (FROM_UNIT_SELECTION_KEY) {
            case "from_unit_selection_key":
                FROM_UNIT_TITLE = UnitsAdapter.UNIT_TITLE;
                fromUnitTV.setText(FROM_UNIT_TITLE);
                FROM_UNIT_SELECTION_KEY = "from_unit_selection_key_secondary";
                break;
            case "from_unit_selection_key_secondary":
                fromUnitTV.setText(FROM_UNIT_TITLE);
                break;
            default:
                unitsTitleArrayInitializer();
                fromUnitTV.setText(unitsTitleArray[0]);
                break;
        }

        //toUnitTV SetText
        switch (TO_UNIT_SELECTION_KEY) {
            case "to_unit_selection_key":
                TO_UNIT_TITLE = UnitsAdapter.UNIT_TITLE;
                toUnitTV.setText(TO_UNIT_TITLE);
                TO_UNIT_SELECTION_KEY = "to_unit_selection_key_secondary";
                break;
            case "to_unit_selection_key_secondary":
                toUnitTV.setText(TO_UNIT_TITLE);
                break;
            default:
                unitsTitleArrayInitializer();
                toUnitTV.setText(unitsTitleArray[1]);
                break;
        }
    }

    private void unitsListInitializer() {
        //todo Update after adding a quantity
        switch (itemQuantities.getId()) {
            case "quantities_length":
                dataItemUnitsList = UnitLengthDataProvider.dataItemUnitsList;
                break;
            case "quantities_area":
                dataItemUnitsList = UnitAreaDataProvider.dataItemUnitsList;
                break;
            case "quantities_weight":
                dataItemUnitsList = UnitWeightDataProvider.dataItemUnitsList;
                break;
            case "quantities_volume":
                dataItemUnitsList = UnitVolumeDataProvider.dataItemUnitsList;
                break;
            case "quantities_temperature":
                dataItemUnitsList = UnitTemperatureDataProvider.dataItemUnitsList;
                break;
            case "quantities_time":
                dataItemUnitsList = UnitTimeDataProvider.dataItemUnitsList;
                break;
            case "quantities_speed":
                dataItemUnitsList = UnitSpeedDataProvider.dataItemUnitsList;
                break;
            case "quantities_digital":
                break;
            case "quantities_age":
                break;
            case "quantities_binary":
                break;
            case "quantities_angle":
                dataItemUnitsList = UnitAngleDataProvider.dataItemUnitsList;
                break;
            case "quantities_pressure":
                dataItemUnitsList = UnitPressureDataProvider.dataItemUnitsList;
                break;
            case "quantities_voltage":
                break;
            case "quantities_current":
                dataItemUnitsList = UnitCurrentDataProvider.dataItemUnitsList;
                break;
            case "quantities_power":
                dataItemUnitsList = UnitPowerDataProvider.dataItemUnitsList;
                break;
            case "quantities_flow":
                break;
            case "quantities_frequency":
                break;
            case "quantities_illuminance":
                dataItemUnitsList = UnitIlluminanceDataProvider.dataItemUnitsList;
                break;
            case "quantities_energy":
                dataItemUnitsList = UnitEnergyDataProvider.dataItemUnitsList;
                break;
            case "quantities_storage":
                dataItemUnitsList = UnitStorageDataProvider.dataItemUnitsList;
                break;
            case "quantities_force":
                break;
            case "quantities_sound":
                break;
            case "quantities_resistance":
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
                dataItemUnitsList = UnitTorqueDataProvider.dataItemUnitsList;
                break;
            case "quantities_currency":
                dataItemUnitsList = UnitCurrencyDataProvider.dataItemUnitsList;
                break;

        }
    }

    private void converter() {
        double fromValue = Double.parseDouble(fromNumberTV.getText().toString());
        double toValue = 0.0d;

        fromUnit = fromUnitTV.getText().toString();
        toUnit = toUnitTV.getText().toString();

        //todo Update after adding a quantity
        switch (itemQuantities.getId()) {
            case "quantities_length":
                LengthConverter lengthConverter = new LengthConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                lengthConverter.convert();
                break;
            case "quantities_area":
                AreaConverter areaConverter = new AreaConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                areaConverter.convert();
                break;
            case "quantities_weight":
                WeightConverter weightConverter = new WeightConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                weightConverter.convert();
                break;
            case "quantities_volume":
                VolumeConverter volumeConverter = new VolumeConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                volumeConverter.convert();
                break;
            case "quantities_temperature":
                TemperatureConverter temperatureConverter = new TemperatureConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                temperatureConverter.convert();
                break;
            case "quantities_time":
                TimeConverter timeConverter = new TimeConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                timeConverter.convert();
                break;
            case "quantities_speed":
                SpeedConverter speedConverter = new SpeedConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                speedConverter.convert();

                break;
            case "quantities_digital":
                break;
            case "quantities_age":
                break;
            case "quantities_binary":
                break;
            case "quantities_angle":
                AngleConverter angleConverter = new AngleConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                angleConverter.convert();
                break;
            case "quantities_pressure":
                PressureConverter pressureConverter = new PressureConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                pressureConverter.convert();

                break;
            case "quantities_voltage":
                break;
            case "quantities_current":
                CurrentConverter currentConverter = new CurrentConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                currentConverter.convert();
                break;
            case "quantities_power":
                PowerConverter powerConverter = new PowerConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                powerConverter.convert();

                break;
            case "quantities_flow":
                break;
            case "quantities_frequency":
                break;
            case "quantities_illuminance":
                IlluminanceConverter illuminanceConverter = new IlluminanceConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                illuminanceConverter.convert();
                break;
            case "quantities_energy":
                EnergyConverter energyConverter = new EnergyConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                energyConverter.convert();
                break;
            case "quantities_storage":
                StorageConverter storageConverter = new StorageConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                storageConverter.convert();

                break;
            case "quantities_force":
                break;
            case "quantities_sound":
                break;
            case "quantities_resistance":
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
                TorqueConverter torqueConverter = new TorqueConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                torqueConverter.convert();
                break;
            case "quantities_currency":
                CurrencyConverter currencyConverter = new CurrencyConverter(this, fromUnit,
                        toUnit, fromValue, toValue, toNumberTV);
                currencyConverter.convert();
                break;
        }
    }


    private void unitsTitleArrayInitializer() {
        unitsTitleArray = new String[dataItemUnitsList.size()];
        int counter = 0;
        for (DataItemUnits itemUnits : dataItemUnitsList) {
            if (itemUnits.getCategory().equals(ITEM_CATEGORY)) {
                unitsTitleArray[counter++] = getString(itemUnits.getTitle());
            }
        }
    }

    public void fromUnitOnclick(View view) {
        FROM_UNIT_SELECTION_KEY = "from_unit_selection_key";

        Intent fromIntent = new Intent(this, UnitsActivity.class);
        fromIntent.putExtra(QuantitiesAdapter.ITEM_KEY, itemQuantities);
        startActivity(fromIntent);
    }

    public void toUnitOnclick(View view) {
        TO_UNIT_SELECTION_KEY = "to_unit_selection_key";

        Intent toIntent = new Intent(this, UnitsActivity.class);
        toIntent.putExtra(QuantitiesAdapter.ITEM_KEY, itemQuantities);
        startActivity(toIntent);
    }

    public void zeroOnClick(View view) {
        fromCurrentValue = fromNumberTV.getText().toString();
        if (fromCurrentValue.matches("0")) {
            fromNumberTV.setText("0");
        } else {
            fromNumberTV.setText(String.format("%s0", fromCurrentValue));
        }
        converter();
    }

    public void oneOnClick(View view) {
        fromCurrentValue = fromNumberTV.getText().toString();
        if (fromCurrentValue.matches("0")) {
            fromNumberTV.setText("1");
        } else {
            fromNumberTV.setText(String.format("%s1", fromCurrentValue));
        }
        converter();
    }

    public void twoOnClick(View view) {
        fromCurrentValue = fromNumberTV.getText().toString();
        if (fromCurrentValue.matches("0")) {
            fromNumberTV.setText("2");
        } else {
            fromNumberTV.setText(String.format("%s2", fromCurrentValue));
        }
        converter();
    }

    public void threeOnClick(View view) {
        fromCurrentValue = fromNumberTV.getText().toString();
        if (fromCurrentValue.matches("0")) {
            fromNumberTV.setText("3");
        } else {
            fromNumberTV.setText(String.format("%s3", fromCurrentValue));
        }
        converter();
    }

    public void fourOnClick(View view) {
        fromCurrentValue = fromNumberTV.getText().toString();
        if (fromCurrentValue.matches("0")) {
            fromNumberTV.setText("4");
        } else {
            fromNumberTV.setText(String.format("%s4", fromCurrentValue));
        }
        converter();
    }

    public void fiveOnClick(View view) {
        fromCurrentValue = fromNumberTV.getText().toString();
        if (fromCurrentValue.matches("0")) {
            fromNumberTV.setText("5");
        } else {
            fromNumberTV.setText(String.format("%s5", fromCurrentValue));
        }
        converter();
    }

    public void sixOnClick(View view) {
        fromCurrentValue = fromNumberTV.getText().toString();
        if (fromCurrentValue.matches("0")) {
            fromNumberTV.setText("6");
        } else {
            fromNumberTV.setText(String.format("%s6", fromCurrentValue));
        }
        converter();
    }

    public void sevenOnClick(View view) {
        fromCurrentValue = fromNumberTV.getText().toString();
        if (fromCurrentValue.matches("0")) {
            fromNumberTV.setText("7");
        } else {
            fromNumberTV.setText(String.format("%s7", fromCurrentValue));
        }
        converter();
    }

    public void eightOnClick(View view) {
        fromCurrentValue = fromNumberTV.getText().toString();
        if (fromCurrentValue.matches("0")) {
            fromNumberTV.setText("8");
        } else {
            fromNumberTV.setText(String.format("%s8", fromCurrentValue));
        }
        converter();
    }

    public void nineOnClick(View view) {
        fromCurrentValue = fromNumberTV.getText().toString();
        if (fromCurrentValue.matches("0")) {
            fromNumberTV.setText("9");
        } else {
            fromNumberTV.setText(String.format("%s9", fromCurrentValue));
        }
        converter();
    }

    public void pointOnClick(View view) {
        fromCurrentValue = fromNumberTV.getText().toString();
        if (fromCurrentValue.contains(".")) {
            fromNumberTV.setText(fromCurrentValue);
        } else {
            fromNumberTV.setText(String.format("%s.", fromCurrentValue));
        }
    }

    public void negativeOnClick(View view) {
        fromCurrentValue = fromNumberTV.getText().toString();
        if (!fromCurrentValue.matches("0")) {
            if (fromCurrentValue.contains("-")) {
                fromNumberTV.setText(fromCurrentValue.substring(1));
            } else {
                fromNumberTV.setText(String.format("-%s", fromCurrentValue));
            }
        }
        converter();
    }

    public void clearOnClick(View view) {
        fromNumberTV.setText("0");
        toNumberTV.setText("0");
    }

    public void shareOnClick(View view) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Result Sharing");
        String shareString = fromNumberTV.getText().toString() + " " +
                fromUnitTV.getText().toString() + " = " + toNumberTV.getText().toString() + " " +
                toUnitTV.getText().toString() ;
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareString);
        startActivity(Intent.createChooser(
                shareIntent, getString(R.string.string_converter_title_share)));
    }

    public void backspaceOnClick(View view) {
        fromCurrentValue = fromNumberTV.getText().toString();
        if (!fromCurrentValue.matches("0")) {
            if (fromCurrentValue.length() == 1) {
                fromNumberTV.setText("0");
            } else {
                fromNumberTV.setText(fromCurrentValue.substring(0, fromCurrentValue.length() - 1));
            }
        }
        converter();
    }

    public void swapOnClick(View view) {
        fromUnit = fromUnitTV.getText().toString();
        toUnit = toUnitTV.getText().toString();
        //fromNumber = fromNumberTV.getText().toString();
        //toNumber=toNumberTV.getText().toString();
        fromCurrentValue = fromNumberTV.getText().toString();

        fromUnitTV.setText(toUnit);
        toUnitTV.setText(fromUnit);

        fromNumberTV.setText(fromCurrentValue);
        converter();
        //toNumberTV.setText("0");
    }
}