package com.company;

/**
 * Interface implements player functionality.
 */
public interface Player {

    /**
     * Gets player's name.
     * @return player's name.
     */
    String getName();

    /**
     * Gets amount of player's wins.
     * @return amount of player's wins.
     */
    Integer getWins();

    /**
     * Defines whether player is absolute winner or not.
     * @return true if player is absolute winner, false otherwise.
     */
    boolean isWinner();

    /**
     * Registers win for a player.
     */
    void addWin();

    /**
     * Adds points for player from one rolling of a dice.
     * @param score — points from ine rolling of a dice.
     */
    void addScore(Integer score);

    /**
     * Sets to zero score of a player.
     */
    void resetScore();

    /**
     * Gets a score of a player.
     * @return — score of a player.
     */
    Integer getScore();

}