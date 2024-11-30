package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {
    @Test
    public void whenSumFrom9To7Is0() {
        int start = 9;
        int end = 7;
        int expected = 0;
        assertThat(Counter.sum(start, end)).isEqualTo(expected);
    }

    @Test
    public void whenSumFromMinus5To15Is105() {
        int start = -5;
        int end = 15;
        int expected = 105;
        assertThat(Counter.sum(start, end)).isEqualTo(expected);
    }

    @Test
    public void whenSumFrom1To10Is55() {
        int start = 1;
        int end = 10;
        int expected = 55;
        assertThat(Counter.sum(start, end)).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom5To17Then66() {
        int start = 5;
        int finish = 17;
        int result = Counter.sumByEven(start, finish);
        int expected = 66;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus3To9Then18() {
        int start = -3;
        int finish = 9;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }
}