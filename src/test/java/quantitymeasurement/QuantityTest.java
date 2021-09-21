package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        boolean equal = feet1.equals(feet2);
        Assertions.assertTrue(equal);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        try {
            Feet feet1 = new Feet(0.0);
            Feet feet2 = new Feet(1.0);
            boolean equal = feet1.equals(feet2);
            Assertions.assertFalse(equal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullFeet_whenChecked_shouldReturnNotEqual() {
        try {
            Feet feet = null;
            Feet feet2 = new Feet(1.0);
            boolean result = feet2.equals(feet);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenSameFeet_whenChecked_shouldReturnEqual() {
        try {
            Feet feet2 = new Feet(1.0);
            boolean result = feet2.equals(feet2);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        boolean equal = inch1.equals(inch2);
        Assertions.assertTrue(equal);
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        boolean equal = inch1.equals(inch2);
        Assertions.assertFalse(equal);
    }

    @Test
    public void givenNullInch_whenChecked_shouldReturnNotEqual() {
        try {
            Inch inch = null;
            Inch inch1 = new Inch(0.0);
            boolean result = inch1.equals(inch);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenSameInch_whenChecked_shouldReturnEqual() {
        try {
            Inch inch1 = new Inch(0.0);
            boolean result = inch1.equals(inch1);
            Assertions.assertTrue(result);
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

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual(){
        try {
            Feet feet = new Feet(3.0);
            Yard yard = new Yard(1.0);
            boolean result = feet.equals(yard);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1YardAnd3Feet_shouldReturnEqual(){
        try {
            Yard yard = new Yard(1.0);
            Feet feet = new Feet(3.0);
            boolean result = yard.equals(feet);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual(){
        try {
            Feet feet = new Feet(1.0);
            Yard yard = new Yard(1.0);
            boolean result = feet.equals(yard);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqual(){
        try {
            Inch inch = new Inch(1.0);
            Yard yard = new Yard(1.0);
            boolean result = inch.equals(yard);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given36InchAnd1Yard_shouldReturnEqual(){
        try {
            Inch inch = new Inch(36.0);
            Yard yard = new Yard(1.0);
            boolean result = inch.equals(yard);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1YardAnd36Inch_shouldReturnEqual(){
        try {
            Yard yard = new Yard(1.0);
            Inch inch = new Inch(36.0);
            boolean result = yard.equals(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
