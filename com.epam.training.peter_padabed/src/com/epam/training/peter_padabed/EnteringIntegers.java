package com.epam.training.peter_padabed;

import java.util.Scanner;

public class EnteringIntegers {
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

        int sum = 0;
        int multi = 1;

        for (int i = 0; i <= size-1; i++) {
            sum = sum + array[i];
            multi = multi * array[i];

        }
        System.out.println("Сумма всех числе равна " + sum);
        System.out.println("Произведение всех чисел равно " + multi);

    }

}
