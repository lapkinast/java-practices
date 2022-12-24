package ru.mirea.lab4.task3;

public class User {
    private static final String login;
    private static final String password;

   static {
        login = "user";
        password = "user";
    }

    public static boolean authCheck(String login, String password) {
        return login.equals(User.login) && password.equals(User.password);
    }
}
