package com.company;

import java.util.*;

/**
 * Class implements basic game functionality.
 */
public class Game {

    /**
     * List of players
     */
    private final List<Player> players;

    /**
     * List of dices
     */
    private final List<Dice> dices;

    /**
     * Number of players
     */
    private final Integer numOfPlayers;

    /**
     * Number of Dices
     */
    private final Integer numOfDices;

    /**
     * Round number
     */
    private Integer numOfRound;

    /**
     * Constructs Game class from given parameters:
     *
     * @param numOfPlayers — number of player,
     * @param numOfDices   — number of dices.
     */
    public Game(Integer numOfPlayers, Integer numOfDices) {
        this.numOfPlayers = numOfPlayers;
        this.numOfDices = numOfDices;
        players = new ArrayList<>(numOfPlayers);
        dices = new ArrayList<>(numOfDices);
        numOfRound = 0;
    }

    /**
     * Sets player's names.
     */
    private void setPlayers() {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter your name and names of players");
        for (int i = 0; i < numOfPlayers - 1; i++) {
            name = scanner.nextLine();
            RealPlayer player = new RealPlayer(name);
            players.add(player);
        }
        scanner.close();
        players.add(new RealPlayer("Computer"));
    }

    /**
     * Sets dices.
     */
    private void setDices() {
        for (int i = 0; i < numOfDices; i++) {
            dices.add(new Dice());
        }
    }

    /**
     * Finds winner score.
     *
     * @return winner score.
     */
    private Integer findWinnerScore() {
        Integer winnerPoints = -1;
        for (Player player : players) {
            if (player.getScore() > winnerPoints) {
                winnerPoints = player.getScore();
            }
        }
        return winnerPoints;
    }

    /**
     * Defines winner(s) of a single round.
     *
     * @return list of win(ners).
     */
    private List<Player> defineWinners() {
        List<Player> winners = new ArrayList<>();
        Integer winnerPoints = findWinnerScore();
        for (Player player : players) {
            if (Objects.equals(player.getScore(), winnerPoints)) {
                player.addWin();
                winners.add(player);
            }
        }
        return winners;
    }

    /**
     * Implements rolling dice(s) by every player.
     */
    private void rollDices() {
        for (Player player : players) {
            for (Dice dice : dices) {
                player.addScore(dice.roll());
            }
            System.out.println("Player " + player.getName() +
                    " gets " + player.getScore() + " points");
        }
    }

    /**
     * Implements one round of a game.
     */
    private void playRound() {
        System.out.println();
        ++numOfRound;
        System.out.println("Round number " + numOfRound + " has started");
        for (Player player : players) {
            player.resetScore();
        }
        rollDices();
        System.out.print("Winner(s) of this round: ");
        List<Player> winners = defineWinners();
        for (Player player : winners) {
            System.out.println(player.getName() + ": " + player.getScore() + " points");
        }
        System.out.println("End of round number " + numOfRound);
        System.out.println();
    }

    /**
     * Defines if the game have a winner.
     *
     * @return true if there is a player(s) with 7 wins, false otherwise.
     */
    private boolean stopGame() {
        boolean stopGame = false;
        for (Player player : players) {
            if (player.isWinner()) {
                System.out.println("Absolute Winner: " + player.getName());
                if (!stopGame) {
                    stopGame = true;
                }
            }
        }
        return stopGame;
    }

    /**
     * Starts a game.
     */
    public void startGame() {
        setPlayers();
        setDices();
        while (!stopGame()) {
            playRound();
        }
        System.out.println("Game finished!");
    }

}
