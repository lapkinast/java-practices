package ru.mirea.lab4.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, int value, String color) {
        super(size, value, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Tie: size-%s/%d (%s), color-%s, value-%d RUB%n",
                size,size.getEuroSize(), size.getDescription(), color, value);
    }
}
