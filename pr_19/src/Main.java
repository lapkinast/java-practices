package Task19;

import java.util.InputMismatchException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main().Buy("Сергей Сергеев", 122152121);
    }

    public void Buy(String fullName, long inn) {
        try {
            CheckInn(fullName, inn);
        } catch (Exception e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
    }

    private void CheckInn(String fullName, long inn) throws WrongInnException {
        if (inn < 1000000000 || inn > 9999999999L) {
            throw new InputMismatchException("Введён некорректный ИНН = " + inn);
        }

        int innFromUser = new Random().nextInt();
        if (innFromUser < 1000000000) {
            throw new WrongInnException(inn, fullName);
        }
    }

    private static class WrongInnException extends Exception {
        public WrongInnException(long inn, String user) {
            super(String.format("Указан неверный ИНН (%d) для пользователя %s", inn, user));
        }
    }
}
