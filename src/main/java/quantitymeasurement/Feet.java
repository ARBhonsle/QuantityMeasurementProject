package quantitymeasurement;

import java.util.Objects;

public class Feet {
    private final double value;
    public static QuantityMeasurementException exception;

    public Feet(double v) {
        this.value = v;
        exception=null;
    }

    public static QuantityMeasurementException getException() {
        return exception;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            exception = new QuantityMeasurementException("Null value passed in parameter", QuantityMeasurementException.ExceptionType.NULL_EXCEPTION);
            return false;
        }
        if (o == this) {
            exception = new QuantityMeasurementException("Reference Exception", QuantityMeasurementException.ExceptionType.REFERENCE_EXCEPTION);
            return true;
        }
        if (getClass() != o.getClass()) {
            exception = new QuantityMeasurementException("Parameters Types do not match", QuantityMeasurementException.ExceptionType.TYPE_EXCEPTION);
            if(o.getClass() == Inch.class) {
                exception = null;
                if (((Inch) o).getValue() / 12 == this.getValue()) {
                    return true;
                }
            }
            return false;
        }
        Feet feet = (Feet) o;
        if (Double.compare(feet.value, value) != 0) {
            exception = new QuantityMeasurementException("Parameter value not Equal", QuantityMeasurementException.ExceptionType.VALUE_UNEQUAL_EXCEPTION);
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
