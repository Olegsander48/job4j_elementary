package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 3.82f;
    }

    public static float rubleToDollar(float value) {
        return value / 3.635f;
    }

    public static void main(String[] args) {
        System.out.println("440 rubles are " + String.format("%.2f", Converter.rubleToEuro(440)) + " euro.");
        System.out.println("2350 rubles are " + String.format("%.2f", Converter.rubleToDollar(2350)) + " dollars.");
        float input = 72.7f;
        float expected = 20;
        float output = Converter.rubleToDollar(input);
        boolean passed = expected == output;
        System.out.println("72.7 rubles are 20 dollars. Test result : " + passed);
        input = 19.1f;
        expected = 5;
        output = Converter.rubleToEuro(input);
        passed = expected == output;
        System.out.println("19.1 rubles are 5 euro. Test result : " + passed);
    }
}