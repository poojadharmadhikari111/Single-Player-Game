package com.example.game.SinglePlayerGame;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    public void testScoreUpdate() {
        Player p = new Player("John");
        p.updateScore(10);
        assertEquals(10, p.getScore());
    }

    @Test
    public void testResetScore() {
        Player p = new Player("John");
        p.updateScore(10);
        p.resetScore();
        assertEquals(0, p.getScore());
    }

    @Test
    public void testApplyBonus() {
        Player p = new Player("John");
        p.applyBonus(5);
        assertEquals(5, p.getScore());
    }
    
    @Test
    public void testPlayerName() {
        Player p = new Player("Alice");
        assertEquals("Alice", p.getName());
    }
    
    @Test
    public void testNegativeScoreUpdate() {
        Player p = new Player("John");
        p.updateScore(-5);
        assertEquals(-5, p.getScore());
    }
}