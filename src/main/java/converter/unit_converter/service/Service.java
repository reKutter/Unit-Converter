package converter.unit_converter.service;


import converter.unit_converter.functionalObjects.LengthConverter;
import converter.unit_converter.functionalObjects.TemperatureConverter;
import converter.unit_converter.functionalObjects.WeightConverter;
import org.springframework.stereotype.Component;


public class Service {

    public double convertLength(String fromUnit, String toUnit, double value){
        double toMeterValue = LengthConverter.toMeter(fromUnit,value);
        return LengthConverter.MeterTo(toUnit,toMeterValue);
    }

    public double convertTemperature(String fromUnit, String toUnit,double value){
        double celsiusValue = TemperatureConverter.toCelsius(fromUnit,value);
        return TemperatureConverter.celsiusTo(toUnit,celsiusValue);
    }

    public double convertWeight(String fromUnit,String toUnit,double value){
        double gramValue = WeightConverter.toGrams(fromUnit,value);
        return WeightConverter.gramsTo(toUnit,gramValue);
    }
}
