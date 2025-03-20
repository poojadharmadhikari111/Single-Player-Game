package com.example.game.SinglePlayerGame;

public class Main {
    public static void main(String[] args) {
        GameEngine game = new GameEngine("John");
        game.startGame();
        game.playTurn();
        game.levelUp();
        game.applyBonusTurn();
        game.endGame();
    }
}
