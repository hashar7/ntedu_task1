package com.company;

/**
 * Class implements real player functionality.
 */
public class RealPlayer implements Player {

    /**
     * Number of wins to become the absolute winner.
     */
    private static final int NUM_OF_WINS = 7;

    /**
     * Player's name.
     */
    private final String name;

    /**
     * Number of player's wins.
     */
    private Integer wins;

    /**
     * Player's score.
     */
    private Integer score;

    /**
     * Creates a player with given name.
     *
     * @param name — player's name.
     */
    public RealPlayer(String name) {
        this.name = name;
        wins = 0;
        score = 0;
    }

    /**
     * Gets player's name.
     *
     * @return player's name.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets amount of player's wins.
     *
     * @return amount of player's wins.
     */
    @Override
    public Integer getWins() {
        return wins;
    }

    /**
     * Defines whether player is absolute winner or not.
     *
     * @return true if player is absolute winner, false otherwise.
     */
    @Override
    public boolean isWinner() {
        return wins >= NUM_OF_WINS;
    }

    /**
     * Registers win for a player.
     */
    @Override
    public void addWin() {
        wins++;
    }

    /**
     * Adds points for player from one rolling of a dice.
     *
     * @param score — points from ine rolling of a dice.
     */
    @Override
    public void addScore(Integer score) {
        this.score += score;
    }

    /**
     * Sets to zero score of a player.
     */
    @Override
    public void resetScore() {
        score = 0;
    }

    /**
     * Gets a score of a player.
     *
     * @return — score of a player.
     */
    @Override
    public Integer getScore() {
        return score;
    }

}
