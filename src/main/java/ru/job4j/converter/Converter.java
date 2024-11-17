package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 3.561f;
    }

    public static float rubleToDollar(float value) {
        return value / 3.372f;
    }

    public static void main(String[] args) {
        System.out.println("440 rubles are " + String.format("%.2f", Converter.rubleToEuro(440)) + " euro.");
        System.out.println("2350 rubles are " + String.format("%.2f", Converter.rubleToDollar(2350)) + " dollars.");
    }
}