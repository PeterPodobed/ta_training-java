package com.epam.training.peter_padabed;

import java.util.Scanner;
import java.lang.String;

public class ReverseArgs {
    public static void main (String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Введите общее количество чисел: ");
        int size = number.nextInt();
        int array[] = new int[size];
        System.out.println("Введите числа:");

        for (int i = 0; i < size; i++) {
            array[i] = number.nextInt();
        }
        System.out.print("Введенные числа:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

        int ch = size;

        while (ch > 0 ) {
            int n = 0;
            int ch2 = size - ch;
            int m = size - 1 - ch2;
            while (n <= (size-1-ch2)) {
                int num = array [n];
                if (n == m) {
                    array[n] = num;
                    break;
                }
                array[n] = array [n+1];
                array[n+1] = num;
                n++;
            }
            ch--;
        }

        System.out.println();

        System.out.print("Измененная строка чисел:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }


}
