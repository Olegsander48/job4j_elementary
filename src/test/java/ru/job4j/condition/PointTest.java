package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(2, 0);
        double expected = 2;
        double out = firstPoint.distance(secondPoint);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to40then1() {
        Point firstPoint = new Point(3, 0);
        Point secondPoint = new Point(4, 0);
        double expected = 1;
        double out = firstPoint.distance(secondPoint);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32to75then5() {
        Point firstPoint = new Point(3, 2);
        Point secondPoint = new Point(7, 5);
        double expected = 5;
        double out = firstPoint.distance(secondPoint);
        Assert.assertEquals(expected, out, 0.01);
    }

}