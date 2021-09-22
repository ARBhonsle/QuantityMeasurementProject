package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET,0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET,0.0);
        boolean result = feet1.compare(feet2);
        Assertions.assertTrue(result);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        try {
            QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET,0.0);
            QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET,1.0);
            boolean result = feet1.compare(feet2);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullFeet_whenCompared_shouldReturnNotEqual() {
        try {
            QuantityMeasurement feet = null;
            QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET,1.0);
            boolean result = feet2.compare(feet);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenSameFeet_whenCompared_shouldReturnEqual() {
        try {
            QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET,1.0);
            boolean result = feet2.compare(feet2);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH,0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH,0.0);
        boolean result = inch1.compare(inch2);
        Assertions.assertTrue(result);
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH,0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH,1.0);
        boolean result = inch1.compare(inch2);
        Assertions.assertFalse(result);
    }

    @Test
    public void givenNullInch_whenCompared_shouldReturnNotEqual() {
        try {
            QuantityMeasurement inch = null;
            QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH,0.0);
            boolean result = inch1.compare(inch);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0InchAnd0Inch_whenCompared_shouldReturnEqual() {
        try {
            QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH,0.0);
            boolean result = inch1.compare(inch1);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0FeetAnd0Inch_whenCompared_shouldReturnEqual() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET,0.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH,0.0);
            boolean result = feet.compare(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd12Inch_whenCompared_shouldReturnEqual() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET,1.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH,12.0);
            boolean result = feet.compare(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given12InchAnd1Feet_whenCompared_shouldReturnEqual() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET,1.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH,12.0);
            boolean result = inch.compare(feet);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd2Inch_whenCompared_shouldReturnNotEqual() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET,1.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH,2.0);
            boolean result = feet.compare(inch);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given2InchAnd2Feet_whenCompared_shouldReturnNotEqual() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH,2.0);
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET,2.0);
            boolean result = inch.compare(feet);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual(){
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET,3.0);
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD,1.0);
            boolean result = feet.compare(yard);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1YardAnd3Feet_shouldReturnEqual(){
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD,1.0);
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET,3.0);
            boolean result = yard.compare(feet);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual(){
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET,1.0);
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD,1.0);
            boolean result = feet.compare(yard);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1YardAnd1Feet_shouldReturnNotEqual(){
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD,1.0);
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET,1.0);
            boolean result = yard.compare(feet);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqual(){
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH,1.0);
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD,1.0);
            boolean result = inch.compare(yard);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1YardAnd1Inch_shouldReturnNotEqual(){
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD,1.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH,1.0);
            boolean result = yard.compare(inch);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given36InchAnd1Yard_shouldReturnEqual(){
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH,36.0);
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD,1.0);
            boolean result = inch.compare(yard);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1YardAnd36Inch_shouldReturnEqual(){
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD,1.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH,36.0);
            boolean result = yard.compare(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given5CmAnd2Inch_shouldReturnEqual(){
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM,5.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH,2.0);
            boolean result = cm.compare(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given2InchAnd5Cm_shouldReturnEqual(){
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH,2.0);
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM,5.0);
            boolean result = inch.compare(cm);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given2CmAnd2Inch_shouldReturnNotEqual(){
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM,2.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH,2.0);
            boolean result = cm.compare(inch);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1InchAnd1Cm_shouldReturnNotEqual(){
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH,1.0);
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM,1.0);
            boolean result = inch.compare(cm);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1YardAnd90Cm_shouldReturnEqual(){
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD,1.0);
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM,90.0);
            boolean result = yard.compare(cm);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given90CmAnd1Yard_shouldReturnEqual(){
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM,90.0);
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD,1.0);
            boolean result = cm.compare(yard);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1YardAnd1Cm_shouldReturnNotEqual(){
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD,1.0);
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM,1.0);
            boolean result = yard.compare(cm);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1CmAnd1Yard_shouldReturnNotEqual(){
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM,1.0);
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD,1.0);
            boolean result = cm.compare(yard);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given30CmAnd1Feet_shouldReturnEqual(){
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM,30.0);
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET,1.0);
            boolean result = cm.compare(feet);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1FeetAnd30Cm_shouldReturnEqual(){
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET,1.0);
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM,30.0);
            boolean result = feet.compare(cm);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1CmAnd1Feet_shouldReturnNotEqual(){
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM,1.0);
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET,1.0);
            boolean result = cm.compare(feet);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1FeetAnd1Cm_shouldReturnNotEqual(){
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET,1.0);
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM,1.0);
            boolean result = feet.compare(cm);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
