package ru.mirea.lab6.task4;

public class Toy implements Priceable {

    private final int price;

    public Toy(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
