package ru.job4j.oop;

import org.w3c.dom.ls.LSOutput;

public class Check {
    static int counter;
    static boolean condition;

    static boolean check(char[] data) {

        for (int i = 0; i < data.length; i++) {
            while (condition) {
                if (data[i] == '(') {
                    counter++;
                } else if (data[i] == ')') {
                    counter--;
                    if (counter < 0)
                        return true;
                }
            }
            if (counter == 0) {
                return false;

            }
        }
        return true;

    }

    public static void main(String[] args) {
        char[] expression = {'(',')'};
        char[] expressionSecond = {'(', ')', '('};
        System.out.println(check(expressionSecond));
        System.out.println(check(expression));
    }
}