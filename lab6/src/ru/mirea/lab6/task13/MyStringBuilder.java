package ru.mirea.lab6.task13;


import java.util.ArrayList;

public class MyStringBuilder implements Observable {
    private final StringBuilder builder;
    private final ArrayList<Observer> observers;

    public MyStringBuilder() {
        builder = new StringBuilder();
        observers = new ArrayList<>();
    }

    public MyStringBuilder append(String str) {
        builder.append(str);
        notifyObserver();
        return this;
    }

    public MyStringBuilder append(char c) {
        builder.append(c);
        notifyObserver();
        return this;
    }

    public MyStringBuilder append(int i) {
        builder.append(i);
        notifyObserver();
        return this;
    }

    public MyStringBuilder appendCodePoint(int codePoint) {
        builder.appendCodePoint(codePoint);
        notifyObserver();
        return this;
    }

    public MyStringBuilder insert(int offset, String str) {
        builder.insert(offset, str);
        notifyObserver();
        return this;
    }

    public MyStringBuilder insert(int offset, char c) {
        builder.insert(offset, c);
        notifyObserver();
        return this;
    }

    public MyStringBuilder insert(int offset, int i) {
        builder.insert(offset, i);
        notifyObserver();
        return this;
    }

    public int compareTo(ru.mirea.lab6.task12.MyStringBuilder another) {
        return builder.compareTo(new StringBuilder(another.toString()));
    }

    public MyStringBuilder delete(int start, int end) {
        builder.delete(start, end);
        notifyObserver();
        return this;
    }

    public MyStringBuilder deleteCharAt(int index) {
        builder.deleteCharAt(index);
        notifyObserver();
        return this;
    }

    public int indexOf(String str) {
        return builder.indexOf(str);
    }

    public int lastIndexOf(String str) {
        return builder.lastIndexOf(str);
    }

    public MyStringBuilder replace(int start, int end, String str) {
        builder.replace(start, end, str);
        notifyObserver();
        return this;
    }

    public MyStringBuilder reverse() {
        builder.reverse();
        notifyObserver();
        return this;
    }

    public int length() {
        return builder.length();
    }

    @Override
    public String toString() {
        return builder.toString();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

