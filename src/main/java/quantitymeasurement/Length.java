package quantitymeasurement;

import java.util.Objects;

public class Length {
    enum Unit {FEET,INCH};

    private final double value;
    private final Unit unit;

    public Unit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
