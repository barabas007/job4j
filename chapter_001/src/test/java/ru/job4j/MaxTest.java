package ru.job4j;

import  org.junit.Assert;
import  org.junit.Test;
import  ru.job4j.conditoin.Max;

public class MaxTest {




        @Test
        public  void whenMax1To2Then2() {
            Max max = new Max();
            int result = max.max(1, 2);
            Assert.assertEquals(result, 2);
        }

        @Test
        public void whenMax2To1Then2() {
            Max max = new Max();
            int result = max.max(2, 1);
            Assert.assertEquals(result, 2);
        }


    @Test
    public void whenMax2To2Then0() {
        Max max = new Max();
        int result = max.max(2, 2);
        Assert.assertEquals(result, 0);
    }
}
