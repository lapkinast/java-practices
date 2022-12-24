package ru.mirea.lab3.task1_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[4];
        boolean isIncreasing = true;
        Random random = new Random();
//        Random random = new Random(53); // increasing sequence
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 + random.nextInt(90);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]){
                isIncreasing = false;
                break;
            }
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }

        if (isIncreasing){
            System.out.println("\nThe array is a increasing sequence");
        } else {
            System.out.println("\nThe array is not a increasing sequence");
        }
    }
}
