package ru.job4j.oop;

public class Check {
    static int counter;
    static boolean condition;

    static boolean check(char[] data) {

        for (int i = 0; i < data.length; i++) {

                if (data[i] == '(') {
                    counter ++;
                } else if (data[i] == ')') {
                    counter--;
                    if (counter < 0 )
                        return false;
                }
            }
            if (counter == 0) {
                return true;


            }else return false;
        }



    public static void main(String[] args) {
        char[] expression = {'(',')'};
        char[] expressionSecond = {'(', ')', '(', '('};
        System.out.println(check(expression));
        System.out.println(check(expressionSecond));
    }
}