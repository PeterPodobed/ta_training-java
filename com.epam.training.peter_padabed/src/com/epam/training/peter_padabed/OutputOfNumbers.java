package com.epam.training.peter_padabed;
import java.util.Scanner;
import java.util.Random;

public class OutputOfNumbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите общее количество чисел: ");
        int size = number.nextInt();

        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            int random = rnd.nextInt();
            System.out.println(random);
        }

        Random rnd2 = new Random();
        for (int i = 0; i < size; i++) {
            int random2 = rnd2.nextInt();
            System.out.print("   " + random2);
        }

    }

}
