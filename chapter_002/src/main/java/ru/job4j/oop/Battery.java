package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size){
        this.load = size;
    }
    public void exchange(Battery another){
        this.load = this.load + another.load;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(8);
        Battery battery1 = new Battery(9);
        battery.exchange(battery1);
    }
}
