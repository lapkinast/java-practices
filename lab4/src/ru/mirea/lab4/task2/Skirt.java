package ru.mirea.lab4.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, int value, String color) {
        super(size, value, color);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Skirt: size-%s/%d (%s), color-%s, value-%d RUB%n",
                size,size.getEuroSize(), size.getDescription(), color, value);
    }
}
