package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int inEuro = 140;
        int expectedEuro = 2;
        int outEuro = Converter.rubleToEuro(inEuro);
        Assert.assertEquals(expectedEuro, outEuro);
    }



   //public static int rubleToDollar(int value){

   //}

    @Test
    public void rubleToDollar() {
        int inDollar = 180;
        int expectedDollar = 3;
        int outDollar = Converter.rubleToDollar(inDollar);
        Assert.assertEquals(expectedDollar, outDollar);
    }

    @Test
    public void euroToRuble() {
        int inEuroRuble = 1;
        int expectedEuroRuble = 70;
        int outEuroRuble = Converter.euroToRuble(inEuroRuble);
        Assert.assertEquals(expectedEuroRuble, outEuroRuble);
    }

    @Test
    public void dollarToRuble() {
        int inDollarRuble = 1;
        int expectedDollarRuble = 60;
        int outDollarRuble = Converter.dollarToRuble(inDollarRuble);
        Assert.assertEquals(expectedDollarRuble, outDollarRuble);
    }


}
