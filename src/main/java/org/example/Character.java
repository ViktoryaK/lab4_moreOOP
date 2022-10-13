package org.example;

import java.util.Random;



public class Character {
    private int hp;
    private int power;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        }
        else {
            this.hp = hp;
        }
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power < 0) {
            this.power = 0;
        }
        else {
            this.power = power;
        }
    }

    void kick(Character c) {
        Random r = new Random();
        int kic = r.nextInt((power - 1) + 1) + 1;
        c.setHp(c.getHp()-kic);
    }

    @Override
    public String toString() {
        return "Character{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }

    boolean isAlive() {
        if ((hp > 0) && (power >= 0)) {
            return true;
        } else {return false;}

    }
}


