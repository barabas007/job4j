package ru.job4j.calculator;

/**
 * Calculate.
 * @author Igor Shilov
 */



public class Calculator {

    /**
     * Method add
     * @param first
     * @param second
     *
     */

    public static void add(double first, double second){

        double result = first + second;

        System.out.println(first + " + " + second + " = " + result);


    }

    /**
     * Method div
     * @param first
     * @param second
     */

    public static void div(double first, double second) {

        double result = first / second;

        System.out.println(first + " / " + second + " = " + result);

    }

    /**
     * Method multiply
     * @param first
     * @param second
     */


    public static void multiply(double first, double second) {

        double result = first * second;

        System.out.println(first + " * " + second + " = " + result);

    }

    /**
     * Method subtrack
     * @param first
     * @param second
     */

    public static void subtrack(double first, double second) {

        double result = first - second;

        System.out.println(first + " - " + second + " = " + result);

    }

    /**
     * method main
     * @param args
     */


    public static void main(String[] args) {

        add(1 , 1);
        div(4 , 2);
        multiply(2 , 1);
        subtrack(10 , 5);
    }

}
