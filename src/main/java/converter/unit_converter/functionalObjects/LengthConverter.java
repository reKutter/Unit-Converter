package converter.unit_converter.functionalObjects;

import java.util.HashMap;
import java.util.Map;

public class LengthConverter {

    private static final Map<String, Double> conversionToMeters = new HashMap<>() {{
        put("millimeter", 0.001);
        put("centimeter", 0.01);
        put("meter", 1.0);
        put("kilometer", 1000.0);
        put("inch", 0.0254);
        put("foot", 0.3048);
        put("yard", 0.9144);
        put("mile", 1609.34);
    }};

    public static double toMeter(String unit,double value){
        return value * conversionToMeters.get(unit.toLowerCase());
    }


    public static double MeterTo(String unit, double value){
        return value/conversionToMeters.get(unit.toLowerCase());
    }


}
