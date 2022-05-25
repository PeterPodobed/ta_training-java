package com.epam.training.peter_padabed;

import java.util.Scanner;
import java.util.Random;

public class Optional_task2 {
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
        int lineNumber = numberLine [0] - 1;


        System.out.println("Введите номер столбца:");
        int sizeColumn = 1;
        int numberColumn [] = new int[sizeColumn];
        numberColumn [0] = size.nextInt();
        int columnNumber = numberColumn [0] - 1;

        int newMatrix [] [] = new int [n1] [n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                newMatrix [i][j] = matrix [i][j];
            }
            }


        // по строке
        int ch = n2;
        int pole [] [] = new int[1][1];
        while (ch > 0) {
            for (int i = 0; i < n2; i++) {
                int num2 = newMatrix [lineNumber][i];
                if (i == (n2-1)) {
                    break;
                }
                if (newMatrix[lineNumber][i] > newMatrix[lineNumber][i+1]) {
                    for (int j = 0; j < n1; j++) {

                        pole [0] [0] = newMatrix [j][i];
                        newMatrix[j][i] = newMatrix[j][i + 1];
                        newMatrix[j][i + 1] = pole [0][0];
                    }
                }
            }
            ch--;
        }
        System.out.println("Измененный массив по возрасстанию " + numberLine [0] + "  строки");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(" " + newMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // по столбцу
        int newMatrix2 [] [] = new int [n1] [n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                newMatrix2 [i][j] = matrix [i][j];
            }
        }

        int ch2 = n1;
        int pole2 [] [] = new int[1][1];
        while (ch2 > 0) {
            for (int i = 0; i < n1; i++) {
                int num3 = newMatrix2 [i][columnNumber];
                if (i == (n1-1)) break;

                if (newMatrix2[i][columnNumber] > newMatrix2[i+1][columnNumber]) {
                    for (int j = 0; j < n2; j++) {
                        pole2 [0] [0] = newMatrix2 [i][j];
                        newMatrix2[i][j] = newMatrix2[i+1][j];
                        newMatrix2[i+1][j] = pole2 [0][0];
                    }
                }
            }
            ch2--;
        }

        System.out.println("Измененный массив по возрасстанию " + numberColumn [0] + "  столбца");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(" " + newMatrix2[i][j] + " ");
            }
            System.out.println();
        }


    }
}
