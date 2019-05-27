package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;

import static org.junit.Assert.*;

public class advancedMathTest {

    @org.junit.Test
    public void sqrt() {
        Double expected = 2.0;
        Double a = 4.0;
        advancedMath c = new advancedMath();

        Double result = c.sqrt(a);

        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void sqrt2() {
        Double expected = 4.0;
        Double a = 16.0;
        advancedMath c = new advancedMath();

        Double result = c.sqrt(a);

        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void pow() {
        Double expected = 4.0;
        Double a = 2.0;
        Double b = 2.0;
        advancedMath c = new advancedMath();

        Double result = c.pow(a,b);

        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void pow2() {
        Double expected = 16.0;
        Double a = 2.0;
        Double b = 4.0;
        advancedMath c = new advancedMath();

        Double result = c.pow(a,b);

        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void sin() {
        Double expected = 0.8414709848078965;
        Double a = 1.0;
        advancedMath c = new advancedMath();

        Double result = c.sin(a);

        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void sin2() {
        Double expected = 0.4121184852417566;
        Double a = 9.0;
        advancedMath c = new advancedMath();

        Double result = c.sin(a);

        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void cos() {
        Double expected = 0.9601702866503661;
        Double a = 6.0;
        advancedMath c = new advancedMath();

        Double result = c.cos(a);

        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void cos2() {
        Double expected = 0.40808206181339196;
        Double a = 20.0;
        advancedMath c = new advancedMath();

        Double result = c.cos(a);

        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void tan() {
        Double expected = 2.237160944224742;
        Double a = 20.0;
        advancedMath c = new advancedMath();

        Double result = c.tan(a);

        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void tan2() {
        Double expected = 0.320040389379563;
        Double a = 60.0;
        advancedMath c = new advancedMath();

        Double result = c.tan(a);

        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void asin() {
        Double expected = 1.5707963267948966;
        Double a = 1.0;
        advancedMath c = new advancedMath();

        Double result = c.asin(a);

        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void asin2() {
        Double expected = 0.52359877559829889;
        Double a = 0.5;
        advancedMath c = new advancedMath();

        Double result = c.asin(a);

        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void acos() {
        Double expected = 0.5235987755982989;
        Double a = 0.5;
        advancedMath c = new advancedMath();

        Double result = c.asin(a);

        Assert.assertEquals(expected, result);
    }
    @org.junit.Test
    public void acos2() {
        Double expected = 1.4706289056333368;
        Double a = 0.10;
        advancedMath c = new advancedMath();

        Double result = c.acos(a);

        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void atan() {
        Double expected = 1.5208379310729538;
        Double a = 20.0;
        advancedMath c = new advancedMath();

        Double result = c.atan(a);

        Assert.assertEquals(expected, result);
    }

    @org.junit.Test
    public void atan2() {
        Double expected = 1.5042281630190728;
        Double a = 15.0;
        advancedMath c = new advancedMath();

        Double result = c.atan(a);

        Assert.assertEquals(expected, result);
    }
}