package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double high = p / (2 * (1 + k));
        double length = high * k;
        return high * length;
    }

    public static void main(String[] args) {
        System.out.println(" p = 4, k = 1, s = 1, real = " + RectangleArea.square(4, 1));
        System.out.println(" p = 6, k = 2, s = 2, real = " + RectangleArea.square(6, 2));
    }
}
