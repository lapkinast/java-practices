package ru.mirea.lab8.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("k = ");
        int k = Integer.parseInt(reader.readLine());
        System.out.print("s = ");
        int s = Integer.parseInt(reader.readLine());
        int count = 0;

        int i = (int) Math.pow(10, k - 1);

        while (i < Math.pow(10, k)) {
            int sum = 0;
            int num = i;
            sum = recursion(num, sum);
            if (sum == s) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("Count of this numbers: " + count);
    }

    public static int recursion(int num, int sum) {
        sum += num % 10;
        num /= 10;
        if (num != 0) {
            return recursion(num, sum);
        }
        return sum;
    }
}
