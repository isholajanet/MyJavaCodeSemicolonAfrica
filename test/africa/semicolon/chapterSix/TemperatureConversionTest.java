package africa.semicolon.chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConversionTest {
    @Test
    void testThatSystemCanCalculateCelsius(){
        assertEquals(0.003, TemperatureConversion.calculateCelsius(212));
    }
    @Test
    void testThatSystemCanCalculateFahrenheit(){
        assertEquals(0.008, TemperatureConversion.calculateFahrenheit(180));
    }
}
