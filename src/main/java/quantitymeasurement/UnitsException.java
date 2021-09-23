package quantitymeasurement;

public class UnitsException extends Exception {
    enum Exceptions{
        TYPE_MISMATCH
    }

    Exceptions type;

    UnitsException(Exceptions exception){
        this.type=exception;
    }

    public Exceptions getType() {
        return type;
    }
}
