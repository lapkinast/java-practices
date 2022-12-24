package pr1;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите число элементов массива: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int sum = 0;
        System.out.println("Введите массив с целыми числами: ");
        if (sc.hasNextInt()) {
            for (int i = 0; i < size; i++){
                array[i] = sc.nextInt();
                sum = sum + array[i];
            }
        } else{
            System.out.println("Вы ввели не целое число.");
        }
        System.out.println("Сумма элементов массива: ");
        System.out.println(sum);
        System.out.println("Средне арифметическое элементов массива: ");
        System.out.println(sum/size);
    }
}