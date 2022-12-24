package pr29;

import java.util.Scanner;

public class Graph {
    static void inputGraph(int number, int arr[][]) {//заполнение массива графа
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                while (!input.hasNextInt()) {
                    System.out.println("Вы ввели не число");
                    input.next();
                }
                arr[i][j] = input.nextInt();
            }
        }
    }
    static boolean checkGraph(int arr[][]) {
        boolean res = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (res) {
                    if ((arr[i][j] != 0) && (arr[i][j] != 1)) {//проверка значения 1 или 0
                        System.out.println("Значение не равно 0 или 1");
                        res = false;
                    }
                }
                if (res) {
                    if (arr[i][j] != arr[j][i]) {//проверка на симметричность графа
                        System.out.println("Граф не симметричен");
                        res = false;
                    }
                }
                if (res) {
                    if (arr[i][i] != 0) {
                        System.out.println("Диагональные элементы не равны 0");
                        res = false;
                    }
                }
            }
        }
        return res;
    }
    static int countRoad(int arr[][]) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    res++;
                }
            }
        }
        return res / 2;
    }
    public static void main(String[] args) {
        System.out.println("Введите количество городов");
        Scanner n = new Scanner(System.in);
        while ((!n.hasNextInt())) {
            System.out.println("Вы ввели не число");
            n.next();
        }
        int nInt = n.nextInt();
        while ((nInt <= 0) || (nInt >= 100)) {
            System.out.println("Вы ввели число меньше 0 или больше 100");
            Scanner n1 = new Scanner(System.in);
            while ((!n1.hasNextInt())) {
                System.out.println("Вы ввели не число");
                n1.next();
            }
            nInt = n1.nextInt();
        }
        int[][] arr = new int[nInt][nInt];//массив с данными о дорогах
        System.out.println("Введите матрицу графа");
        while (true) {
            inputGraph(nInt, arr);
            if (checkGraph(arr)) {
                break;
            }
        }
        System.out.println("Количество путей в графе "+ countRoad(arr));
    }

}