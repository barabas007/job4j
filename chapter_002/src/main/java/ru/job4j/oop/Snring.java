package ru.job4j.oop;

public class Snring {
    public static void main(String[] args) {
        String[] arrStr = {"Зарабатывай", "и", "Программируй"};
        for (int i = 0; i < arrStr.length; i++) {
            System.out.print(arrStr[i] + ' ');
        }
        System.out.println();
        for (int i = arrStr.length - 1; i >= 0; i--) {
            System.out.print(arrStr[i] + ' ');
        }
    }
}