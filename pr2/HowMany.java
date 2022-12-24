package pr2;
import java.util.Scanner;
public class HowMany {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] kolvoslov = str.split(" ");
        System.out.println("Количество слов: " + kolvoslov.length);
    }
}