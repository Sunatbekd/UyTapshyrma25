package com.company;

public class Car {
    private int id;
    private int numberCar;

    public Car(int id, int numberAuto) {
        this.id = id;
        this.numberCar = numberAuto;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberAuto() {
        return numberCar;
    }

    public void setNumberAuto(int numberAuto) {
        this.numberCar = numberAuto;
    }

    @Override
    public String toString() {
        return "Car " +
                "id: " + id +
                ", numberAuto: " + numberCar+":";
    }
}
