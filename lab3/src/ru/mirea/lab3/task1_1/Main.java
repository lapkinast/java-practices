package ru.mirea.lab3.task1_1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] arr = getRandom(10);
        for (double v : arr) {
            System.out.print(v + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (double v : arr) {
            System.out.print(v + " ");
        }
        System.out.println("\n-------------");
        arr = getMathRandom(10);
        for (double v : arr) {
            System.out.print(v + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (double v : arr) {
            System.out.print(v + " ");
        }
    }

    private static double[] getRandom(int size) {
        double[] arr = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextDouble();
        }
        return arr;
    }

    private static double[] getMathRandom(int size) {
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Math.random();
        }
        return arr;
    }
}
