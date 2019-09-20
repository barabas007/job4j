package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.conditoin.SqMax;

public class SqMaxTest {

    @Test


    public void max() {
        SqMax check = new SqMax();
        int result = check.max(5, 4, 8, 6);
        Assert.assertEquals(result, 8);
    }
}
