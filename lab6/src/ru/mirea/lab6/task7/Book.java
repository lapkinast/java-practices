package ru.mirea.lab6.task7;

import ru.mirea.lab6.task6.Printable;

public class Book implements Printable {
    @Override
    public void print() {
        System.out.println("I am Book");
    }
}
