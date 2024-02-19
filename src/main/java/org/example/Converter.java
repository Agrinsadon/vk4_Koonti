package org.example;

public class Main {

    public static void main(String[] args) {
        double fahrenheit = 212.0;
        double celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);

        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius");
    }
}
