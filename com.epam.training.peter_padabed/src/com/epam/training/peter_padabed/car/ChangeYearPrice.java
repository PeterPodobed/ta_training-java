package com.epam.training.peter_padabed.car;

import java.util.Scanner;

public class ChangeYearPrice {
    static int year3 = 0;
    static int price2 = 0;

    public static void ChangeYearPrice (int price, int year) {
        System.out.println("Введите год выпуска автомобиля:");
        Scanner scanner = new Scanner(System.in);
        year3 = scanner.nextInt();
        System.out.println("Введите минимальную стоимость автомобиля:");
        Scanner scanner2 = new Scanner(System.in);
        price2 = scanner.nextInt();

    }

    public static int getYear3() {
        return year3;
    }

    public static void setYear3(int year3) {
        ChangeYearPrice.year3 = year3;
    }

    public static int getPrice2() {
        return price2;
    }

    public static void setPrice2(int price2) {
        ChangeYearPrice.price2 = price2;
    }
}
