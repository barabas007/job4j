package ru.job4j.conditoin;

public class SqArea {

    public static double square(int p, int k){

        // S = L * h
        // h = p / 2 * (k + 1)
        // L = h * k;

        // L = (p/2 * (k + 1)) * k
        // S = (p/2 * (k + 1) * k) * (p/2 * (k + 1))

        return (p/2 * (k +1) * k) * (p/2 * (k + 1));
    }


    public static void main(String[] args) {

        int p = 6;
        int k = 2;
        double expected = 162;
        double out = square(p, k);
        boolean passed = expected == out;
        System.out.println(" p = 6, k = 2, s = 2, real = " + passed);
    }
}
