package com.realdolmen.java8.exercise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MotorCycleTest {

    private MotorCycle motorCycle;

    @Before
    public void setUp() throws Exception {
        motorCycle = new MotorCycle();
    }

    @Test
    public void testStartEngine() throws Exception {
        motorCycle.startEngine();
    }

    @Test
    public void testDriveForward() throws Exception {
        motorCycle.driveForward();
    }

    @Test
    public void testDriveBackward() throws Exception {
        motorCycle.driveBackward();
    }

    @Test
    public void testTurnLeft() throws Exception {
        motorCycle.turnLeft();
    }

    @Test
    public void testTurnRight() throws Exception {
        motorCycle.turnRight();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testTurnOnRadio() throws Exception {
        motorCycle.turnOnRadio();
    }
}