package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void when1to10sumByEven30() {
        int result = Counter.sumByEven(1, 10);
        int expected = 30;
        assertEquals(expected, result);
    }

    @Test
    public void when3to8sumByEven18() {
        int result = Counter.sumByEven(3, 8);
        int expected = 18;
        assertEquals(expected, result);
    }

    @Test
    public void when3to3sumByEven0() {
        int result = Counter.sumByEven(3, 3);
        int expected = 0;
        assertEquals(expected, result);
    }
}