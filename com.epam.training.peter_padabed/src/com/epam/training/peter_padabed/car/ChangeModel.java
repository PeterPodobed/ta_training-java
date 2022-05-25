package com.epam.training.peter_padabed.car;

import java.util.Scanner;

public class ChangeModel {
    static String modelAuto2 = "";

    public static void model (String modelAuto) {

        System.out.println("Введите марку автомобиля:");
        Scanner scanner = new Scanner(System.in);
        String model2 = scanner.next();
        modelAuto2 = model2;

    }

    public String getModelAuto2() {
        return modelAuto2;
    }

    public void setModelAuto(String modelAuto2) {
        this.modelAuto2 = modelAuto2;
    }
}
