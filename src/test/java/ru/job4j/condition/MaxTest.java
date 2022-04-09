package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

import static ru.job4j.condition.Max.*;

public class MaxTest {

    @Test
    public void whenL5R7() {
        int expected = 7;
        int out = max(5, 7);
        assertEquals(expected, out);
    }

    @Test
    public void whenL6R4() {
        int expected = 6;
        int out = max(6, 4);
        assertEquals(expected, out);
    }

    @Test
    public void whenL8R8() {
        int expected = 8;
        int out = max(8, 8);
        assertEquals(expected, out);
    }
}