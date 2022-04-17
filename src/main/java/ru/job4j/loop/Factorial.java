package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int i;
        int rsl = 1;
        for (i = 0; i <= n; i++) {
            rsl = i != 0 ? i * rsl : 1;
        }
        return rsl;
    }
}

