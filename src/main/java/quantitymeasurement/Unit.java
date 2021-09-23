package quantitymeasurement;

import java.util.function.Function;

enum Type {
    LENGTH, VOLUME, WEIGHT, TEMPERATURE
}

public enum Unit implements MeasuringUnits {

    FEET(Type.LENGTH, 12.0), INCH(Type.LENGTH, 1.0), YARD(Type.LENGTH, 36.0), CM(Type.LENGTH, 0.4),
    GALLON(Type.VOLUME, 3.78), LITRE(Type.VOLUME, 1.0), ML(Type.VOLUME, 0.001),
    TONNE(Type.WEIGHT, 1000), KG(Type.WEIGHT, 1.0), GRAMS(Type.WEIGHT, 0.001),
    FAHRENHEIT(Type.TEMPERATURE, 0.0), CELSIUS(Type.TEMPERATURE, 1.0);

    private final double conversionValue;
    private final Type unitType;
    final Function<Double, Double> degreeFToFahrenheit = (Double degreeF) -> degreeF;
    final Function<Double, Double> degreeCToFahrenheit = (Double degreeC) -> (degreeC * 1.8) + 32;

    final Function<Double, Double> conversionDegree;

    Unit(Type unitType, double conversionValue) {
        this.unitType = unitType;
        if (unitType == Type.TEMPERATURE) {
            if (Double.compare(conversionValue, 0.0) == 0) {
                this.conversionDegree = degreeFToFahrenheit;
            } else {
                this.conversionDegree = degreeCToFahrenheit;
            }
            this.conversionValue = 0;
        } else {
            this.conversionValue = conversionValue;
            this.conversionDegree = null;
        }
    }

    public Type getUnitType() {
        return unitType;
    }

    private double getConversionValue() {
        return conversionValue;
    }

    public Function<Double, Double> getConversionDegree() {
        return conversionDegree;
    }

    @Override
    public double convertToBaseUnit(double value) {
        if (!getUnitType().equals(Type.TEMPERATURE))
            return Math.round(value * getConversionValue());
        return Math.round(getConversionDegree().apply(value));
    }

    @Override
    public boolean canPerformAddition() {
        return !this.getUnitType().equals(Type.TEMPERATURE);
    }
}
