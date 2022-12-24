package pr1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива:");

        int size = input.nextInt();
        int[] arr = new int[size];

        double sm = 0;
        System.out.println("Введите массив:");
        int i = 0;

        while (i < size) {
            arr[i] = input.nextInt();
            sm += arr[i];
            i += 1;
        }
        int x = 1;
        int Max = 0;
        int Min = arr[0];

        while (x < size) {
            if (arr[x] <= Min) {
                Min = arr[x];
            }
            if (arr[x] >= Max) {
                Max = arr[x];
            }
            x += 1;
        }
        System.out.println("Сумма массива " + sm);
        System.out.println("Минимальное:" + Min + " Максимальное:" + Max);
    }

}
