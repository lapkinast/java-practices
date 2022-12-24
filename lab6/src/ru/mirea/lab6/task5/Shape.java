package ru.mirea.lab6.task5;

import java.awt.*;

public abstract class Shape {
    protected final int width;
    protected final int height;
    private final Color color;

    public Shape(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }
}

