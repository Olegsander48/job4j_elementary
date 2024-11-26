package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double semiperimetr = (a + b + c) / 2;
        return Math.sqrt(semiperimetr * (semiperimetr - a) * (semiperimetr - b) * (semiperimetr - c));
    }

    public static void main(String[] args) {
        System.out.println("area (2, 2, 2) = " + TriangleArea.area(3, 4, 5));
    }
}
