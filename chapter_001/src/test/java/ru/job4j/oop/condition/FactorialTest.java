package ru.job4j.oop.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.oop.loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.

        Factorial check = new Factorial();
        int result = check.calc(5);
        Assert.assertEquals(result, 120);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        Factorial check = new Factorial();
        int result = check.calc(0);
        Assert.assertEquals(result, 1);

    }
}
