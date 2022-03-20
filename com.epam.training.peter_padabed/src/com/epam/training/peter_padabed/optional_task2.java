package com.epam.training.peter_padabed;

import java.util.Scanner;
import java.util.Random;

public class optional_task2 {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.println("Введите размерность двумерной матрицы: ");
        int size2 = 2;
        int sizeMatrix[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            sizeMatrix[i] = size.nextInt();
        }
        int n1 = sizeMatrix[0];
        int n2 = sizeMatrix[1];

        int matrix [] [] = new int [n1] [n2];
        Random rnd = new Random();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                matrix [i] [j] = rnd.nextInt();
            }
        }
        System.out.println("Введенный массив: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов K-го столбца (строки)
        System.out.println("Введите номер строки:");
        int sizeLine = 1;
        int numberLine [] = new int[sizeLine];
        numberLine [0] = size.nextInt();
        int lineNumber = numberLine [0];

        System.out.println("Введите номер столбца:");
        int sizeColumn = 1;
        int numberColumn [] = new int[sizeColumn];
        numberColumn [0] = size.nextInt();
        int columnNumber = numberColumn [0];

        int newMatrix [] [] = new int [n1] [n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                newMatrix [i][j] = matrix [i][j];
            }
            }


        // по строке
        int ch = n2;
        while (ch > 0) {
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < n2; j++) {
                 int num2 = newMatrix



                }
            }

            ch--;
        }



    }
}
