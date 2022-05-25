package com.epam.training.peter_padabed.car;

public class ModelCar {
    public String autoModelCar; // марка автомобиля
    public String model; // модель автомобиля
    public int yearOfIssueCar; // год выпуска
    public String colorCar; // цвет автомобиля
    public int priceCar; // цена автомобиля
    public String numberCar; // номер автомобиля

    public ModelCar(String autoModelCar, String model, int yearOfIssueCar, String colorCar, int priceCar, String numberCar) {
        this.autoModelCar = autoModelCar;
        this.model = model;
        this.yearOfIssueCar = yearOfIssueCar;
        this.colorCar = colorCar;
        this.priceCar = priceCar;
        this.numberCar = numberCar;
    }

    public String getAutoModelCar() {
        return autoModelCar;
    }

    public void setAutoModelCar(String autoModelCar) {
        this.autoModelCar = autoModelCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssueCar() {
        return yearOfIssueCar;
    }

    public void setYearOfIssueCar(int yearOfIssueCar) {
        this.yearOfIssueCar = yearOfIssueCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public int getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(int priceCar) {
        this.priceCar = priceCar;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(String numberCar) {
        this.numberCar = numberCar;
    }
}
