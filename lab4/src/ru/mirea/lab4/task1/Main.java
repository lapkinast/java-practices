package ru.mirea.lab4.task1;

public class Main {
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        System.out.println(winter + " " + winter.getAvrTemp() + " " + winter.getDescription());
        loveSeason(winter);

        for (Season season : Season.values()){
            System.out.println(season + " " + season.getAvrTemp() + " " + season.getDescription());
        }
    }

    public static void loveSeason(Season season){
        switch (season){
            case WINTER:
                System.out.println("I love winter!");
                break;
            case SPRING:
                System.out.println("I love spring!");
                break;
            case SUMMER:
                System.out.println("I love summer!");
                break;
            case AUTUMN:
                System.out.println("I love autumn!");
                break;
        }
    }
}
