package ru.mirea.lab4.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, int value, String color) {
        super(size, value, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("TShirt: size-%s/%d (%s), color-%s, value-%d RUB%n",
                size,size.getEuroSize(), size.getDescription(), color, value);
    }

    @Override
    public void dressWomen() {
        System.out.printf("TShirt: size-%s/%d (%s), color-%s, value-%d RUB%n",
                size,size.getEuroSize(), size.getDescription(), color, value);
    }
}
