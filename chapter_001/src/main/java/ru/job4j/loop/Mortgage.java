package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monthly, double percent) {
        int year = 0;



       while ( amount * percent < monthly * 12){

          year++;
       }
        return year;
    }

}
