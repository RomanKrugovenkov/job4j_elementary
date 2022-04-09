package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int rsl = left >= right ? left : right;
        return rsl;
    }

    public static void main(String[] args) {
        int left = 5;
        int right = 7;
        System.out.println("maximum number " + max(left, right));
    }
}
