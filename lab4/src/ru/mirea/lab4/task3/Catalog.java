package ru.mirea.lab4.task3;

public enum  Catalog {
    BOOKS("Business:700", "Comic:400", "Novel:500"),
    TOYS("Plush toys:300", "Toy car:500", "Puzzle:400"),
    SPORTS("Ball:500", "Racket:1000", "Hockey_stick:800");

    private final String[] goods;

    Catalog(String... goods) {
        this.goods = goods;
    }

    public String[] getGoods() {
        return goods;
    }

    public String getDescription() {
        return this.toString().toLowerCase().replaceAll("_", " ");
    }
}
