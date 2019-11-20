package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.calculator.Fit;

public class FitTest {

    @Test

    public void manWeight() {

        double heightMan = 180;
        double expectedMan = 92;
        double outMan = Fit.manWeight(heightMan);
        Assert.assertEquals(equals(expectedMan), equals(outMan));


    }

    @Test

    public void womanWeight() {

        double heightWoman = 110;
        double expectedWoman = 0;
        double outWoman = Fit.womanWeight(heightWoman);
        Assert.assertEquals(equals(expectedWoman), equals(outWoman));
    }

}

