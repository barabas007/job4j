package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.conditoin.SqArea;

public class SqAreaTest {


    @Test

    public void square(){

        int p = 6;
        int k = 2;
        double expected = 162;
        double out = SqArea.square(p, k);
        Assert.assertEquals(equals(expected), equals(out));
    }
}
