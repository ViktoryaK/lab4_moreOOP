package org.example;

public class Elf extends Character {

    public Elf() {
        super.setHp(10);
        super.setPower(10);
    }
    void kick(Character c) {
        if (c.getPower() < super.getPower()) {
            c.setHp(0);
        }
        else {c.setPower(c.getPower()-1);}
    }

    @Override
    public String toString() {
        return "Elf{" +
                "hp=" + super.getHp() +
                ", power=" + super.getPower() +
                '}';
    }
}
