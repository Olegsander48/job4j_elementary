package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To5Then7() {
        int left = 7;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To8Then8() {
        int left = 1;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To4And3Then3() {
        int first = 5;
        int second = 4;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To2And1And3Then3() {
        int first = 2;
        int second = 1;
        int third = 3;
        int fourth = 7;
        int result = Max.max(first, second, third, fourth);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }
}