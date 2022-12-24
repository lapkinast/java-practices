package ru.mirea.lab4.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class OnlineStore {

    BufferedReader reader;
    List<Goods> list;

    public OnlineStore() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        list = new ArrayList<>();
    }

    public void authorization(){
        String login = "";
        String password = "";
        while (true){
            try {
                System.out.print("login: ");
                login = reader.readLine();
                System.out.print("password: ");
                password = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (User.authCheck(login,password)){
                break;
            }
            System.out.println("Try again");
        }
        System.out.println("Hello " + login + "!\n");
    }

    public int showCatalog() {
        String choice;
        while (true){
            System.out.println("Catalog:");
            for (int i = 0; i < Catalog.values().length; i++) {
                System.out.printf("%d. %s%n", i + 1, Catalog.values()[i].getDescription());
            }
            System.out.println("\nEnter category number to go");
            System.out.println("C - to view cart");
            System.out.println("Q - to exit");
            try {
                choice = reader.readLine();
            } catch (IOException e) {
                continue;
            }
            if (choice.equals("Q") || choice.equals("q")){
                return -1;
            }
            if (choice.equals("C") || choice.equals("c")){
                return -2;
            }
            int n;
            try {
                n = Integer.parseInt(choice);
            } catch (NumberFormatException e) {
                continue;
            }
            if (n > 0 && n <= Catalog.values().length){
                return n - 1;
            }
        }
    }

    public int showGoods(int category) {
        String choice;
        Goods[] goods = new Goods[Catalog.values()[category].getGoods().length];
        for (int i = 0; i < goods.length; i++) {
            goods[i] = new Goods(Catalog.values()[category].getGoods()[i]);
        }
        while (true){
            System.out.println(Catalog.values()[category].getDescription() + ":");
            for (int i = 0; i < goods.length; i++) {
                System.out.printf("%d. %s - %d RUB%n", i + 1, goods[i].getName(), goods[i].getPrice());
            }
            System.out.println("\nEnter category number to add to cart");
            System.out.println("R - to return to category selection");
            System.out.println("C - to view cart");
            System.out.println("Q - to exit");
            try {
                choice = reader.readLine();
            } catch (IOException e) {
                continue;
            }
            if (choice.equals("Q") || choice.equals("q")){
                return -1;
            }
            if (choice.equals("C") || choice.equals("c")){
                return -2;
            }
            if (choice.equals("R") || choice.equals("r")){
                return 0;
            }
            int n;
            try {
                n = Integer.parseInt(choice);
            } catch (NumberFormatException e) {
                continue;
            }
            if (n > 0 && n <= Catalog.values().length){
                addToCart(goods[n-1]);
            }
        }
    }

    public int showCart(){
        if (list.isEmpty()) {
            System.out.println("Cart is Empty");
        } else {
            int length = Integer.MIN_VALUE;
            for (Goods goods : list) {
                if (goods.getName().length() > length) {
                    length = goods.getName().length();
                }
            }
            String headName = "Goods name";
            length = Math.max(length, headName.length() + 2);

            Formatter formatter = new Formatter();
            formatter.format("| %-" + length + "s | %10s |%n", headName, "Value");
            int result = 0;
            for (Goods goods : list) {
                formatter.format("| %-" + length + "s | %10d |%n", goods.getName(), goods.getPrice());
                result += goods.getPrice();
            }
            formatter.format("| %" + length + "s | %10d |%n", "Total price:", result);

            System.out.println(formatter);
            System.out.println("P - to pay");
        }
        System.out.println("Q - to exit");
        System.out.println("Any other key - to return to category selection");

        String choice = "";
        try {
            choice = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (choice.equals("P") || choice.equals("p")){
            if (!list.isEmpty()) return -1;
            return -2;
        }
        if (choice.equals("Q") || choice.equals("q")){
            return -1;
        }
        return 0;
    }

    private void addToCart(Goods goods){
        list.add(goods);
        list.forEach(goods1 -> System.out.println(goods1.getName() + " " + goods1.getPrice()));
    }

    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        int choice;
        store.authorization();
        while (true) {
            int category = store.showCatalog();
            if (category == -2) {
                choice = store.showCart();
                if (choice == 0) continue;
                if (choice == -1) break;
                if (choice == -2) {
                    System.out.println("Thank you for your purchase!");
                    break;
                }
            }
            if (category == -1) break;


            choice = store.showGoods(category);
            if (choice == -2) {
                choice = store.showCart();
                if (choice == 0) continue;
                if (choice == -1) break;
                if (choice == -2) {
                    System.out.println("Thank you for your purchase!");
                    break;
                }
            }
            if (choice == -1) break;
        }
    }
}
