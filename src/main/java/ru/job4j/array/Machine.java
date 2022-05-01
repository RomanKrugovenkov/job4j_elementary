package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size;
        int back = money - price;
        int c = 0;
        for (size = 0; back > 0; size++) {
            if (coins[c] <= back) {
                rsl[size] = coins[c];
                back -= coins[c];
            } else {
                while (coins[c] > back) {
                    c++;
                }
                rsl[size] = coins[c];
                back -= coins[c];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
