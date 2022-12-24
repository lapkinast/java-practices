package pr2;

import java.util.Scanner;
public class tester {
    public static void main(String[] args){
        System.out.println("Введите количество окружностей" );
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        Circle[] circlmore = new Circle[k];
        for(int i=0; i < k; i++){
            System.out.println("Введите координату х центры, у центра и радиус" );
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            double r = scan.nextDouble();
            circlmore[i] = new Circle(x,y,r);
            circlmore[i].square(r);
        }
        for(int i=0;i<k;i++){
            System.out.println(circlmore[i]);
        }
    }
}