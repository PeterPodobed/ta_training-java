package com.epam.training.peter_padabed.car;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String modelAuto = "";
        int year = 0;
        int price = 0;

        System.out.println("Выберите способ поиска аавтомобиля");
        System.out.println("1. Поиск автомобиля по заданной марке");
        System.out.println("2. Поиск автомобиля по заданной модели, которая эксплуатируется более заданного времени");
        System.out.println("3. Поиск автомобиля по году выпуска и наименьшей его стоимости");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        switch (n) {
            case 1: {
                ChangeModel.model(modelAuto);
                break;
            }
            case 2: {
                ChangeModelYear.ChangeModelYear(modelAuto, year);
                break;
            }
            case 3: {
                ChangeYearPrice.ChangeYearPrice(price, year);
                break;
            }
            default:
                System.out.println("Введите корректные данные");
        }

        AutoModelCar car = new AutoModelCar();
        car.auto("MERCEDES", "E350", 2013, "WHITE", 18000, "1006-7");
        car.auto("OPEL", "INSIGNIA", 2016, "RED", 16000, "1523-7");
        car.auto("BMW", "530", 2015, "RED", 19000, "1500-7");
        car.auto("OPEL", "CORSA", 2012, "GREEN", 11000, "0221-7");
    }


}
