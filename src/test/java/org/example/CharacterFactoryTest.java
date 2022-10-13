package org.example;


import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

public class CharacterFactoryTest {
    @Test
    public void print() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        CharacterFactory i = new CharacterFactory();
        System.out.println(i.createCharacter());
    }
}