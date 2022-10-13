package org.example;

import java.util.Random;

public class King extends Character {
    public King() {
        Random r = new Random();
        super.setHp(r.nextInt((15 - 5) + 1) + 5);
        super.setPower(r.nextInt((15 - 5) + 1) + 5);
    }
    @Override
    public String toString() {
        return "King{" +
                "hp=" + super.getHp() +
                ", power=" + super.getPower() +
                '}';
    }

}

