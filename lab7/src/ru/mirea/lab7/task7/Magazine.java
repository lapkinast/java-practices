package ru.mirea.lab7.task7;

import ru.mirea.lab7.task8.Book;

public class Magazine implements Printable {
    private final String name;

    public Magazine(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable[] printable){
        for (Printable pr : printable){
            if (pr instanceof Magazine){
                pr.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
