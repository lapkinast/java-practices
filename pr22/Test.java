package pr22;

public class Test {
    public static void main(String[] args) {
        String classic_string = "63-3+(45+6)/7*5+9";
        String polish_String="63 3 - 45 6 + 7 / 5 * + 9 +";
        Polish test=new Polish();
        test.expression=classic_string;
        Polish test1=new Polish();
        test1.expression=polish_String;
        System.out.printf("Результат=%d", test.calculate(test.expression));
        System.out.printf("\nРезультат=%d", test.calculate(test1.expression));
    }
}