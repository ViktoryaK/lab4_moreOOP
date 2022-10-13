package org.example;

import java.lang.reflect.InvocationTargetException;

public class GameManager {
    void fight(Character c1, Character c2){
        String c1Name = c1.getClass().getName().substring(12);
        String c2Name = c2.getClass().getName().substring(12);
        System.out.println(c1Name + " had " + c1.getHp() + " hp");
        System.out.println(c2Name + " had " + c2.getHp() + " hp");

        while(c1.isAlive() &&  c2.isAlive()) {
            c1.kick(c2);
            System.out.println(c1Name + " kicked " + c2Name);
            c2.kick(c1);
            System.out.println(c2Name + " kicked " + c1Name);
            System.out.println("Now " + c1Name + " has " + c1.getHp() + " hp");
            System.out.println("Now " + c2Name + " has " + c2.getHp() + " hp");
            System.out.println("\n");
            if ((c1Name.equals("Hobbit")) && (c2Name.equals("Hobbit"))) {
                System.out.println("Two friendly units met.\n");
                break;
            }
        }
        if (c1.isAlive()) {
            System.out.println(c1Name + " Won");
        } else {
            System.out.println(c2Name + " Won");
        }
    }
}
