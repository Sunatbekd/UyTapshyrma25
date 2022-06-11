package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Car,CarInfo> carInfoMap = new HashMap<>();
        carInfoMap.put(new Car(1,3434),new CarInfo(2005,"Tayota RAV-4",15000,"black"));
        carInfoMap.put(new Car(2,2424),new CarInfo(2006,"Mersedes-S-class",16000,"black"));
        carInfoMap.put(new Car(3,4444),new CarInfo(2007,"Honda-Fit",17000,"black"));
        carInfoMap.put(new Car(4,5454),new CarInfo(2008,"Hyundai",18000,"black"));
        carInfoMap.put(new Car(5,6464),new CarInfo(2009,"Renault-5",19000,"black"));
        carInfoMap.put(new Car(6,7474),new CarInfo(2010,"Porsh-8",20000,"black"));
        for (Map.Entry car : carInfoMap.entrySet()) {
            System.out.println(car.getKey()+" "+car.getValue());
        }

    }
}
