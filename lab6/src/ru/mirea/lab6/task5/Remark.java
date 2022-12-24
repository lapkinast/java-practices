package ru.mirea.lab6.task5;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Remark {

    public String check(Shape shape){
        List<String> remarks = new ArrayList<>();
        if (colorCheck(shape)){
            remarks.add("Wrong shape color");
        }
        if (sizeCheck(shape)){
            remarks.add("Wrong shape size");
        }

        if (remarks.size() == 0){
            return "No remarks";
        } else {
            return String.join(", ", remarks);
        }
    }

    private boolean colorCheck(Shape shape){
        return shape.getColor().getRed() > 245 && shape.getColor().getGreen() > 245 && shape.getColor().getBlue() > 245;
    }

    private boolean sizeCheck(Shape shape){
        return shape.height == 0 || shape.width == 0;
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[20];
        Random random = new Random();
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = new MovableCircle(random.nextInt(200), random.nextInt(200),
                    random.nextInt(200), random.nextInt(200), random.nextInt(200), 0,
                    new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255))
            );
        }

        Remark remark = new Remark();
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape #" + i + " " + remark.check(shapes[i]));
        }
    }

}
