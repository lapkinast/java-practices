package pr25;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String okInput = "(1 + 8) – 9 / 4";
        String notOkInput = "6 / 5 – 2 * 9";
        String pattern = "\\d\\s*\\+";
        hasPlus(pattern, okInput);
        hasPlus(pattern, notOkInput);
    }
    public static void hasPlus(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(!matcher.find()) {
            System.out.println("Плюса нет!");
        } else
            System.out.println("Есть плюс.");
        System.out.println();
    }}
