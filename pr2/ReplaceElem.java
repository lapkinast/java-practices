package pr2;
import java.util.Scanner;

public class ReplaceElem {
    public static void main(String[] args){
        System.out.println("Введите количество элементов" );
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        System.out.println("Введите элементы " );
        Scanner in = new Scanner(System.in);
        String[] elements = new String[k];
        for (int i =0;i < k; i++){
            elements[i] = in.nextLine();
        }
        for (int i = 0; i < k/2; i++){
            String dub = elements[i];
            elements[i] = elements[k - 1 - i];
            elements[k - 1 - i] = dub;

        }
        for (int i = 0; i < k; i++){
            System.out.print(elements[i]);
        }
    }
}
