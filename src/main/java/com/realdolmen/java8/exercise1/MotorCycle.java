package com.realdolmen.java8.exercise1;

/**
 * Created by KDAAU95 on 6/03/2015.
 */
public class MotorCycle implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle turns on");
    }

    @Override
    public void driveForward() {
        System.out.println("Motorcycle drives forward");
    }

    @Override
    public void driveBackward() {
        System.out.println("Motorcycle drives backward");
    }

    @Override
    public void turnLeft() {
        System.out.println("Motorcycle turns left");
    }

    @Override
    public void turnRight() {
        System.out.println("Motorcycle turns right");
    }
}
