package ru.mirea.lab6.task5;

import java.awt.*;

public class MovableCircle extends Shape implements Movable {

    private final MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int diameter, int nothing, Color color) {
        super(diameter, diameter, color);
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
