package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityUnitAndValueTest {
    // comparing Units of type : length, volume, weight, temperature

    @Test
    public void given1FeetAnd1Gallon_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            boolean result = feet.compare(gallon);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Litre_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            boolean result = feet.compare(litre);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Ml_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            boolean result = feet.compare(ml);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.getType());
        }
    }

    @Test
    public void given1FeetAnd1Kg_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            boolean result = feet.compare(kg);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Grams_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            boolean result = feet.compare(grams);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Tonne_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            boolean result = feet.compare(tonne);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Fahrenheit_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            boolean result = feet.compare(degF);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Celsius_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            boolean result = feet.compare(degC);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Gallon_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            boolean result = yard.compare(gallon);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Litre_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            boolean result = yard.compare(litre);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Ml_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            boolean result = yard.compare(ml);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Kg_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            boolean result = yard.compare(kg);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Grams_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            boolean result = yard.compare(grams);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Tonne_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            boolean result = yard.compare(tonne);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Fahrenheit_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            boolean result = yard.compare(degF);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Celsius_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            boolean result = yard.compare(degC);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Gallon_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            boolean result = inch.compare(gallon);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Litre_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            boolean result = inch.compare(litre);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Ml_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            boolean result = inch.compare(ml);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Kg_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            boolean result = inch.compare(kg);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Grams_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            boolean result = inch.compare(grams);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Tonne_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            boolean result = inch.compare(tonne);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Fahrenheit_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            boolean result = inch.compare(degF);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Celsius_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            boolean result = inch.compare(degC);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Gallon_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            boolean result = cm.compare(gallon);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Litre_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            boolean result = cm.compare(litre);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Ml_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            boolean result = cm.compare(ml);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Kg_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            boolean result = cm.compare(tonne);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Grams_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            boolean result = cm.compare(grams);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Tonne_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            boolean result = cm.compare(tonne);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Fahrenheit_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            boolean result = cm.compare(degF);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Celsius_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            boolean result = cm.compare(degC);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1GallonAnd1Tonne_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            boolean result = gallon.compare(tonne);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1GallonAnd1Kg_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            boolean result = gallon.compare(kg);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1GallonAnd1Grams_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            boolean result = gallon.compare(grams);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1GallonAnd1Fahrenheit_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            boolean result = gallon.compare(degF);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1GallonAnd1Celsius_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            boolean result = gallon.compare(degC);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1LitreAnd1Tonne_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            boolean result = litre.compare(degC);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1LitreAnd1Kg_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            boolean result = litre.compare(kg);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1LitreAnd1Grams_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            boolean result = litre.compare(grams);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1LitreAnd1Fahrenheit_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            boolean result = litre.compare(degF);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1LitreAnd1Celsius_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            boolean result = litre.compare(degC);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1MlAnd1Tonne_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            boolean result = ml.compare(degC);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1MlAnd1Kg_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            boolean result = ml.compare(kg);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1MlAnd1Fahrenheit_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            boolean result = ml.compare(degF);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1MlAnd1Celsius_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            boolean result = ml.compare(degC);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1TonneAnd1Fahrenheit_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            boolean result = tonne.compare(degF);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1TonneAnd1Celsius_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            boolean result = tonne.compare(degC);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1KgAnd1Fahrenheit_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            boolean result = kg.compare(degF);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1KgAnd1Celsius_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            boolean result = kg.compare(degC);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1GramsAnd1Fahrenheit_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            boolean result = grams.compare(degF);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1GramsAnd1Celsius_whenCompared_shouldReturnException() {
        try {
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            boolean result = grams.compare(degC);
            Assertions.assertFalse(result);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }
    // Addition of units of different types: length, volume, weight, temperature


    @Test
    public void given1FeetAnd1Gallon_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            double result = feet.addition(gallon);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Litre_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            double result = feet.addition(litre);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Ml_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            double result = feet.addition(ml);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Kg_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            double result = feet.addition(kg);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Grams_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            double result = feet.addition(grams);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Tonne_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            double result = feet.addition(tonne);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Fahrenheit_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            double result = feet.addition(degF);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Celsius_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            double result = feet.addition(degC);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Gallon_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            double result = yard.addition(gallon);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Litre_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            double result = yard.addition(litre);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Ml_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            double result = yard.addition(ml);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Kg_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            double result = yard.addition(kg);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Grams_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            double result = yard.addition(grams);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Tonne_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            double result = yard.addition(tonne);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Fahrenheit_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            double result = yard.addition(degF);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1YardAnd1Celsius_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            double result = yard.addition(degC);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Gallon_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            double result = inch.addition(gallon);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Litre_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            double result = inch.addition(litre);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Ml_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            double result = inch.addition(ml);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Kg_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            double result = inch.addition(kg);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Grams_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            double result = inch.addition(grams);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Tonne_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            double result = inch.addition(tonne);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Fahrenheit_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            double result = inch.addition(degF);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1InchAnd1Celsius_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            double result = inch.addition(degC);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Gallon_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            double result = cm.addition(gallon);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Litre_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            double result = cm.addition(litre);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Ml_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            double result = cm.addition(ml);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Kg_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            double result = cm.addition(kg);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Grams_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            double result = cm.addition(grams);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Tonne_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            double result = cm.addition(tonne);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Fahrenheit_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            double result = cm.addition(degF);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1CmAnd1Celsius_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            double result = cm.addition(degC);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1GallonAnd1Tonne_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            double result = gallon.addition(tonne);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1GallonAnd1Kg_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            double result = gallon.addition(kg);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1GallonAnd1Grams_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            double result = gallon.addition(grams);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1GallonAnd1Fahrenheit_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            double result = gallon.addition(degF);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1GallonAnd1Celsius_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            double result = gallon.addition(degC);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1LitreAnd1Tonne_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            double result = litre.addition(tonne);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1LitreAnd1Kg_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            double result = litre.addition(kg);

        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1LitreAnd1Fahrenheit_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            double result = litre.addition(degF);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1LitreAnd1Celsius_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            double result = litre.addition(degC);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1MlAnd1Tonne_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            double result = ml.addition(tonne);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1MlAnd1Kg_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            double result = ml.addition(kg);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1LitreAnd1Grams_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            double result = ml.addition(grams);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1MlAnd1Fahrenheit_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            double result = ml.addition(degF);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1MlAnd1Celsius_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement ml = new QuantityMeasurement(Unit.ML, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            double result = ml.addition(degC);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1TonneAnd1Fahrenheit_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            double result = degF.addition(tonne);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1TonneAnd1Celsius_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            double result = degC.addition(tonne);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1KgAnd1Fahrenheit_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            double result = kg.addition(degF);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1KgAnd1Celsius_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            double result = kg.addition(degC);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1GramsAnd1Fahrenheit_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            QuantityMeasurement degF = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
            double result = grams.addition(degF);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }

    @Test
    public void given1GramsAnd1Celsius_whenAdded_shouldReturnUnitsException() {
        try {
            QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1.0);
            QuantityMeasurement degC = new QuantityMeasurement(Unit.CELSIUS, 1.0);
            double result = grams.addition(degC);
        } catch (UnitsException e) {
            Assertions.assertEquals(UnitsException.Exceptions.TYPE_MISMATCH, e.type);
        }
    }
}
