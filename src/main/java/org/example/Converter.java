package org.example;

public class Converter {

    private double fahrenheit;

    public Converter(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double toCelsius() {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static float kelvinToCelsius(float kelvin) {
        return kelvin - 273.15F;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return ((kelvin - 273.15) * 9 / 5) + 32;
    }
}
