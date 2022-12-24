package ru.mirea.lab4.task2;

public enum Size {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription(){
        if (this == XXS) {
            return "child size";
        }
        return "Adult size";
    }
}
