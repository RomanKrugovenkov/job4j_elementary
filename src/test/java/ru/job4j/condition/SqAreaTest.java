package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

import static ru.job4j.condition.SqArea.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        double out = square(6, 2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K4Square0dot64() {
        double expected = 0.64;
        double out = square(4, 4);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K1Square2dot25() {
        double expected = 2.25;
        double out = square(6, 1);
        assertEquals(expected, out, 0.01);
    }
}