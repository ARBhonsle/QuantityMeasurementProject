package quantitymeasurement;

public class Feet {
    private final double value;

    public Feet(double v) {
        this.value = v;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o.getClass() == Inch.class) {
            Feet inch = new Feet(((Inch) o).getValue()/12);
            if (Double.compare(inch.getValue(), this.getValue()) == 0) {
                return true;
            } else {
                return false;
            }
        }
        if (o.getClass() == Yard.class) {
            Yard yard = new Yard(((Yard) o).getValue()*3);
            if (Double.compare(yard.getValue(), this.getValue()) == 0) {
                return true;
            } else {
                return false;
            }
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Feet feet = (Feet) o;
        if (Double.compare(feet.value, value) != 0) {
            return false;
        }
        return true;
    }
}
