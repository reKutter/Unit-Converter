package converter.unit_converter.functionalObjects;



public class TemperatureConverter {

    public static double toCelsius(String fromUnit, double value) {
        switch (fromUnit.toLowerCase()) {
            case "celsius":
                return value;
            case "fahrenheit":
                return (value - 32) * 5 / 9;
            case "kelvin":
                return value - 273.15;
            default:
                return 0.0;
        }
    }

    public static double celsiusTo(String toUnit, double value) {
        switch (toUnit.toLowerCase()) {
            case "celsius":
                return value;
            case "fahrenheit":
                return (value * 9 / 5) + 32;
            case "kelvin":
                return value + 273.15;
            default:
                return 0.0;
        }
    }
}