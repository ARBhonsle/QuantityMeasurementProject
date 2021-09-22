package quantitymeasurement;

public enum Length implements MeasuringUnits {
    FEET(12.0),INCH(1.0),YARD(36.0),CM(0.4);

    private final double conversionValue;

    Length(double conversionValue){
        this.conversionValue=conversionValue;
    }

    public double convertToBaseUnit(double value){
        return value*conversionValue;
    }

}
