package ru.job4j.oop.array;

public class ArrayChar {

    public static boolean startsW(char[] word, char[] pref) {
        boolean result = false;
        for (char i = 0; i < word.length; i++) {
            if (word[0] == pref[0] & word[1] == pref[1]) {
                    return true;
            }
        }
        return result;

    }
}