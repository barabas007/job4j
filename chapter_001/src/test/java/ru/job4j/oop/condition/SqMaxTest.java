package ru.job4j.oop.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.conditoin.SqMax;

public class SqMaxTest {

    @Test


    public void max() {
        SqMax check = new SqMax();
        int result = check.max(5, 4, 8, 6);
        Assert.assertEquals(result, 8);
    }
}
