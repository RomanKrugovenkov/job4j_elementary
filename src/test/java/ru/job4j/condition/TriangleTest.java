package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        assertTrue(Triangle.exist(3, 4, 5));
    }

    @Test
    public void whenNotExist() {
        assertFalse(Triangle.exist(3, 1, 5));
    }
}