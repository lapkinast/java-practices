package ru.mirea.lab6.task10;

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
