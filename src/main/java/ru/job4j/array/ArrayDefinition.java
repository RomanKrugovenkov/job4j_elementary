package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println(ages.length);
        String[] surname = new String[100500];
        System.out.println(surname.length);
        float[] prices = new float[40];
        System.out.println(prices.length);
        String[] names = new String[4];
        names[0] = "Roman";
        names[1] = "Alex";
        names[2] = "Fedor";
        names[3] = "Natasha";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
