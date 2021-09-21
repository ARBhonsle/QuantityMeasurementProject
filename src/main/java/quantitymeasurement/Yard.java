package quantitymeasurement;

public class Yard {
    private final double value;

    public Yard(double v) {
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
            Inch inch = new Inch(((Inch) o).getValue()/36);
            if (Double.compare(inch.getValue(), this.getValue()) == 0) {
                return true;
            } else {
                return false;
            }
        }
        if (o.getClass() == Feet.class) {
            Feet feet = new Feet(((Feet) o).getValue()/3);
            if (Double.compare(feet.getValue(), this.getValue()) == 0) {
                return true;
            } else {
                return false;
            }
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Yard feet = (Yard) o;
        if (Double.compare(feet.value, value) != 0) {
            return false;
        }
        return true;
    }
}
