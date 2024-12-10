package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        double expected = 2;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus5minus6to78then18dot4391() {
        Point a = new Point(-5, -6);
        Point b = new Point(7, 8);
        double output = a.distance(b);
        double expected = 18.4391;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus2to31then5() {
        Point a = new Point(-1, -2);
        Point b = new Point(3, 1);
        double output = a.distance(b);
        double expected = 5;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}