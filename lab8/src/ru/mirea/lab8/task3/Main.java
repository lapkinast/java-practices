package ru.mirea.lab8.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("a = ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("b = ");
        int b = Integer.parseInt(reader.readLine());
        recursion(a, b);
    }

    public static void recursion(int a, int b) {
        System.out.println(a);
        if (a < b) {
            recursion(++a, b);
        }
        if (a > b) {
            recursion(--a, b);
        }
    }
}
