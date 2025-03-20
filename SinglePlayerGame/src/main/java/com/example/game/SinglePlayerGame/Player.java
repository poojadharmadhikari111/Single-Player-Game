package com.example.game.SinglePlayerGame;

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void updateScore(int points) {
        this.score += points;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void resetScore() {
        this.score = 0;
    }

    public void applyBonus(int bonus) {
        this.score += bonus;
    }
}