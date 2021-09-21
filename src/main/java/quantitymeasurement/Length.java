package quantitymeasurement;

public class Length {
    private static final Double FEET_TO_INCH = 12.0,YARD_TO_FEET=3.0,YARD_TO_INCH=36.0;

    enum Unit {FEET, INCH, YARD}

    private final double value;
    private final Unit unit;

    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public Unit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public boolean compare(Length that) {
        if(that == null){
            return false;
        }
        if(this.getUnit().equals(that.getUnit())){
            return this.equals(that);
        }
        if(this.getUnit().equals(Unit.FEET) && that.getUnit().equals(Unit.INCH)){
            return Double.compare(this.getValue()*FEET_TO_INCH,that.getValue())==0;
        }
        if(this.getUnit().equals(Unit.INCH) && that.getUnit().equals(Unit.FEET)){
            return Double.compare(this.getValue()/FEET_TO_INCH,that.getValue())==0;
        }
        if(this.getUnit().equals(Unit.FEET) && that.getUnit().equals(Unit.YARD)){
            return Double.compare(this.getValue()/YARD_TO_FEET,that.getValue())==0;
        }
        if(this.getUnit().equals(Unit.YARD) && that.getUnit().equals(Unit.FEET)){
            return Double.compare(this.getValue()*YARD_TO_FEET,that.getValue())==0;
        }
        if(this.getUnit().equals(Unit.INCH) && that.getUnit().equals(Unit.YARD)){
            return Double.compare(this.getValue()/YARD_TO_INCH,that.getValue())==0;
        }
        if(this.getUnit().equals(Unit.YARD) && that.getUnit().equals(Unit.INCH)){
            return Double.compare(this.getValue()*YARD_TO_INCH,that.getValue())==0;
        }
        return false;
    }


    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null) return false;
        if (getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
