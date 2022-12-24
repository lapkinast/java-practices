package ru.mirea.lab6.task13;

public interface Observable {
    void registerObserver(Observer o);
    void notifyObserver();
}
