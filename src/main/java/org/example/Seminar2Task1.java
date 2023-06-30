package org.example;

import java.util.Scanner;

public class Seminar2Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);


        try {
            System.out.println("Введите пароль: ");
            String pass = iScanner.nextLine();
            chekedPassword(pass);
        } catch (InvalidPasswordException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        }

    }

    public static void chekedPassword (String pswd) throws InvalidPasswordException{
        if (pswd.length() < 8) {
            throw new InvalidPasswordException("Пароль менее 8 символов.");
        }
        if (!pswd.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("Пароль не содержит цифр.");
        }
        if (!pswd.matches(".*[0-9].*")) {
            throw new InvalidPasswordException("Пароль не содержит цифр.");
        }
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException (String mes) {
        super(mes);
    }
}
