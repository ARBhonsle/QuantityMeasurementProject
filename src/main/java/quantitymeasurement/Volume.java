package quantitymeasurement;

public enum Volume implements MeasuringUnits{
    GALLON(3.78),LITRE(1.0),ML(0.001);

    private final double conversionValue;

    Volume(double conversionValue){
        this.conversionValue=conversionValue;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return Math.round(value * conversionValue);
    }

    @Override
    public boolean canPerformAddition() {
        return true;
    }
}
