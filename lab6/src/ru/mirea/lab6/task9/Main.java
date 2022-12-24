package ru.mirea.lab6.task9;

import ru.mirea.lab6.task6.Printable;
import ru.mirea.lab6.task7.Book;
import ru.mirea.lab6.task8.Shop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[10];
        Random random = new Random();
        for (int i = 0; i < printables.length; i++) {
            printables[i] = random.nextBoolean() ? new Book() : new Shop();
        }
        for (Printable printable : printables){
            printable.print();
        }
    }
}
