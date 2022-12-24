package ru.mirea.lab6.task3;

public class Animal implements Nameable{

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
