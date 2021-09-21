package quantitymeasurement;


public class Inch {
    private final double value;

    public Inch(double v) {
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
        if (o.getClass() == Feet.class) {
            Feet feet = new Feet(((Feet) o).getValue()*12);
            if (Double.compare(feet.getValue(), this.getValue()) == 0) {
                return true;
            } else {
                return false;
            }
        }
        if (o.getClass() == Yard.class) {
            Yard feet = new Yard(((Yard) o).getValue()*12*3);
            if (Double.compare(feet.getValue(), this.getValue()) == 0) {
                return true;
            } else {
                return false;
            }
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Inch inch = (Inch) o;
        if (Double.compare(inch.value, value) != 0) {
            return false;
        }
        return true;
    }
}
