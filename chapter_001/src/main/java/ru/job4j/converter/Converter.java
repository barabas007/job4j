package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {

        return value / 70;
    }

    public static int rubleToDollar(int value) {

        return value / 60;
    }

    public static int euroToRuble(int value) {

        return value * 70;
    }

    public static int dollarToRuble(int value) {

        return value * 60;
    }


    public static void main(String[] args) {
        int inEuro = 140;
        int expectedEuro = 2;
        int outEuro = rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);

        int inDollar = 140;
        int expectedDollar = 2;
        int outDollar = rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2. Test result : " + passedDollar);

        int inEuroRuble = 1;
        int expectedEuroRuble = 70;
        int outEuroRuble = euroToRuble(inEuroRuble);
        boolean passedEuroRuble = expectedEuroRuble == outEuroRuble;
        System.out.println("1 euro are 70. Test result : " + passedEuroRuble);

        int inDollarRuble = 1;
        int expectedDollarRuble = 60;
        int outDollarRuble = dollarToRuble(inDollarRuble);
        boolean passedDollarRuble = expectedDollarRuble == outDollarRuble;
        System.out.println("1 dollar are 60. Test result : " + passedDollarRuble);
    }

}
