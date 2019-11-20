package ru.job4j.oop.calculator;

public class Fit {

    public static double manWeight(double heightMan) {
        return (heightMan - 100) * 1.15;
    }

    public static double womanWeight(double heightWoman) {
        return (heightWoman - 110) * 1.15;
    }

    public static void main(String[] args) {
        double heightMan = 180;
        double expectedMan = 92;
        double outMan = manWeight(heightMan);
        boolean passedMan = expectedMan == outMan;
        double heightWoman = 110;
        double expectedWoman = 0;
        double outWoman = womanWeight(heightWoman);
        boolean passedWoman = expectedWoman == outWoman;
        System.out.println(" Man 180 is " + passedMan);
        System.out.println(" Woman 110 is " + passedWoman);
    }
}
