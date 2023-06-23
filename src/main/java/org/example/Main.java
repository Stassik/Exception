package org.example;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        try {
            System.out.println("До генерации ислючения");
            array[7] = 10;
            System.out.println("Эта строка не будет отображаться");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Выход за границы массива");
            ex.printStackTrace();
        }
        System.out.println("После оператора catch");

        int[] array2 = new int[]{4, 8, 16, 24, 32, 128, 256, 512};
        int[] array3 = new int[]{2, 0, 4, 4, 0, 8};
        for (int i = 0; i < array2.length; i++) {
            try {
                System.out.println(array2[i] + " / "+ array3[i] + "="+ array2[i] / array3[i]);
            } catch (ArithmeticException ex) {
                System.out.println("Попытка деления на ноль");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Не на что делить");
            }
        }

    }


}