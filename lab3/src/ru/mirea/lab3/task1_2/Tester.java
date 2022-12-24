package ru.mirea.lab3.task1_2;

import java.util.Random;

public class Tester {

    private final Circle[] circles;
    private int count = 0;

    public Tester(int circlesSize) {
       circles = new Circle[circlesSize];
    }

    public void addCircle(Circle circle){
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        }
    }

    public Circle getMinCircle(){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (circles[i].getRadius() < min){
                min = circles[i].getRadius();
                index = i;
            }
        }
        return circles[index];
    }

    public Circle getMaxCircle(){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (circles[i].getRadius() > max){
                max = circles[i].getRadius();
                index = i;
            }
        }
        return circles[index];
    }

    public Circle[] getCircles() {
        return circles;
    }

    public static void main(String[] args) {
        Tester tester = new Tester(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            tester.addCircle(new Circle(
                    new Point(random.nextInt(10),
                    random.nextInt(10)), random.nextInt(100)));

        }

        System.out.println("Min circle: " + tester.getMinCircle().getRadius());
        System.out.println("Max circle: " + tester.getMaxCircle().getRadius());
    }
}
