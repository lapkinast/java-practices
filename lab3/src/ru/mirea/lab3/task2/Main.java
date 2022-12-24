package ru.mirea.lab3.task2;

public class Main {
    public static void main(String[] args) {
//        1
        System.out.println(Double.valueOf(10.23456));
        System.out.println(Double.valueOf("12.3"));
//        2
        String s = "33.456";
        Double d = Double.parseDouble(s);
//        3
        float f = d.floatValue();
        byte b = d.byteValue();
        char c = (char) d.shortValue();
        double d3 = d.doubleValue();
        int i = d.intValue();
        long l = d.longValue();
        short sh = d.shortValue();
//        4
        System.out.println(d);
//        5
        String d5 = Double.toString(3.14);
    }
}
