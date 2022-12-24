package ru.mirea.lab6.task13;

public class ClassObserver implements Observer{
    private final String name;

    public ClassObserver(String name, MyStringBuilder builder) {
        this.name = name;
        builder.registerObserver(this);
    }

    @Override
    public void update(MyStringBuilder builder) {
        System.out.println(name + " knew that from now on MyStringBuilder contains \"" + builder + "\"");
    }
}
