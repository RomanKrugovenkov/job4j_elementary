package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

import static ru.job4j.condition.Max.*;

public class MaxTest {

    @Test
    public void when57() {
        int expected = 7;
        int out = max(5, 7);
        assertEquals(expected, out);
    }

    @Test
    public void when146() {
        int expected = 6;
        int out = max(1, 4, 6);
        assertEquals(expected, out);
    }

    @Test
    public void when0001() {
        int expected = 1;
        int out = max(0, 0, 0, 1);
        assertEquals(expected, out);
    }
}