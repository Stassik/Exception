package org.example;

public class Seminar2 {
    public static void main(String[] args) {
        try {
            myInput(-1);
        }catch (MyException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        } finally {
            System.out.println("Выполнение блока finally");
        }
    }

    public static void myInput (int val) throws MyException{
        if (val < 0) {
            throw new MyException("Значение не может быть отрицательным");
        }
        System.out.println("Обработка значения текста " + val);
    }
}



class MyException extends Exception {
    public MyException (String mes) {
        super(mes);
    }
}
