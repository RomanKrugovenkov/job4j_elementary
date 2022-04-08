package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;
import static ru.job4j.condition.Point.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to44then424() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 4;
        double expected = 4.24;
        double out = distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to33then141() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 3;
        int y2 = 3;
        double expected = 1.41;
        double out = distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}
