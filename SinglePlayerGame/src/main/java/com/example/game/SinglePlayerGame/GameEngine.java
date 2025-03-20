package com.example.game.SinglePlayerGame;

import java.util.Random;
public class GameEngine {
    private Player player;
    private boolean gameOver;
    private int level;

    public GameEngine(String playerName) {
        this.player = new Player(playerName);
        this.gameOver = false;
        this.level = 1;
    }

    public void startGame() {
        System.out.println("Game Started for " + player.getName());
    }

    public void playTurn() {
        if (!gameOver) {
            int points = new Random().nextInt(10);
            player.updateScore(points);
            System.out.println("Player scored: " + points);
        }
    }

    public void levelUp() {
        level++;
        System.out.println("Level Up! Current Level: " + level);
    }

    public void applyBonusTurn() {
        player.applyBonus(5);
        System.out.println("Bonus Applied! Current Score: " + player.getScore());
    }

    public void endGame() {
        gameOver = true;
        System.out.println("Game Over! Final Score: " + player.getScore());
    }
}