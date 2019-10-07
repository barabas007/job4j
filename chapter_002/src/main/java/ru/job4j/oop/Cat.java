package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.food);
    }
    public void show1(){
        System.out.println(this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nick){
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.show();
        System.out.println("The name of the cat");
        Cat theName = new Cat();
        theName.giveNick("Dollar");
        theName.show1();
    }
}
