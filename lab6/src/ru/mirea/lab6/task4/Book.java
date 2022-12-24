package ru.mirea.lab6.task4;

public class Book implements Priceable {
    private final int price;

    public Book(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
