package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        int summ = amount;
        while (summ > 0) {
            summ = (int) (summ + summ * percent / 100);
            summ = summ - monthly * 12;
            year++;
        }
        return year;
    }

}
