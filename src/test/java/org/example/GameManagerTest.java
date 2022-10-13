package org.example;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class GameManagerTest {

    @Test
    void fight() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        GameManager p = new GameManager();
        CharacterFactory factory = new CharacterFactory();
        Character one = factory.createCharacter();
        Character two = factory.createCharacter();
        p.fight(one, two);
    }
}