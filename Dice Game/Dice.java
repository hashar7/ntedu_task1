package com.company;

import java.util.Random;

/**
 * Class that implements the functionality of a dice.
 */
public class Dice {

    private final Random random;

    /**
     * Default Dice constructor that initializes random number generator.
     */
    public Dice() {
        random = new Random();
    }

    /**
     * Method implements rolling a dice.
     * @return random Integer value from 1 to 6 inclusive.
     */
    public Integer roll() {
        return 1 + random.nextInt(5);
    }

}
