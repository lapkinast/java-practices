package ru.mirea.lab4.task3;

public class Goods {
    private final String name;
    private final int price;

    public Goods(String nameAndPrice) {
        name = nameAndPrice.split(":")[0];
        price = Integer.parseInt(nameAndPrice.split(":")[1]);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
