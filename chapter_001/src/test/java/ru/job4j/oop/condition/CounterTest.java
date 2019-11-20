package ru.job4j.oop.condition;


import org.junit.Test;
import ru.job4j.oop.loop.Counter;
import org.junit.Assert;


public class CounterTest {

    @Test

    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter check = new Counter();
        int result = check.add(1, 10);
        Assert.assertEquals(result, 30);
    }


}
