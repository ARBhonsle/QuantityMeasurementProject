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
    public void givenNullFeet_whenChecked_shouldThrowNullException() {
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

    @Test
    public void givenSameFeet_whenChecked_shouldThrowReferenceException() {
        try {
            Feet feet2 = new Feet(1.0);
            boolean result = feet2.equals(feet2);
            Assertions.assertTrue(result);
            Assertions.assertEquals(feet2, feet2);
            Assertions.assertEquals(QuantityMeasurementException.ExceptionType.REFERENCE_EXCEPTION, Feet.getException().exceptionType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        boolean equal = inch1.equals(inch2);
        Assertions.assertEquals(inch1, inch2);
        Assertions.assertTrue(equal);
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        boolean equal = inch1.equals(inch2);
        Assertions.assertNotEquals(inch1, inch2);
        Assertions.assertFalse(equal);
    }

    @Test
    public void givenNullInch_whenChecked_shouldThrowNullException() {
        try {
            Inch inch = null;
            Inch inch1 = new Inch(0.0);
            boolean result = inch1.equals(inch);
            Assertions.assertFalse(result);
            Assertions.assertEquals(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION, Feet.getException().exceptionType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenSameInch_whenChecked_shouldThrowReferenceException() {
        try {
            Inch inch1 = new Inch(0.0);
            boolean result = inch1.equals(inch1);
            Assertions.assertTrue(result);
            Assertions.assertEquals(QuantityMeasurementException.ExceptionType.REFERENCE_EXCEPTION, inch1.getException().exceptionType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0FeetAnd0Inch_whenChecked_shouldReturnEqual() {
        try {
            Feet feet = new Feet(0.0);
            Inch inch = new Inch(0.0);
            boolean result = feet.equals(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd12Inch_whenChecked_shouldReturnEqual() {
        try {
            Feet feet = new Feet(1.0);
            Inch inch = new Inch(12.0);
            boolean result = feet.equals(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given12InchAnd1Feet_whenChecked_shouldReturnEqual() {
        try {
            Feet feet = new Feet(1.0);
            Inch inch = new Inch(12.0);
            boolean result = inch.equals(feet);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd2Inch_whenChecked_shouldReturnNotEqual() {
        try {
            Feet feet = new Feet(1.0);
            Inch inch = new Inch(2.0);
            boolean result = feet.equals(inch);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
