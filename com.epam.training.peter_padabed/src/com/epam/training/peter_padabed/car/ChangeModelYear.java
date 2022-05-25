package com.epam.training.peter_padabed.car;

import java.util.Scanner;

public class ChangeModelYear {
    static int year2 = 0;
    static String modelAuto4 = "";

    public static void ChangeModelYear (String modelAuto, int year) {
        System.out.println("Введите модель автомобиля:");
        Scanner scanner = new Scanner(System.in);
        modelAuto4 = scanner.next();

        System.out.println("Введите срок эксплуатации автомобиля:");
        Scanner scanner2 = new Scanner(System.in);
        year2 = scanner2.nextInt();

    }

    public int getYear2() {
        return year2;
    }

    public void setYear2(int year2) {
        this.year2 = year2;
    }

    public String getModelAuto4() {
        return modelAuto4;
    }

    public void setModelAuto4(String modelAuto4) {
        this.modelAuto4 = modelAuto4;
    }
}
