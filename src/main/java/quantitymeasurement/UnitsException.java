package quantitymeasurement;

public class UnitsException extends Exception {
    enum Exceptions {
        TYPE_MISMATCH, TEMPERATURE_CANNOT_BE_ADDED
    }

    Exceptions type;

    UnitsException(Exceptions exception) {
        this.type = exception;
    }

    public Exceptions getType() {
        return type;
    }
}
