package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Size of ages is " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Size of surnames is " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Size of prices is " + prices.length);
        String[] names = new String[4];
        names[0] = "Pavel";
        names[1] = "Nikita";
        names[2] = "Sasha";
        names[3] = "Artyom";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
