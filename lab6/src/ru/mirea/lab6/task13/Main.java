package ru.mirea.lab6.task13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder();
        ArrayList<Observer> observers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            observers.add(new ClassObserver("Observer-" + i, builder));
        }

        builder.append("A long time ago");
        builder.append(", in a galaxy far, far away....");
    }
}
