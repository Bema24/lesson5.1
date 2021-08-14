package com.company;

public class Main {

    public static void main(String[] args) {
        Boss loki = new Boss();
        loki.setDamage(45);
        loki.setHearth(900);
        loki.setDefType("Black Magic");
        System.out.println("Loki " + " " + loki.getDamage() + " " + loki.getHearth() + " " + loki.getDefType());

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHearth() + " " + createHeroes()[i].getDamage() + " " + createHeroes()[i].getType());
        }

    }

    static Hero[] createHeroes() {
        Hero thor = new Hero(400, 25, "Lightning");
        Hero odin = new Hero(600, 30);
        Hero captainAmerica = new Hero(200, 40, "Power");
        Hero[] arr = {captainAmerica, odin, thor};
        return arr;
    }
}
