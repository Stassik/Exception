package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1 {
    static Scanner iScanner = new Scanner(System.in);
    public static void main (String[] args) {
//    Простая задача 1: Проверка деления на ноль
//
//    Напишите программу, которая запрашивает у пользователя два целых числа и выполняет их деление.
//    Если второе число равно нулю, выбросите исключение ArithmeticException с сообщением "Деление на ноль недопустимо".
//    Иначе выведите результат деления на экран.
//
        System.out.println("Введите числитель: ");
        int num1 = iScanner.nextInt();
        System.out.println("Введите знаменатель: ");
        int num2 = iScanner.nextInt();
        divide(num1, num2);

//    Простая задача 2: Обработка некорректного ввода
//
//    Напишите программу, которая запрашивает у пользователя его возраст.
//    Если введенное значение не является числом, выбросите исключение NumberFormatException с сообщением "Некорректный ввод".
//    Иначе выведите возраст на экран.

        System.out.println("Введите свой возраст: ");
        String age = iScanner.nextLine();
        displayAge(age);

    }

    static void divide (int num1, int num2) {
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль недопустимо");
        }
    }

    static void displayAge (String age) {
        try {
            System.out.println(Integer.parseInt(age));
        } catch (NumberFormatException ex) {
            System.out.println("Некорректный ввод");
            ex.printStackTrace();
        }

//        catch (InputMismatchException ex) {  // Так как данные вводит пользователь, то корректнее будет использовать проверку ввода данных (типа)
//            System.out.println("Не число");
//        }
    }



}
