package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        boolean equal = feet1.equals(feet2);
        Assertions.assertEquals(feet1, feet2);
        Assertions.assertTrue(equal);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        try {
            Feet feet1 = new Feet(0.0);
            Feet feet2 = new Feet(1.0);
            boolean equal = feet1.equals(feet2);
            Assertions.assertNotEquals(feet1, feet2);
            Assertions.assertFalse(equal);
            Assertions.assertEquals(QuantityMeasurementException.ExceptionType.VALUE_UNEQUAL_EXCEPTION, Feet.getException().exceptionType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullValue_throwsNullException() {
        try {
            Feet feet = null;
            Feet feet2 = new Feet(1.0);
            feet2.equals(feet);
            Assertions.assertNotEquals(feet, feet2);
            Assertions.assertEquals(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION, Feet.getException().exceptionType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
