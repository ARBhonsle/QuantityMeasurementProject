package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        boolean equal = feet1.equals(feet2);
        Assertions.assertTrue(equal);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        try {
            Length feet1 = new Length(Length.Unit.FEET,0.0);
            Length feet2 = new Length(Length.Unit.FEET,1.0);
            boolean equal = feet1.equals(feet2);
            Assertions.assertFalse(equal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullFeet_whenCompared_shouldReturnNotEqual() {
        try {
            Length feet = null;
            Length feet2 = new Length(Length.Unit.FEET,1.0);
            boolean result = feet2.equals(feet);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenSameFeet_whenCompared_shouldReturnEqual() {
        try {
            Length feet2 = new Length(Length.Unit.FEET,1.0);
            boolean result = feet2.equals(feet2);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        boolean equal = inch1.equals(inch2);
        Assertions.assertTrue(equal);
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        boolean equal = inch1.equals(inch2);
        Assertions.assertFalse(equal);
    }

    @Test
    public void givenNullInch_whenCompared_shouldReturnNotEqual() {
        try {
            Length inch = null;
            Length inch1 = new Length(Length.Unit.INCH,0.0);
            boolean result = inch1.equals(inch);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenSameInch_whenCompared_shouldReturnEqual() {
        try {
            Length inch1 = new Length(Length.Unit.INCH,0.0);
            boolean result = inch1.equals(inch1);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0FeetAnd0Inch_whenCompared_shouldReturnEqual() {
        try {
            Length feet = new Length(Length.Unit.FEET,0.0);
            Length inch = new Length(Length.Unit.INCH,0.0);
            boolean result = feet.equals(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd12Inch_whenCompared_shouldReturnEqual() {
        try {
            Length feet = new Length(Length.Unit.FEET,1.0);
            Length inch = new Length(Length.Unit.INCH,12.0);
            boolean result = feet.equals(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given12InchAnd1Feet_whenCompared_shouldReturnEqual() {
        try {
            Length feet = new Length(Length.Unit.FEET,1.0);
            Length inch = new Length(Length.Unit.INCH,12.0);
            boolean result = inch.equals(feet);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd2Inch_whenCompared_shouldReturnNotEqual() {
        try {
            Length feet = new Length(Length.Unit.FEET,1.0);
            Length inch = new Length(Length.Unit.INCH,2.0);
            boolean result = feet.equals(inch);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given2InchAnd2Feet_whenCompared_shouldReturnNotEqual() {
        try {
            Length inch = new Length(Length.Unit.INCH,2.0);
            Length feet = new Length(Length.Unit.FEET,2.0);
            boolean result = inch.equals(feet);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
