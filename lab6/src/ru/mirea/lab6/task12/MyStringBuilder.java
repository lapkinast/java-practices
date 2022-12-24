package ru.mirea.lab6.task12;

import java.util.ArrayList;

public class MyStringBuilder {
    private final StringBuilder builder;
    private final ArrayList<String> list;

    public MyStringBuilder() {
        builder = new StringBuilder();
        list = new ArrayList<>();
    }

    public MyStringBuilder append(String str){
        list.add(builder.toString());
        builder.append(str);
        return this;
    }

    public MyStringBuilder append(char c){
        list.add(builder.toString());
        builder.append(c);
        return this;
    }

    public MyStringBuilder append(int i){
        list.add(builder.toString());
        builder.append(i);
        return this;
    }

    public MyStringBuilder appendCodePoint(int codePoint) {
        list.add(builder.toString());
        builder.appendCodePoint(codePoint);
        return this;
    }

    public MyStringBuilder insert(int offset, String str) {
        list.add(builder.toString());
        builder.insert(offset, str);
        return this;
    }

    public MyStringBuilder insert(int offset, char c) {
        list.add(builder.toString());
        builder.insert(offset, c);
        return this;
    }

    public MyStringBuilder insert(int offset, int i) {
        list.add(builder.toString());
        builder.insert(offset, i);
        return this;
    }

    public int compareTo(MyStringBuilder another) {
        return builder.compareTo(new StringBuilder(another.toString()));
    }

    public MyStringBuilder delete(int start, int end) {
        list.add(builder.toString());
        builder.delete(start, end);
        return this;
    }

    public MyStringBuilder deleteCharAt(int index) {
        list.add(builder.toString());
        builder.deleteCharAt(index);
        return this;
    }

    public int indexOf(String str) {
        return builder.indexOf(str);
    }

    public int lastIndexOf(String str) {
        return builder.lastIndexOf(str);
    }

    public MyStringBuilder replace(int start, int end, String str) {
        list.add(builder.toString());
        builder.replace(start, end, str);
        return this;
    }

    public MyStringBuilder reverse() {
        list.add(builder.toString());
        builder.reverse();
        return this;
    }

    public int length() {
        return builder.length();
    }

    public MyStringBuilder undo(){
        builder.delete(0,builder.length());
        if (list.size() > 0){
            builder.append(list.remove(list.size() - 1));
        }
        return this;
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
