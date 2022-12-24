package ru.mirea.lab6.task11;

public class Main {
    public static void main(String[] args) {
        Convertable toFahrenheit = new CelsiusToFahrenheit();
        Convertable toKelvin = new CelsiusToKelvin();
        int temperature = 20;

        System.out.println(temperature + " C = " + toFahrenheit.convert(temperature)+ " F");
        System.out.println(temperature + " C = " + toKelvin.convert(temperature)+ " K");
    }
}
