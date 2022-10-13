package org.example;

import java.util.Random;

public class Knight extends Character {


    public Knight() {
        Random r = new Random();
        super.setHp(r.nextInt((12 - 2) + 1) + 2);
        super.setPower(r.nextInt((12 - 2) + 1) + 2);
    }
    @Override
    public String toString() {
        return "Knight{" +
                "hp=" + super.getHp() +
                ", power=" + super.getPower() +
                '}';
    }

}


