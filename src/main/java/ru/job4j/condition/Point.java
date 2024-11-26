package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        System.out.println("Distance from (0, 0) to (2, 0) is "
                            + String.format("%.4f", Point.distance(0, 0, 2, 0)));
        System.out.println("Distance from (2, 3) to (6, 4) is "
                            + String.format("%.4f", Point.distance(2, 3, 6, 4)));
    }
}
