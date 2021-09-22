package quantitymeasurement;

public enum Weight implements MeasuringUnits{
    TONNE(1000),KG(1.0),GRAMS(0.001);

    private final double conversionValue;
    Weight(double conversionValue){
        this.conversionValue=conversionValue;
    }

    public double getConversionValue() {
        return conversionValue;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return Math.round(value*getConversionValue());
    }

    @Override
    public boolean canPerformAddition() {
        return true;
    }
}
