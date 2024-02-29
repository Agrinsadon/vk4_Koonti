import org.example.Converter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test
    public void testToCelsius() {
        double fahrenheit = 32.0;

        Converter converter = new Converter(fahrenheit);
        double celsius = converter.toCelsius();

        assertEquals(0.0, celsius, 0.001);
    }

    @Test
    public void testKelvinToCelsius() {
        float kelvin = 273.15F;

        float celsius = Converter.kelvinToCelsius(kelvin);

        assertEquals(0.0, celsius, 0.001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        double fahrenheit = 212.0;

        double celsius = Converter.fahrenheitToCelsius(fahrenheit);

        assertEquals(100.0, celsius, 0.001);
    }

    @Test
    public void testKelvinToFahrenheit() {
        double kelvin = 300.1;

        double fahrenheit = Converter.kelvinToFahrenheit(kelvin);

        assertEquals(80.51, Math.round(fahrenheit * 100.0) / 100.0, 0.01);
    }
}
