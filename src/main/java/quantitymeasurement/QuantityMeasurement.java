package quantitymeasurement;

public class QuantityMeasurement {
    private final double value;
    private final MeasuringUnits unit;


    public MeasuringUnits getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public QuantityMeasurement(MeasuringUnits unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(QuantityMeasurement that) {
        if (that == null || this.getClass() != that.getClass()) {
            return false;
        }
        if (this.getUnit().equals(that.getUnit())) {
            return this.equals(that);
        }
        return Double.compare(this.getUnit().convertToBaseUnit(this.getValue()),that.getUnit().convertToBaseUnit(that.getValue())) == 0;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null) return false;
        if (getClass() != that.getClass()) return false;
        QuantityMeasurement quantity = (QuantityMeasurement) that;
        return Double.compare(quantity.getValue(), value) == 0 && unit == quantity.getUnit();
    }

}
