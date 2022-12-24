package ru.mirea.lab7.task6;

import ru.mirea.lab7.task5.StringProcessable;

public class ProcessStrings implements StringProcessable {
    @Override
    public int count(String s) {
        return s.length();
    }

    @Override
    public String odd(String s) {
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0){
                builder.append(chars[i]);
            }
        }
        return builder.toString();
    }

    @Override
    public String invert(String s) {
        StringBuilder builder = new StringBuilder(s);
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        ProcessStrings processStrings = new ProcessStrings();
        System.out.println(processStrings.count("Count"));
        System.out.println(processStrings.odd("1234567890"));
        System.out.println(processStrings.invert("1234567890"));
    }

}
