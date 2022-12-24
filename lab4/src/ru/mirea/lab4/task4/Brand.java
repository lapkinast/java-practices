package ru.mirea.lab4.task4;

public enum Brand {
    APPLE("Apple"),
    ASUS("Asus"),
    LENOVO("Lenovo");

    private final String name;

    Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
