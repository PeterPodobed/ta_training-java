package com.epam.training.peter_padabed.car;

public class modelCar {
    public String autoModelCar; // марка автомобиля
    public String model; // модель автомобиля
    public int yearOfIssueCar; // год выпуска
    public String colorCar; // цвет автомобиля
    public int priceCar; // цена автомобиля
    public String numberCar; // номер автомобиля

    public modelCar(String autoModelCar, String model, int yearOfIssueCar, String colorCar, int priceCar, String numberCar) {
        this.autoModelCar = autoModelCar;
        this.model = model;
        this.yearOfIssueCar = yearOfIssueCar;
        this.colorCar = colorCar;
        this.priceCar = priceCar;
        this.numberCar = numberCar;
    }
}
