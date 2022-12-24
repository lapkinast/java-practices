package ru.mirea.lab3.task1_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n;
        while (true){
            System.out.print("Enter array size: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                n = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                continue;
            }
            if (n > 1){
                break;
            }
        }
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt();
        }

        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0){
                evenCount++;
            }
        }
        if (evenCount == 0){
            System.out.println("There are no even numbers in the array");
            return;
        }

        int[] evenArray = new int[evenCount];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0){
                evenArray[count] = arr[i];
                count++;
            }
        }

        Arrays.stream(evenArray).forEach(System.out::println);
    }
}
