package com.realdolmen.java8.exercise1;

/**
 * Created by KDAAU95 on 6/03/2015.
 */
public interface Vehicle {

    void startEngine();
    void driveForward();
    void driveBackward();
    void turnLeft();
    void turnRight();

    default void turnOnRadio() {
        throw new UnsupportedOperationException("turnOnRadio");
    }
}
