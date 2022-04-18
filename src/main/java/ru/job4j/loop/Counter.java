package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int i;
        int sum = 0;
        for (i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int i;
        int sum = 0;
        for (i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
