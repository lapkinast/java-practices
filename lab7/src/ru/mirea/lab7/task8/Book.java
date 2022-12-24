package ru.mirea.lab7.task8;

import ru.mirea.lab7.task7.Printable;


public class Book implements Printable{

    private final String name;

    public Book(String name) {
        this.name = name;
    }

    public static void printBooks(Printable[] printable){
        for (Printable pr : printable){
            if (pr instanceof Book){
                pr.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
