package ru.mirea.lab4.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, int value, String color) {
        super(size, value, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Pants: size-%s/%d (%s), color-%s, value-%d RUB%n",
                size,size.getEuroSize(), size.getDescription(), color, value);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Pants: size-%s/%d (%s), color-%s, value-%d RUB%n",
                size,size.getEuroSize(), size.getDescription(), color, value);
    }
}
