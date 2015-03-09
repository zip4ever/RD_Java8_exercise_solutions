package com.realdolmen.java8.exercise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car();
    }

    @Test
    public void testStartEngine() throws Exception {
        car.startEngine();
    }

    @Test
    public void testDriveForward() throws Exception {
        car.driveForward();
    }

    @Test
    public void testDriveBackward() throws Exception {
        car.driveBackward();
    }

    @Test
    public void testTurnLeft() throws Exception {
        car.turnLeft();
    }

    @Test
    public void testTurnRight() throws Exception {
        car.turnRight();
    }

    @Test
    public void testTurnOnRadio() throws Exception {
        car.turnOnRadio();
    }
}