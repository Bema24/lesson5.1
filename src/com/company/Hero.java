package com.company;

public class Hero {

    private int hearth;
    private int damage;
    private String type;

    public Hero(int hearth, int damage, String type) {
        this.hearth = hearth;
        this.damage = damage;
        this.type = type;
    }

    public Hero(int hearth, int damage) {
        this.hearth = hearth;
        this.damage = damage;
    }

    public int getHearth() {
        return hearth;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

}
