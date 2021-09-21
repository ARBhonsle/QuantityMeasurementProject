package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        boolean result = feet1.compare(feet2);
        Assertions.assertTrue(result);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        try {
            Length feet1 = new Length(Length.Unit.FEET,0.0);
            Length feet2 = new Length(Length.Unit.FEET,1.0);
            boolean result = feet1.compare(feet2);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullFeet_whenCompared_shouldReturnNotEqual() {
        try {
            Length feet = null;
            Length feet2 = new Length(Length.Unit.FEET,1.0);
            boolean result = feet2.compare(feet);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenSameFeet_whenCompared_shouldReturnEqual() {
        try {
            Length feet2 = new Length(Length.Unit.FEET,1.0);
            boolean result = feet2.compare(feet2);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        boolean result = inch1.compare(inch2);
        Assertions.assertTrue(result);
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        boolean result = inch1.compare(inch2);
        Assertions.assertFalse(result);
    }

    @Test
    public void givenNullInch_whenCompared_shouldReturnNotEqual() {
        try {
            Length inch = null;
            Length inch1 = new Length(Length.Unit.INCH,0.0);
            boolean result = inch1.compare(inch);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0InchAnd0Inch_whenCompared_shouldReturnEqual() {
        try {
            Length inch1 = new Length(Length.Unit.INCH,0.0);
            boolean result = inch1.compare(inch1);
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
            boolean result = feet.compare(inch);
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
            boolean result = feet.compare(inch);
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
            boolean result = inch.compare(feet);
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
            boolean result = feet.compare(inch);
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
            boolean result = inch.compare(feet);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual(){
        try {
            Length feet = new Length(Length.Unit.FEET,3.0);
            Length yard = new Length(Length.Unit.YARD,1.0);
            boolean result = feet.compare(yard);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1YardAnd3Feet_shouldReturnEqual(){
        try {
            Length yard = new Length(Length.Unit.YARD,1.0);
            Length feet = new Length(Length.Unit.FEET,3.0);
            boolean result = yard.compare(feet);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual(){
        try {
            Length feet = new Length(Length.Unit.FEET,1.0);
            Length yard = new Length(Length.Unit.YARD,1.0);
            boolean result = feet.compare(yard);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1YardAnd1Feet_shouldReturnNotEqual(){
        try {
            Length yard = new Length(Length.Unit.YARD,1.0);
            Length feet = new Length(Length.Unit.FEET,1.0);
            boolean result = yard.compare(feet);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqual(){
        try {
            Length inch = new Length(Length.Unit.INCH,1.0);
            Length yard = new Length(Length.Unit.YARD,1.0);
            boolean result = inch.compare(yard);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1YardAnd1Inch_shouldReturnNotEqual(){
        try {
            Length yard = new Length(Length.Unit.YARD,1.0);
            Length inch = new Length(Length.Unit.INCH,1.0);
            boolean result = yard.compare(inch);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given36InchAnd1Yard_shouldReturnEqual(){
        try {
            Length inch = new Length(Length.Unit.INCH,36.0);
            Length yard = new Length(Length.Unit.YARD,1.0);
            boolean result = inch.compare(yard);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1YardAnd36Inch_shouldReturnEqual(){
        try {
            Length yard = new Length(Length.Unit.YARD,1.0);
            Length inch = new Length(Length.Unit.INCH,36.0);
            boolean result = yard.compare(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given5CmAnd2Inch_shouldReturnEqual(){
        try {
            Length cm = new Length(Length.Unit.CM,5.0);
            Length inch = new Length(Length.Unit.INCH,2.0);
            boolean result = cm.compare(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given2InchAnd5Cm_shouldReturnEqual(){
        try {
            Length inch = new Length(Length.Unit.INCH,2.0);
            Length cm = new Length(Length.Unit.CM,5.0);
            boolean result = inch.compare(cm);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
