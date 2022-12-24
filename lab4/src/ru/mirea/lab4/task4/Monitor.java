package ru.mirea.lab4.task4;

public class Monitor {
    private final String matrixType;
    private final double screenSize;

    public Monitor(String matrixType, double screenSize) {
        this.matrixType = matrixType;
        this.screenSize = screenSize;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public double getScreenSize() {
        return screenSize;
    }
}
