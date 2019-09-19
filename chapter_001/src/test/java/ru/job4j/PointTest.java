package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.conditoin.Point;

public class PointTest {

    @Test

    public void distans() {
        double expectedPoint = 2;
        double outPoint = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(equals(expectedPoint), equals(outPoint));
    }
}
