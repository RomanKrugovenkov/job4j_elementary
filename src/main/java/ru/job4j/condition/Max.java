package ru.job4j.condition;

public class Max {

    public static int max(int first, int second, int third, int fourth) {
        int max2 = first >= second ? first : second;
        int max3 = max2 >= third ? max2 : third;
        return max3 >= fourth ? max3 : fourth;
    }
}
