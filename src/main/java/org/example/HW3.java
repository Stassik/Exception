package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
*
Задача1. Напишите программу-калькулятор, которая запрашивает у пользователя два числа
и выполняет операцию возведения первого числа в степень второго числа.
Если введены некорректные числа или происходит деление на ноль, необходимо обработать соответствующие исключения и вывести информативное сообщение об ошибке.
Важно! С использованием принципа одного уровня абстракции!
**В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(), выполняющий операцию возведения числа в степень.
Если введено некорректное основание (ноль) и отрицательная степень, выбрасывается исключение InvalidInputException.

В методе main() мы запрашиваем у пользователя основание и показатель степени, вызываем метод calculatePower() и выводим результат.
Если введены некорректные числа или происходит ошибка ввода, соответствующие исключения перехватываются и выводится информативное сообщение об ошибке.

Обратите внимание, что в этой задаче мы использовали собственное исключение InvalidInputException, чтобы явно указать на некорректный ввод.
Это помогает разделить обработку ошибок на соответствующие уровни абстракции.**
*
* */
public class HW3 {

    public static void main(String[] args) {
        try {
            int num1 = getInt("Введите число-основание");
            int num2 = getInt("Введите показатель степени числа");
            System.out.println(calculatePower(num1, num2));
        }catch (InvalidInputException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int getInt(String message) {
        Scanner scanner = new Scanner(System.in);

            while (true) {
                try {
                    System.out.println(message);
                    return scanner.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Ошибка: Введено некорректное число. Повторите ввод.");
                    scanner.next();
                }
            }

    }

    public static int calculatePower(int a, int b) throws InvalidInputException{
        if (a == 0 || b < 0 ) {
            throw new InvalidInputException("Некорректный ввод");
        }
        return (int) Math.pow(a, b);

    }

    static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }


}
