package quantitymeasurement;

public class QuantityMeasurementException extends Exception {
    enum ExceptionType {
        NULL_EXCEPTION, REFERENCE_EXCEPTION, TYPE_EXCEPTION, VALUE_UNEQUAL_EXCEPTION
    }

    ExceptionType exceptionType;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.exceptionType = type;
    }
}
