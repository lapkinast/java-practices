package ru.mirea.lab6.task11;

public class CelsiusToFahrenheit implements Convertable {
    @Override
    public double convert(double original) {
        return original * 1.8 + 32;
    }
}
