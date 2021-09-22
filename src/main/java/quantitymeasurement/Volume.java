package quantitymeasurement;

public enum Volume implements MeasuringUnits{
    GALLON(3.78),LITRE(1.0),ML(0.001);

    private final double conversionValue;

    Volume(double conversionValue){
        this.conversionValue=conversionValue;
    }

    public double getConversionValue() {
        return conversionValue;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return Math.round(value * getConversionValue());
    }

    @Override
    public boolean canPerformAddition() {
        return true;
    }
}
