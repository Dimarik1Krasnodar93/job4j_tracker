package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void testDistance3d01() {
        int x1 = 0;
        int  y1 = 0;
        int z1 = 1;
        int x2 = 1;
        int y2 = 1;
        int z2 = 1;
        double expected = 1.41;
        Point point1 = new Point(x1, y1, z1);
        Point point2 = new Point(x2, y2, z2);
        double result = point1.distance3d(point2);

    }

    @Test
    public void testDistance3d02() {
        int x1 = 0;
        int  y1 = 0;
        int z1 = 0;
        int x2 = 2;
        int y2 = 2;
        int z2 = 2;
        double expected = 3.46;
        Point point1 = new Point(x1, y1, z1);
        Point point2 = new Point(x2, y2, z2);
        double result = point1.distance3d(point2);
        Assert.assertEquals(expected, result, 0.01);
    }
}