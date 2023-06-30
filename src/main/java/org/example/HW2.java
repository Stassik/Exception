package org.example;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        /*
        Задача 1:
        Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
        Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
        В противном случае, программа должна выводить сообщение "Число корректно".
        */
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = iScanner.nextInt();

        try {
            checkingForPositivity(num);

        } catch (InvalidNumberException ex) {
            ex.printStackTrace();
            System.out.println("Ошибка: " + ex.getMessage());
        }


        /*
        Задача 2:
        Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
        Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
        В противном случае, программа должна выводить результат деления.
        */
        System.out.println("Введите делимое число: ");
        int num1 = iScanner.nextInt();
        System.out.println("Введите делитель: ");
        int num2 = iScanner.nextInt();

        try {
            checkingZero(num2);
            System.out.println(num1 / num2);
        } catch (DivisionByZeroException ex) {
            ex.printStackTrace();
            System.out.println("Ошибка: " + ex.getMessage());
        }


        /*
        * Задача3: - по желанию
          Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

            Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
            Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
            Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
            Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
          В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
            - необходимо создать 3 класса собвстенных исключений
        */
        System.out.println("Введите первое число: ");
        int numb1 = iScanner.nextInt();
        System.out.println("Введите второе число: ");
        int numb2 = iScanner.nextInt();
        System.out.println("Введите третье число: ");
        int numb3 = iScanner.nextInt();

        try {
            checkingRange1(numb1);
            checkingRange2(numb2);
            checkingSum(numb1, numb2);
            checkingZero(numb3);
            System.out.println("Проверка пройдена успешно.");
        }catch (DivisionByZeroException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        } catch (NumberSumException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        } catch (NumberOutOfRangeException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }



    }

    public static void checkingForPositivity (int num) throws InvalidNumberException{
        if (num <= 0) {
            throw new InvalidNumberException("Некорректное число.");
        }
        System.out.println("Число корректно.");
    }

    public static void checkingZero (int num) throws DivisionByZeroException {
        if (num == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо.");
        }
    }

    public static void checkingRange1 (int num) throws NumberOutOfRangeException {
        if (num > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
    }
    public static void checkingRange2 (int num) throws NumberOutOfRangeException {
        if (num < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
    }

    public static void checkingSum (int num1, int num2) throws NumberSumException {
        if (num1 + num2 < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
    }
}
 class InvalidNumberException extends Exception{
    public InvalidNumberException (String mes) {
        super(mes);
    }
 }

 class DivisionByZeroException extends Exception {
    public DivisionByZeroException (String mes) {
        super(mes);
    }
 }

 class NumberOutOfRangeException extends  Exception {
    public NumberOutOfRangeException (String mes) {
        super(mes);
    }
 }

class NumberSumException extends  Exception {
    public NumberSumException (String mes) {
        super(mes);
    }
}