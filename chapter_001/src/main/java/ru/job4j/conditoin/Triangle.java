package ru.job4j.conditoin;

public class Triangle {

    public static boolean exist(double ab, double ac, double dc) {
        return ((ab + ac) > dc && (ac + dc) > ab && (ab + ab + dc) > ac);
    }
}
