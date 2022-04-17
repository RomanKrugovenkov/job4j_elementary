package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalcFactorial5Then120() {
        int result = Factorial.calc(5);
        int expected = 120;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalcFactorial0Then1() {
        int result = Factorial.calc(0);
        int expected = 1;
        assertEquals(expected, result);
    }
}