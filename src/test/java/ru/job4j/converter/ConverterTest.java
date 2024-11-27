package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert19dot1RUBThen5Euro() {
        float input = 19.1f;
        float expected = 5;
        float output = Converter.rubleToEuro(input);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenConvert72dot7RUBThen20Dollars() {
        float input = 72.7f;
        float expected = 20;
        float output = Converter.rubleToDollar(input);
        assertThat(output).isEqualTo(expected);
    }
}