package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(8);
        Battery battery1 = new Battery(9);
        System.out.println("battery : " + battery.load + ". battery1 : " + battery1.load);
        battery.exchange(battery1);
        System.out.println("battery : " + battery.load + ". battery1 : " + battery1.load);
    }

    public void exchange(Battery another) {

        this.load = this.load + another.load;
        another.load = 0;
    }
}
