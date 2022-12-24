package ru.mirea.lab6.task3;

public class Main {

    public static void main(String[] args) {
        Planet planet = new Planet("Earth");
        Car car = new Car("Volkswagen");
        Animal animal = new Animal("Cat");

        System.out.println(planet.getName());
        System.out.println(car.getName());
        System.out.println(animal.getName());
    }
}
