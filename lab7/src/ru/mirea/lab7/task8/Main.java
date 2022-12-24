package ru.mirea.lab7.task8;

import ru.mirea.lab7.task7.Magazine;
import ru.mirea.lab7.task7.Printable;

public class Main {

    public static void main(String[] args) {
        Printable[] printable = new Printable[]{
                new Book("Moby-Dick"),
                new Magazine("National Geographic")
        };

        System.out.println("Books:");
        Book.printBooks(printable);
        System.out.println();
        System.out.println("Magazines:");
        Magazine.printMagazines(printable);
    }
}
