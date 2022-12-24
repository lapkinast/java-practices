package ru.mirea.lab6.task11;

public class CelsiusToKelvin implements Convertable {
    @Override
    public double convert(double original) {
        return original + 273.15;
    }
}
