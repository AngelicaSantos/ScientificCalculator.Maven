package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;

import static org.junit.Assert.*;

public class simpleMathTest
{
    @org.junit.Test
    public void add() {
        Double expected = 7.0;
        Double a = 4.0;
        Double b = 3.0;
        simpleMath c = new simpleMath();

        Double result = c.add(a, b);

        Assert.assertEquals(expected, result );

    }

    @org.junit.Test
    public void subtract() {
    }

    @org.junit.Test
    public void multiply() {
    }

    @org.junit.Test
    public void divide() {
    }

    @org.junit.Test
    public void modulo() {
    }
}