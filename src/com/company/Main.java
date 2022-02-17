package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(700, 50);
        boss.weapone.setName(" AK-47 ");
        boss.weapone.setType("Автомат ");
        System.out.println(boss.info());
        System.out.println("");
    }
}
