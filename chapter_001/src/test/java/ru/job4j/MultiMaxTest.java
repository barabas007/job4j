package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.conditoin.MultiMax;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        Assert.assertEquals(result, 4);
    }

}
