package ru.mirea.lab4.task2;

public abstract class Clothes {

    Size size;
    int value;
    String color;

    public Clothes(Size size, int value, String color) {
        this.size = size;
        this.value = value;
        this.color = color;
    }
}
