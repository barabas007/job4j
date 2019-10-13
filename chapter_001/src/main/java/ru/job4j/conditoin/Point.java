package ru.job4j.conditoin;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;


public class Point {
    private double x;
    private int z;
    private double y;

    public Point(double first, double second) {
        this.x = first;
        this.y = second;
    }
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public  double distance(Point that) {

        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
    public double distance3d(Point that) {
        double d3d = Math.sqrt(double pow(this.x - that.x + this.y - that.y + this.z - that.z));
        return -1D;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(0, 0, 2);
        double dist = a.distance(b);
        double dist3d = c.distance3d(b);
        System.out.println(dist);
        System.out.println(dist3d);
    }
}
