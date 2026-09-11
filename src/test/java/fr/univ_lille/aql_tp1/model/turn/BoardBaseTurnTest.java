package fr.univ_lille.aql_tp1.model.turn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import fr.univ_lille.aql_tp1.model.BoardTest;
import fr.univ_lille.aql_tp1.model.Player;

public class BoardBaseTurnTest extends BoardTest {
    
    @Override
    protected void move() {
        super.move();
        board.mark(0, 1);
    }

    @BeforeEach
    @Override
    protected void setUp() {
        super.setUp();
        board.mark(0, 0);
        board.mark(1, 2);
        board.mark(2, 1);
    }
    
    @Test
    public void testBaseTurnOk() {
        move();

        assertEquals(Player.X, board.getCurrentTurn());
    }

    @Disabled("this test is disabled because it is not implemented yet")
    @Test
    public void testBaseTurnWrongPlayer() {
        board.setCurrentTurn(Player.X);

        // player X cannot play on even turn, should throw an exception but does not
        assertThrows(IllegalStateException.class, () -> move());
    }
}
