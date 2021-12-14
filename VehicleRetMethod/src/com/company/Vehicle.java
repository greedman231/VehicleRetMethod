package com.company;

public class Vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    double distance(double interval){
        double value = maxspeed * interval;
        return value;
    }
}
