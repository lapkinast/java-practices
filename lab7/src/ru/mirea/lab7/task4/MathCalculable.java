package ru.mirea.lab7.task4;

public interface MathCalculable {
    double pow(double a, double b);
    double abs(double mRE, double mIm);

    static double getPi () {
        return Math.PI;
    }
}
