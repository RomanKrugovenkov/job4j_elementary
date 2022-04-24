package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        int l = array.length;
        for (int i = 0; i < l / 2; i++) {
            temp = array[i];
            array[i] = array[l - 1 - i];
            array[l - 1 - i] = temp;
        }
        return array;
    }
}
