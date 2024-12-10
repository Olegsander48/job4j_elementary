package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To3Then6() {
        int left = 6;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To9Then9() {
        int left = 1;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To7ToMinus1Then7() {
        int first = 3;
        int second = 7;
        int third = -1;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3To4Then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus9To1To6ToMinus78Then6() {
        int first = -9;
        int second = 1;
        int third = 6;
        int fourth = -78;
        int result = Max.max(first, second, third, fourth);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}