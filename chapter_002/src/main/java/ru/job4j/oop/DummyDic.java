package ru.job4j.oop;

public class DummyDic {
    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String say = dic.engToRus();
        System.out.println("Неизвестное слово " + say);
    }

    public String engToRus() {
        String vois = " Yes ! ";
        return vois;
    }


}
