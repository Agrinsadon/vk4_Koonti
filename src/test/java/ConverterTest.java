import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

public class TemperatureConverterTest {

    @Test
    public void testFahrenheitToCelsius() {
        double fahrenheit = 32.0;
        double expectedCelsius = 0.0;

        assertEquals(expectedCelsius, TemperatureConverter.fahrenheitToCelsius(fahrenheit), 0.001);
    }
}
