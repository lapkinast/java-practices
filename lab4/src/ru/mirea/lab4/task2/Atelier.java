package ru.mirea.lab4.task2;

import java.util.Arrays;

public class Atelier {

    public void dressWoman(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (Arrays.toString(clothe.getClass().getInterfaces()).contains("WomenClothing")) {
                WomenClothing womenClothing = (WomenClothing) clothe;
                womenClothing.dressWomen();
            }
        }
    }

    public void dressMen(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (Arrays.toString(clothe.getClass().getInterfaces()).contains("MenClothing")) {
                MenClothing menClothing = (MenClothing) clothe;
                menClothing.dressMan();
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 700, "White"),
                new Pants(Size.L, 2000, "Black"),
                new Skirt(Size.M, 1000, "Blue"),
                new Tie(Size.XXS, 800, "Red")};

        Atelier atelier = new Atelier();
        atelier.dressWoman(clothes);
        System.out.println("");
        atelier.dressMen(clothes);
    }
}
