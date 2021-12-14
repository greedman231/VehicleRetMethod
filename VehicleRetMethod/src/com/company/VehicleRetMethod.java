package com.company;

public class VehicleRetMethod {

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.passengers =2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup =30;

        Vehicle bus = new Vehicle();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        double time = 0.5;
        double distanceCar = car.distance(time);
        double distanceBus = bus.distance(time);

        System.out.println("автомобиль с" + car.passengers + "пассажирами пройдёт за пол часа путь" + distanceCar + "км");
        System.out.println("автобус с" + bus.passengers + "пассажирами пройдёт за пол часа путь" + distanceBus + "км");
    }
}
