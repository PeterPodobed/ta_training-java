package com.epam.training.peter_padabed;
import java.util.Scanner;
import java.lang.String;

public class MonthOfTheYear {
    public static void main (String[] args) {

        Scanner numberMonth = new Scanner(System.in);
        System.out.println("Введите номер месяца года: ");
        int size = 1;
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = numberMonth.nextInt();
        }

        for (int i = 0; i < size ; i++)
        {
            if (number[i] == 1) {System.out.println("Январь");}
            else if (number[i] == 2) {System.out.println("Февраль");}
            else if (number[i] == 3) {System.out.println("Март");}
            else if (number[i] == 4) {System.out.println("Апрель");}
            else if (number[i] == 5) {System.out.println("Май");}
            else if (number[i] == 6) {System.out.println("Июнь");
            } else if (number[i] == 7) {System.out.println("Июль");
            } else if (number[i] == 8) {System.out.println("Август");
            } else if (number[i] == 9) {System.out.println("Сентябрь");
            } else if (number[i] == 10) {System.out.println("Октябрь");
            } else if (number[i] == 11) {System.out.println("Ноябрь");
            } else if (number[i] == 12) {System.out.println("Декабрь");
            } else System.out.println("Введите правильный номер месяца года");

        }
    }
}
