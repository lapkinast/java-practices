package ru.mirea.lab6.task12;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder();
        System.out.println(builder.append("1234567890"));
        builder.append(113);
        builder.append(113);
        builder.reverse();
        System.out.println(builder);
        builder.undo();
        System.out.println(builder);
        builder.undo();
        System.out.println(builder);
        System.out.println(builder.undo());
        System.out.println(builder.undo());
        System.out.println(builder.undo());
        System.out.println(builder.undo());


    }
}
