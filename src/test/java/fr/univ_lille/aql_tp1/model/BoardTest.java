package fr.univ_lille.aql_tp1.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Disabled;

public abstract class BoardTest {
    
    protected Board board;
    protected Player previousPlayer;

    protected void move() {
        previousPlayer = board.getCurrentTurn();
    }

    @BeforeEach
    protected void setUp() {
        board = new Board();
        assertEquals(Player.X, board.getCurrentTurn());
    }

    @Disabled("this test is disabled because it is not implemented yet")
    @Test
    public void testUnknownPlayerShouldAlwaysFail() {
        board.setCurrentTurn(null);

        // should throw an exception but does not
        assertThrows(IllegalStateException.class, () -> move());
    }

    @AfterEach
    protected void endState() {
        assertTrue(board.isInProgressMode());
        assertNotEquals(previousPlayer, board.getCurrentTurn());
    }
}
