package converter.unit_converter.dto;

public class ConvertDto {
    private final double value;
    private final String logic;
    private final String fromUnit;
    private final String toUnit;

    public ConvertDto(double value, String logic, String fromUnit, String toUnit) {
        this.value = value;
        this.logic = logic;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    public double getInputValue() {
        return value;
    }

    public String getLogic() {
        return logic;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public String getToUnit() {
        return toUnit;
    }

}
