package com.realdolmen.java8.exercise1;

/**
 * Created by KDAAU95 on 6/03/2015.
 */
public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car turns on");
    }

    @Override
    public void driveForward() {
        System.out.println("Car drives forward");
    }

    @Override
    public void driveBackward() {
        System.out.println("Car drives backward");
    }

    @Override
    public void turnLeft() {
        System.out.println("Car turns left");
    }

    @Override
    public void turnRight() {
        System.out.println("Car turns right");
    }

    @Override
    public void turnOnRadio() {
        System.out.println("Car turns on radio");
    }
}
