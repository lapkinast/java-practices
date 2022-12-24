package ru.mirea.lab7.task4;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double abs(double mRE, double mIm) {
        return Math.sqrt(mRE * mRE + mIm * mIm);
    }

    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();
        int r = 10;
        double circumference = 2 * r * MathCalculable.getPi();
        System.out.println("circumference = " + circumference);
        double areaOfCircle = mathFunc.pow(r, 2) * MathCalculable.getPi();
        System.out.println("areaOfCircle = " + areaOfCircle);
        double abs = mathFunc.abs(-5, 0);
        System.out.println("abs = " + abs);
    }
}
