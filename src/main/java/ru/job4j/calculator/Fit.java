package ru.job4j.calculator;

/**
 * Класс Fit для расчета идеального веса.
 */
public class Fit {

    /**
     * Рассчитывает идеальный вес для мужчины.
     *
     * @param height Рост в сантиметрах.
     * @return Идеальный вес.
     */
    public static double manWeight(int height) {
        validateHeight(height);
        return (height - 100) * 1.15;
    }

    /**
     * Рассчитывает идеальный вес для женщины.
     *
     * @param height Рост в сантиметрах.
     * @return Идеальный вес.
     */
    public static double womanWeight(int height) {
        validateHeight(height);
        return (height - 110) * 1.15;
    }

    /**
     * Проверяет, что параметр рост имеет допустимое значение.
     *
     * @param height Рост в сантиметрах.
     */
    private static void validateHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Рост должен быть положительным числом.");
        }
    }

    public static void main(String[] args) {
        int manHeight = 179;
        int womanHeight = 167;

        System.out.printf("Man %d cm is %.2f kg.%n", manHeight, manWeight(manHeight));
        System.out.printf("Woman %d cm is %.2f kg.%n", womanHeight, womanWeight(womanHeight));
    }
}
