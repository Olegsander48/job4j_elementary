package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {
    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short input = 167;
        double expected = 65.55;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenManHeight179ThenWeight91Point85() {
        int height = 179;
        double expected = 90.85;
        double result = Fit.manWeight(height);
        assertThat(result)
                .isCloseTo(expected, within(0.01))
                .as("Идеальный вес для мужчины рассчитан неверно");
    }

    @Test
    void whenWomanHeight167ThenWeight65Point55() {
        int height = 167;
        double expected = 65.55;
        double result = Fit.womanWeight(height);
        assertThat(result)
                .isCloseTo(expected, within(0.01))
                .as("Идеальный вес для женщины рассчитан неверно");
    }

    @Test
    void whenNegativeHeightThenThrowException() {
        int height = -150;
        assertThatThrownBy(() -> Fit.manWeight(height))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Рост должен быть положительным числом.")
                .as("Ожидалось исключение при отрицательном росте");
    }

    @Test
    void whenZeroHeightThenThrowException() {
        int height = 0;
        assertThatThrownBy(() -> Fit.womanWeight(height))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Рост должен быть положительным числом.")
                .as("Ожидалось исключение при нулевом росте");
    }
}