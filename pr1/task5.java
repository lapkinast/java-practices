package pr1;

import java.util.Scanner;
public class task5 {
    public static int factorial(int x) {
        int res = 1;
        for (int i = 1; i <= x; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = input.nextInt();
        System.out.println("Факториал: " + factorial(num));
    }
}