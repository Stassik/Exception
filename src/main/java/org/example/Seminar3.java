package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seminar3{
    public static void main(String[] args) {
        try {
            int a = getInt("Введите первое число:");
            int b = getInt("Введите второе число:");

            System.out.println(divide(a, b));
        } catch (DivisionByZeroException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static double divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на 0");
        }
        return (double) a / b;
    }

    public static int getInt(String message) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                try {
                    System.out.println(message);
                    return scanner.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Ошибка: Введено некорректное число. Повторите ввод.");
                    scanner.next(); // Очистка буфера сканера
                }
            }
        } finally {
            //scanner.close(); // Закрытие сканера
        }
    }

    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }
}
