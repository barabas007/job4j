package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng){
        String vois = " Yes ! ";
        return vois;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String say = dic.engToRus(" Yes ");
        System.out.println("Неизвестное слово " + say);
    }


}
