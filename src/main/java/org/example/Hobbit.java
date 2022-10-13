package org.example;

public class Hobbit extends Character{

    public Hobbit() {
        super.setHp(3);
        super.setPower(0);
    }

    @Override
    public String toString() {
        return "Hobbit{" +
                "hp=" + super.getHp() +
                ", power=" + super.getPower() +
                '}';
    }
    void toCry() {
        System.out.println("AAAAAAAA");
    }

    void kick(Character c) {
        toCry();
    }

}

