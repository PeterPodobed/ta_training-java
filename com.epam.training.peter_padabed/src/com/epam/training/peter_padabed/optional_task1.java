package com.epam.training.peter_padabed;
import java.util.Scanner;

public class optional_task1 {
    public static void main(String[] args) {

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

        int n = 0;
        int array2[] = new int[size];

        for (int i = 0; i < size; i++) {
            int m = 1;
            int digit = 0;
            int x = array[i] / m;
            while (x >= 1 || x <= -1) {
                x = array[i] / m;
                array2[i] = digit;
                digit++;
                m = m * 10;
            }
        }

        System.out.print("Разряды введенных чисел:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array2[i]);
        }
        System.out.println();

        // Найти самое короткое и самое длинное число. Вывести найденные числа и их длину
        int min = array2[0];
        int minN = 0;
        int max = array2[0];
        int maxN = 0;
        for (int i = 0; i < size; i++) {
            if (array2[i] > max) {
                maxN = i;
                max = array2[i];
            }
            if (array2[i] < min) {
                minN = i;
                min = array2[i];
            }
        }
        System.out.println("Самое длинное число " + array[maxN] + "  длиной " + array2[maxN] + "  разряд");
        System.out.println("Самое короткое число " + array[minN] + "  длиной " + array2[minN] + "  разряд");

        //Вывести числа в порядке возрастания (убывания) значений их длины
        int array3[] = new int[size];
        for (int i = 0; i < size; i++) { array3[i] = array[i]; }

        int ch = size;
        while (ch > 0 ) {
            int n2 = 0;
            int ch2 = size - ch;
            int m2 = size - 1 - ch2;
            while (n2 <= (size-1-ch2)) {
                int num = array3 [n2];
                if (n2 == m2) {
                    array3[n2] = num;
                    break;
                }
                if (array3[n2] > array3[n2 + 1]) {
                    array3[n2] = array3[n2 + 1];
                    array3[n2 + 1] = num;
                    n2++;
                } else n2++;
            }
            ch--;
        }

        System.out.print("Числа в порядке возрастания:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array3[i]);
        }
        System.out.println();


        // Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину
        int sum = 0;
        int average = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + array2[i];
        }
        average = sum / size;
        for (int i = 0; i < size; i++) {
            if (array2[i] < average) System.out.println((i+1) + " элемент " + array[i] + " длиной " + array2[i] + " разряд");
        }
    }

}
