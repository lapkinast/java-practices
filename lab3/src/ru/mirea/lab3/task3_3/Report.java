package ru.mirea.lab3.task3_3;

import java.util.Formatter;
import java.util.Random;

public class Report {

    private static void generateReport(Employee[] employees){

        int length = Integer.MIN_VALUE;
        for (Employee value : employees) {
            if (value.getFullName().length() > length) {
                length = value.getFullName().length();
            }
        }
        String headName = "Full name";
        length = Math.max(length, headName.length());

        Formatter formatter = new Formatter();
        formatter.format("| %-" + length + "s  | %10s |%n", headName, "Salary");
        for (Employee employee : employees) {
            formatter.format("| %-" + length + "s  | %10.2f |%n", employee.getFullName(), employee.getSalary());
        }
        System.out.println(formatter);
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        Random random = new Random();
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("Employee_" + i, 40000 + random.nextDouble() * 10000);
        }
        generateReport(employees);
    }
}
