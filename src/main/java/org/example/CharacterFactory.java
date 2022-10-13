package org.example;

import org.reflections.Reflections;
import org.apache.log4j.BasicConfigurator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    public Character createCharacter() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        BasicConfigurator.configure();
        Reflections reflections = new Reflections("org.example");
        Set<Class<? extends Character>> subTypes =
                reflections.getSubTypesOf(Character.class);
        Random random = new Random();
        Class[] i = new Class[subTypes.size()];
        int j=0;
        for (Class<? extends Character> cla: subTypes) {
            i[j] = cla;
            j++;
        }
        Class o = i[random.nextInt(i.length)];
        Constructor constructor = o.getConstructor();
        Character fin = (Character) constructor.newInstance();
        if (fin.getHp() > 0) {
            return fin;
        }
        else {
            System.out.println("pizdiec");
            return createCharacter();}

    }
}
