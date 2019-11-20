package ru.job4j.oop.conditoin;

public class MultiMax {
    public int max(int first, int second, int third) {
        return (first > second & first > third) ? first : ((second > first & second > third) ? second : third);
    }
}
