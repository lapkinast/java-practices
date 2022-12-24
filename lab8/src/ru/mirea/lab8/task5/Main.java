package ru.mirea.lab8.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("n = ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n / 10 != 0) {
            return n % 10 + sum(n / 10);
        }
        return n % 10;
    }
}
