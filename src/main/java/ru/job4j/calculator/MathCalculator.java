package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double difAndDivide(double first, double second) {
        return difference(first, second) + divide(first, second);
    }

    public static double summAll(double first, double second) {
        return sum(first, second) + difference(first, second)
                + multiply(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета difAndDivide равен: " + difAndDivide(10, 20));
        System.out.println("Результат расчета summAll равен: " + summAll(10, 20));
    }
}
