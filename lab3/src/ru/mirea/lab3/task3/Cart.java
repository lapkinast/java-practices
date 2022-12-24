package ru.mirea.lab3.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cart {
    public static void main(String[] args) {
        double n;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.print("Enter order value: ");
            try {
                n = Double.parseDouble(reader.readLine());
            } catch (Exception e) {
                continue;
            }
            if (n > 1){
                break;
            }
        }
        CurrencyConverter converter = new CurrencyConverter();
        converter.setOriginal("RUB");
        converter.setTarget("RUB");

        String choice;
        label:
        while (true) {
            System.out.println();
            System.out.printf("The cost of your order: %.2f %s%n", converter.convert(n), converter.getTarget());
            System.out.println("1 - Show price in rubles");
            System.out.println("2 - Show price in dollars");
            System.out.println("3 - Show price in euro");
            System.out.println("Any other key - pay for the order");

            try {
                choice = reader.readLine();
            } catch (IOException e) {
               continue;
            }
            switch (choice){
                case "1":
                    converter.setTarget("RUB");
                    break;
                case "2":
                    converter.setTarget("USD");
                    break;
                case "3":
                    converter.setTarget("EUR");
                    break;
                default:
                    break label;
            }
        }
    }
}
