package ru.job4j.loop;

public class CheckPrimeNumber {

    public boolean check(int finish) {
        boolean prime = false;

        int i;
        for(i = finish; i <= (finish + 1); i++){

            if((finish % 2) != 0 && finish / finish == 1) prime = true;
        }


        return prime;
    }
}
