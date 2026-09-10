package converter.unit_converter.functionalObjects;

import java.util.HashMap;
import java.util.Map;

public class WeightConverter {
    private final static Map<String,Double> conversionToGrams = new HashMap<>(){{
        put("gram",1.0);
        put("kilogram",1000.0);
        put("dram",1.772);
        put("ounce",28.35);
        put("short_ton",907184.74);
        put("pound",453.59);
        put("ton", 1000000.0);
    }};

    public static double toGrams(String unit,double value){
        return value * conversionToGrams.get(unit);
    }

    public static double gramsTo(String unit,double value){
        return value/conversionToGrams.get(unit);
    }

}
