package pr1;

public class task4 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            String res = String.format("%.3f", 1.0 / i);
            System.out.print(res + "; ");
        }
    }
}
