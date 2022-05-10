package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to44then4dot24() {
        Point a = new Point(1, 1);
        Point b = new Point(4, 4);
        double expected = 4.24;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to33then1dot41() {
        Point a = new Point(2, 2);
        Point b = new Point(3, 3);
        double expected = 1.41;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }
}