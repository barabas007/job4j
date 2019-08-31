package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.conditoin.SqMax;

public class SqMaxTest {

    @Test


    public void Max() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 2,6);
        Assert.assertEquals(result, 6);
    }
}
