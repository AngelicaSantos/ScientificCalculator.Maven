package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;

import static org.junit.Assert.*;

public class simpleMathTest {
    @org.junit.Test
    public void add() {
        Double expected = 7.0;
        Double a = 4.0;
        Double b = 3.0;
        simpleMath c = new simpleMath();

        Double result = c.add(a, b);

        Assert.assertEquals(expected, result);

    }

    @org.junit.Test
    public void add2() {
        Double expected = 10.0;
        Double a = 5.0;
        Double b = 5.0;
        simpleMath c = new simpleMath();

        Double result = c.add(a, b);

        Assert.assertEquals(expected, result);
    }


    @org.junit.Test
    public void subtract() {
        Double expected = 6.0;
        Double a = 9.0;
        Double b = 3.0;
        simpleMath c = new simpleMath();

        Double result = c.subtract(a, b);

        Assert.assertEquals(expected, result);

    }

    @org.junit.Test
    public void subtract2() {
        Double expected = 10.0;
        Double a = 20.0;
        Double b = 10.0;
        simpleMath c = new simpleMath();

        Double result = c.subtract(a, b);

        Assert.assertEquals(expected, result);

    }

    @org.junit.Test
    public void multiply() {
        Double expected = 10.0;
        Double a = 5.0;
        Double b = 2.0;
        simpleMath c = new simpleMath();

        Double result = c.multiply(a, b);

        Assert.assertEquals(expected, result);

    }

    @org.junit.Test
    public void multiply2() {
        Double expected = 25.0;
        Double a = 5.0;
        Double b = 5.0;
        simpleMath c = new simpleMath();

        Double result = c.multiply(a, b);

        Assert.assertEquals(expected, result);

    }

    @org.junit.Test
    public void divide() {
        Double expected = 2.0;
        Double a = 10.0;
        Double b = 5.0;
        simpleMath c = new simpleMath();

        Double result = c.divide(a, b);

        Assert.assertEquals(expected, result);

    }

    @org.junit.Test
    public void divide2() {
        Double expected = 4.0;
        Double a = 20.0;
        Double b = 5.0;

        simpleMath c = new simpleMath();

        Double result = c.divide(a, b);

        Assert.assertEquals(expected, result);

    }

    @org.junit.Test
    public void divide3() {
        Double expected = 0.0;
        Double a = 20.0;
        Double b = 0.0;

        simpleMath c = new simpleMath();

        Double result = c.divide(a, b);

        Assert.assertEquals(expected, result);


    }
}


