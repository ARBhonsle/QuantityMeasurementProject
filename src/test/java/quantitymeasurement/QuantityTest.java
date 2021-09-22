package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    // Comparing Lengths: Feet, Inch, Yard, Cm in base unit of inch

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 0.0);
        boolean result = feet1.compare(feet2);
        Assertions.assertTrue(result);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        try {
            QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
            QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 1.0);
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
            QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 1.0);
            boolean result = feet2.compare(feet);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenSameFeet_whenCompared_shouldReturnEqual() {
        try {
            QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 1.0);
            boolean result = feet2.compare(feet2);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 0.0);
        boolean result = inch1.compare(inch2);
        Assertions.assertTrue(result);
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 1.0);
        boolean result = inch1.compare(inch2);
        Assertions.assertFalse(result);
    }

    @Test
    public void givenNullInch_whenCompared_shouldReturnNotEqual() {
        try {
            QuantityMeasurement inch = null;
            QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
            boolean result = inch1.compare(inch);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0InchAnd0Inch_whenCompared_shouldReturnEqual() {
        try {
            QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
            boolean result = inch1.compare(inch1);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0FeetAnd0Inch_whenCompared_shouldReturnEqual() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 0.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 0.0);
            boolean result = feet.compare(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd12Inch_whenCompared_shouldReturnEqual() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 12.0);
            boolean result = feet.compare(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given12InchAnd1Feet_whenCompared_shouldReturnEqual() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 12.0);
            boolean result = inch.compare(feet);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd2Inch_whenCompared_shouldReturnNotEqual() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
            boolean result = feet.compare(inch);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given2InchAnd2Feet_whenCompared_shouldReturnNotEqual() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 2.0);
            boolean result = inch.compare(feet);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 3.0);
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
            boolean result = feet.compare(yard);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1YardAnd3Feet_shouldReturnEqual() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 3.0);
            boolean result = yard.compare(feet);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
            boolean result = feet.compare(yard);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1YardAnd1Feet_shouldReturnNotEqual() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
            boolean result = yard.compare(feet);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqual() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 1.0);
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
            boolean result = inch.compare(yard);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1YardAnd1Inch_shouldReturnNotEqual() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 1.0);
            boolean result = yard.compare(inch);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given36InchAnd1Yard_shouldReturnEqual() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 36.0);
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
            boolean result = inch.compare(yard);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1YardAnd36Inch_shouldReturnEqual() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 36.0);
            boolean result = yard.compare(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given5CmAnd2Inch_shouldReturnEqual() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM, 5.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
            boolean result = cm.compare(inch);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given2InchAnd5Cm_shouldReturnEqual() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM, 5.0);
            boolean result = inch.compare(cm);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given2CmAnd2Inch_shouldReturnNotEqual() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM, 2.0);
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
            boolean result = cm.compare(inch);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1InchAnd1Cm_shouldReturnNotEqual() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 1.0);
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM, 1.0);
            boolean result = inch.compare(cm);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1YardAnd90Cm_shouldReturnEqual() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM, 90.0);
            boolean result = yard.compare(cm);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given90CmAnd1Yard_shouldReturnEqual() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM, 90.0);
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
            boolean result = cm.compare(yard);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1YardAnd1Cm_shouldReturnNotEqual() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM, 1.0);
            boolean result = yard.compare(cm);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1CmAnd1Yard_shouldReturnNotEqual() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM, 1.0);
            QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
            boolean result = cm.compare(yard);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given30CmAnd1Feet_shouldReturnEqual() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM, 30.0);
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
            boolean result = cm.compare(feet);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd30Cm_shouldReturnEqual() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM, 30.0);
            boolean result = feet.compare(cm);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1CmAnd1Feet_shouldReturnNotEqual() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM, 1.0);
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
            boolean result = cm.compare(feet);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd1Cm_shouldReturnNotEqual() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
            QuantityMeasurement cm = new QuantityMeasurement(Length.CM, 1.0);
            boolean result = feet.compare(cm);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Addition of Lengths (base unit = Inch)

    @Test
    public void given2InchAnd2Inch_shouldReturn4Inch() {
        try {
            QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 2.0);
            QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 2.0);
            double result = inch1.addition(inch2);
            double expectedResult = 4.0;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd1Feet_shouldReturn24Inch() {
        try {
            QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 1.0);
            QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 1.0);
            double result = feet1.addition(feet2);
            double expectedResult = 24.0;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given2CmAnd3Cm_shouldReturn2Inch() {
        try {
            QuantityMeasurement cm1 = new QuantityMeasurement(Length.CM, 2.0);
            QuantityMeasurement cm2 = new QuantityMeasurement(Length.CM, 3.0);
            double result = cm1.addition(cm2);
            double expectedResult = 2.0;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1YardAnd1Yard_shouldReturn72Inch() {
        try {
            QuantityMeasurement yard1 = new QuantityMeasurement(Length.YARD, 1.0);
            QuantityMeasurement yard2 = new QuantityMeasurement(Length.YARD, 1.0);
            double result = yard2.addition(yard1);
            double expectedResult = 72.0;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given5CmAnd1Yard_shouldReturn38Inch() {
        try {
            QuantityMeasurement cm1 = new QuantityMeasurement(Length.CM, 5.0);
            QuantityMeasurement yard1 = new QuantityMeasurement(Length.YARD, 1.0);
            double result = cm1.addition(yard1);
            double expectedResult = 38.0;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1YardAnd1Feet_shouldReturn48Inch() {
        try {
            QuantityMeasurement yard1 = new QuantityMeasurement(Length.YARD, 1.0);
            QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 1.0);
            double result = yard1.addition(feet1);
            double expectedResult = 48.0;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd2Inch_shouldReturn14Inch() {
        try {
            QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 1.0);
            QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 2.0);
            double result = feet1.addition(inch2);
            double expectedResult = 14.0;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given2InchAnd5Cm_shouldReturn4Inch() {
        try {
            QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 2.0);
            QuantityMeasurement cm1 = new QuantityMeasurement(Length.CM, 5.0);
            double result = inch1.addition(cm1);
            double expectedResult = 4.0;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given5CmAnd1Feet_shouldReturn14Inch() {
        try {
            QuantityMeasurement cm1 = new QuantityMeasurement(Length.CM, 5.0);
            QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 1.0);
            double result = cm1.addition(feet1);
            double expectedResult = 14;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Comparing Volume: Gallon, Litre, Ml in base of Litre

    @Test
    public void given0GallonAnd0Gallon_shouldReturnEqual() {
        try {
            QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
            QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 0.0);
            boolean result = gallon1.compare(gallon2);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0GallonAnd1Gallon_shouldReturnNotEqual() {
        try {
            QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
            QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 1.0);
            boolean result = gallon1.compare(gallon2);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0LitreAnd0Litre_shouldReturnEqual() {
        try {
            QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
            QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITRE, 0.0);
            boolean result = litre1.compare(litre2);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0LitreAnd1Litre_shouldReturnNotEqual() {
        try {
            QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
            QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITRE, 1.0);
            boolean result = litre1.compare(litre2);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0MlAnd0Ml_shouldReturnEqual() {
        try {
            QuantityMeasurement ml1 = new QuantityMeasurement(Volume.ML, 0.0);
            QuantityMeasurement ml2 = new QuantityMeasurement(Volume.ML, 0.0);
            boolean result = ml1.compare(ml2);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0MlAnd1Ml_shouldReturnNotEqual() {
        try {
            QuantityMeasurement ml1 = new QuantityMeasurement(Volume.ML, 0.0);
            QuantityMeasurement ml2 = new QuantityMeasurement(Volume.ML, 1.0);
            boolean result = ml1.compare(ml2);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0GallonAnd0Litre_shouldReturnEqual() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 0.0);
            QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 0.0);
            boolean result = gallon.compare(litre);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given100GallonAnd378Litre_shouldReturnEqual() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 100.0);
            QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 378.0);
            boolean result = gallon.compare(litre);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1GallonAnd1Litre_shouldReturnNotEqual() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
            QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 1.0);
            boolean result = gallon.compare(litre);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given3780MlAnd1Gallon_shouldReturnEqual() {
        try {
            QuantityMeasurement ml = new QuantityMeasurement(Volume.ML, 3780.0);
            QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
            boolean result = ml.compare(gallon);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1MlAnd1Gallon_shouldReturnNotEqual() {
        try {
            QuantityMeasurement ml = new QuantityMeasurement(Volume.ML, 1.0);
            QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
            boolean result = ml.compare(gallon);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1000MlAnd1Litre_shouldReturnEqual() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Volume.ML, 1000.0);
            QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 1.0);
            boolean result = gallon.compare(litre);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1MlAnd1Litre_shouldReturnNotEqual() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Volume.ML, 1.0);
            QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 1.0);
            boolean result = gallon.compare(litre);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Addition of Volume (base unit : litre)
    @Test
    public void given100GallonAnd100Gallon_shouldReturn756Litre() {
        try {
            QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 100.0);
            QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 100.0);
            double result = gallon1.addition(gallon2);
            double expectedResult = 756;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1LitreAnd1Litre_shouldReturn2Litre() {
        try {
            QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 1.0);
            QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITRE, 1.0);
            double result = litre1.addition(litre2);
            double expectedResult = 2;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1000MlAnd1000Ml_shouldReturn2Litre() {
        try {
            QuantityMeasurement ml1 = new QuantityMeasurement(Volume.ML, 1000.0);
            QuantityMeasurement ml2 = new QuantityMeasurement(Volume.ML, 1000.0);
            double result = ml1.addition(ml2);
            double expectedResult = 2;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given100GallonAnd10Litre_shouldReturn388Litre() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 100.0);
            QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 10.0);
            double result = gallon.addition(litre);
            double expectedResult = 388;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1000MlAnd100Gallon_shouldReturn379Litre() {
        try {
            QuantityMeasurement ml = new QuantityMeasurement(Volume.ML, 1000.0);
            QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 100.0);
            double result = ml.addition(gallon);
            double expectedResult = 379;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1000MlAnd1Litre_shouldReturn2Litre() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Volume.ML, 1000.0);
            QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 1.0);
            double result = gallon.addition(litre);
            double expectedResult = 2;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Weight Comparison for kg, grams, tonne in base unit : kg

    @Test
    public void given0GramsAnd0Kg_shouldReturnEqual() {
        try {
            QuantityMeasurement grams = new QuantityMeasurement(Weight.GRAMS, 0.0);
            QuantityMeasurement kg = new QuantityMeasurement(Weight.KG, 0.0);
            boolean result = grams.compare(kg);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1000GramsAnd1Kg_shouldReturnEqual() {
        try {
            QuantityMeasurement grams = new QuantityMeasurement(Weight.GRAMS, 1000.0);
            QuantityMeasurement kg = new QuantityMeasurement(Weight.KG, 1.0);
            boolean result = grams.compare(kg);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given0TonneAnd0Grams_shouldReturnEqual() {
        try {
            QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 0.0);
            QuantityMeasurement grams = new QuantityMeasurement(Weight.GRAMS, 0.0);
            boolean result = tonne.compare(grams);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1TonneAnd1000000Grams_shouldReturnEqual() {
        try {
            QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Weight.GRAMS, 1000000.0);
            boolean result = tonne.compare(grams);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given0KgAnd0Tonne_shouldReturnEqual() {
        try {
            QuantityMeasurement kg = new QuantityMeasurement(Weight.KG, 0.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 0.0);
            boolean result = kg.compare(tonne);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1000KgAnd1Tonne_shouldReturnEqual() {
        try {
            QuantityMeasurement kg = new QuantityMeasurement(Weight.KG, 1000.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 1.0);
            boolean result = kg.compare(tonne);
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1KgAnd1Tonne_shouldReturnNotEqual() {
        try {
            QuantityMeasurement kg = new QuantityMeasurement(Weight.KG, 1.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 1.0);
            boolean result = kg.compare(tonne);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1KgAnd1Grams_shouldReturnNotEqual() {
        try {
            QuantityMeasurement kg = new QuantityMeasurement(Weight.KG, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Weight.GRAMS, 1.0);
            boolean result = kg.compare(grams);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1TonneAnd1Grams_shouldReturnNotEqual() {
        try {
            QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Weight.GRAMS, 1.0);
            boolean result = tonne.compare(grams);
            Assertions.assertFalse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1TonneAnd1Tonne_shouldReturn2000Kg(){
        try {
            QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 1.0);
            QuantityMeasurement tonne2 = new QuantityMeasurement(Weight.TONNE, 1.0);
            double result = tonne1.addition(tonne2);
            double expectedResult = 2000;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1000GramsAnd1000Grams_shouldReturn2Kg(){
        try {
            QuantityMeasurement grams1 = new QuantityMeasurement(Weight.GRAMS, 1000.0);
            QuantityMeasurement grams2 = new QuantityMeasurement(Weight.GRAMS, 1000.0);
            double result = grams1.addition(grams2);
            double expectedResult = 2;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1000KgAnd1Tonne_shouldReturn2000Kg(){
        try {
            QuantityMeasurement kg = new QuantityMeasurement(Weight.KG, 1000.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 1.0);
            double result = kg.addition(tonne);
            double expectedResult = 2000;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1000GramsAnd1Kg_shouldReturn2Kg(){
        try {
            QuantityMeasurement grams = new QuantityMeasurement(Weight.GRAMS, 1000.0);
            QuantityMeasurement kg = new QuantityMeasurement(Weight.KG, 1.0);
            double result = grams.addition(kg);
            double expectedResult = 2;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void given1000GramsAnd1Tonne_shouldReturn1001Kg(){
        try {
            QuantityMeasurement grams = new QuantityMeasurement(Weight.GRAMS, 1000.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 1.0);
            double result = grams.addition(tonne);
            double expectedResult = 1001;
            Assertions.assertEquals(expectedResult, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Comparing Temperature : Celsius, Fahrenheit

    @Test
    public void given2FahrenheitAnd2Fahrenheit_shouldReturnEqual(){
        try {
            TemperatureCheck fahrenheit1 = new TemperatureCheck(TemperatureCheck.Degree.FAHRENHEIT, 2.0);
            TemperatureCheck fahrenheit2 = new TemperatureCheck(TemperatureCheck.Degree.FAHRENHEIT, 2.0);
            boolean result = fahrenheit1.compare(fahrenheit2);
            Assertions.assertTrue(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void given0FahrenheitAnd2Fahrenheit_shouldReturnNotEqual(){
        try {
            TemperatureCheck fahrenheit1 = new TemperatureCheck(TemperatureCheck.Degree.FAHRENHEIT, 0.0);
            TemperatureCheck fahrenheit2 = new TemperatureCheck(TemperatureCheck.Degree.FAHRENHEIT, 2.0);
            boolean result = fahrenheit1.compare(fahrenheit2);
            Assertions.assertFalse(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void given2CelsiusAnd2Celsius_shouldReturnEqual(){
        try {
            TemperatureCheck celsius1 = new TemperatureCheck(TemperatureCheck.Degree.CELSIUS, 2.0);
            TemperatureCheck celsius2 = new TemperatureCheck(TemperatureCheck.Degree.CELSIUS, 2.0);
            boolean result = celsius1.compare(celsius2);
            Assertions.assertTrue(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void given0CelsiusAnd2Celsius_shouldReturnNotEqual(){
        try {
            TemperatureCheck celsius1 = new TemperatureCheck(TemperatureCheck.Degree.CELSIUS, 0.0);
            TemperatureCheck celsius2 = new TemperatureCheck(TemperatureCheck.Degree.CELSIUS, 2.0);
            boolean result = celsius1.compare(celsius2);
            Assertions.assertFalse(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void given212FahrenheitAnd100Celsius_shouldReturnEqual(){
        try {
            TemperatureCheck fahrenheit = new TemperatureCheck(TemperatureCheck.Degree.FAHRENHEIT, 212.0);
            TemperatureCheck celsius = new TemperatureCheck(TemperatureCheck.Degree.CELSIUS, 100.0);
            boolean result = fahrenheit.compare(celsius);
            Assertions.assertTrue(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void given100CelsiusAnd212Fahrenheit_shouldReturnEqual(){
        try {
            TemperatureCheck celsius = new TemperatureCheck(TemperatureCheck.Degree.CELSIUS, 100.0);
            TemperatureCheck fahrenheit = new TemperatureCheck(TemperatureCheck.Degree.FAHRENHEIT, 212.0);
            boolean result = celsius.compare(fahrenheit);
            Assertions.assertTrue(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void given1FahrenheitAnd1Celsius_shouldReturnNotEqual(){
        try {
            TemperatureCheck fahrenheit = new TemperatureCheck(TemperatureCheck.Degree.FAHRENHEIT, 1.0);
            TemperatureCheck celsius = new TemperatureCheck(TemperatureCheck.Degree.CELSIUS, 1.0);
            boolean result = fahrenheit.compare(celsius);
            Assertions.assertFalse(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void given1CelsiusAnd1Fahrenheit_shouldReturnNotEqual(){
        try {
            TemperatureCheck celsius = new TemperatureCheck(TemperatureCheck.Degree.CELSIUS, 1.0);
            TemperatureCheck fahrenheit = new TemperatureCheck(TemperatureCheck.Degree.FAHRENHEIT, 1.0);
            boolean result = celsius.compare(fahrenheit);
            Assertions.assertFalse(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
