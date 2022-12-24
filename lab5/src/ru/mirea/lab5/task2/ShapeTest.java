package ru.mirea.lab5.task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapeTest extends JFrame{

    private final Shape[] shapes;

    public ShapeTest(Shape[] shapes){
        this.shapes = shapes;
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g){

        for (Shape shape : shapes){
            g.setColor(shape.getColor());
            if (shape instanceof Rectangle) g.drawRect(shape.x, shape.y, shape.width, shape.height);
            if (shape instanceof Square) g.drawRect(shape.x, shape.y, shape.width, shape.height);
            if (shape instanceof Oval) g.drawOval(shape.x, shape.y, shape.width, shape.height);
            if (shape instanceof Circle) g.drawOval(shape.x, shape.y, shape.width, shape.height);
        }
    }

    public static void main(String[] args){
        Shape[] shapes = new Shape[20];
        Random random = new Random();
        for (int i = 0; i < shapes.length; i++) {
            switch (random.nextInt(3)){
                case 0:
                    shapes[i] = new Rectangle(
                            random.nextInt(200), random.nextInt(200),
                            random.nextInt(200), random.nextInt(200),
                            new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255))
                            );
                    break;
                case 1:
                    shapes[i] = new Square(
                            random.nextInt(200), random.nextInt(200),
                            random.nextInt(200), 0,
                            new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255))
                            );
                    break;
                case 2:
                    shapes[i] = new Oval(
                            random.nextInt(200), random.nextInt(200),
                            random.nextInt(200), random.nextInt(200),
                            new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255))
                            );
                    break;
                case 3:
                    shapes[i] = new Circle(
                            random.nextInt(200), random.nextInt(200),
                            random.nextInt(200),0,
                            new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255))
                            );
                    break;
            }
        }
        new ShapeTest(shapes);
    }
}