package ru.mirea.lab6.task10;

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

    public boolean matchInComponents(String s){
        return matrixType.toLowerCase().contains(s) || String.valueOf(screenSize).contains(s);
    }
}
