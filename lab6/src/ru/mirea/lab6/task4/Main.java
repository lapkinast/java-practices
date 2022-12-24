package ru.mirea.lab6.task4;

public class Main {

    public static void main(String[] args) {
        Book book = new Book(100);
        Toy toy = new Toy(50);

        System.out.println(book.getPrice());
        System.out.println(toy.getPrice());
    }
}
