package ru.job4j.conditoin;


public  class SqMax {
    public int max(int first, int second, int third, int forth) {
        int result = third;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;
                }
            }
        } else if (second > third) {
            if (second > forth) {
                if (second > first) {
                    result = second;
                }
            }
        } else if (third < forth) {
            result = forth;
        }
        return result;
    }
}
