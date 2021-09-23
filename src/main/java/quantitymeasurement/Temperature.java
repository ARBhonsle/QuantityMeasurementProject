package quantitymeasurement;

import java.util.function.Function;

public enum Temperature implements MeasuringUnits {
    FAHRENHEIT(true), CELSIUS(false);
    final Function<Double, Double> degreeFToFahrenheit = (Double degreeF) -> degreeF;
    final Function<Double, Double> degreeCToFahrenheit = (Double degreeC) -> (degreeC * 1.8) + 32;

    final Function<Double, Double> conversionValue;

    Temperature(boolean isFahrenheit) {
        if (isFahrenheit) {
            this.conversionValue = degreeFToFahrenheit;
        } else {
            this.conversionValue = degreeCToFahrenheit;
        }
    }

    @Override
    public double convertToBaseUnit(double value) {
        return conversionValue.apply(value);
    }

    @Override
    public boolean canPerformAddition() {
        return false;
    }
}
