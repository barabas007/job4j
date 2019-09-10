package ru.job4j.array;

import java.util.Arrays;

public class ArrayChar {

    public static boolean startsW(char[] word, char[] pref) {
        boolean result = false;

        for (char i = 0; i < word.length; i++){

            for (char j = 0; j < pref.length; j++){

            }
               // boolean areEqual = Arrays.equals(word, pref);

                if(word[0] == pref[0] & word[1] == pref[1]){

                return true;

            }
        }
          return result;
    }
}
