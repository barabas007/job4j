package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.conditoin.Point;
import static org.hamcrest.core.Is.is;

public class PointTest {

    @Test

    public void distans3d() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist =  a.distance(b);
        Assert.assertThat(2.0, is(dist));
    }
}
