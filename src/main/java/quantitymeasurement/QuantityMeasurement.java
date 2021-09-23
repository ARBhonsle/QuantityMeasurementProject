package quantitymeasurement;

public class QuantityMeasurement {
    private final double value;
    private final Unit unit;
    private final MeasuringUnits units;

    public Unit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public QuantityMeasurement(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
        this.units=null;
    }

    public QuantityMeasurement(MeasuringUnits unit, double value) {
        this.value = value;
        this.units = unit;
        this.unit=null;
    }

    public double addition(QuantityMeasurement that) throws UnitsException {
        if(this.getClass() != that.getClass() || this.getUnit().getUnitType() != that.getUnit().getUnitType() || !this.getUnit().canPerformAddition() || !that.getUnit().canPerformAddition()){
            throw new UnitsException(UnitsException.Exceptions.TYPE_MISMATCH);
        }
        return this.getUnit().convertToBaseUnit(this.getValue()) + that.getUnit().convertToBaseUnit(that.getValue());
    }

    public boolean compare(QuantityMeasurement that) throws UnitsException {
        if (that == null || this.getClass() != that.getClass() || this.getUnit().getUnitType()!=that.getUnit().getUnitType()) {
            throw new UnitsException(UnitsException.Exceptions.TYPE_MISMATCH);
        }
        if (this.getUnit().equals(that.getUnit())) {
            return this.equals(that);
        }
        return Double.compare(this.getUnit().convertToBaseUnit(this.getValue()),that.getUnit().convertToBaseUnit(that.getValue())) == 0;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        QuantityMeasurement quantity = (QuantityMeasurement) that;
        return Double.compare(quantity.getValue(), value) == 0 && unit == quantity.getUnit();
    }

}
