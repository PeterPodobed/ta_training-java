package com.epam.training.peter_padabed.car;

import java.util.Locale;

public class AutoModelCar {
    public void auto(String autoModelCar, String model, int yearOfIssueCar, String colorCar, int priceCar, String numberCar) {


        if (autoModelCar.equals(ChangeModel.modelAuto2.toUpperCase())) {
            System.out.println("auto " + autoModelCar + "  " + model + "  " + yearOfIssueCar + "  " + colorCar + "  " + priceCar + "  " + numberCar);
        }


        if (model.equals(ChangeModelYear.modelAuto4.toUpperCase()) && ((2022 - yearOfIssueCar) > ChangeModelYear.year2)) {
            System.out.println("auto " + autoModelCar + "  " + model + "  " + yearOfIssueCar + "  " + colorCar + "  " + priceCar + "  " + numberCar);
        }

        if ((yearOfIssueCar == ChangeYearPrice.year3) && (ChangeYearPrice.price2 < priceCar) ) {
            System.out.println("auto " + autoModelCar + "  " + model + "  " + yearOfIssueCar + "  " + colorCar + "  " + priceCar + "  " + numberCar);
        }

    }
}
