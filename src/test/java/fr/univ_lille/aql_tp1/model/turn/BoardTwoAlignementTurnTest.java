package fr.univ_lille.aql_tp1.model.turn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.univ_lille.aql_tp1.model.BoardTest;
import fr.univ_lille.aql_tp1.model.Player;

public abstract class BoardTwoAlignementTurnTest extends BoardTest {
    
    protected void alignementForX() {
        super.setUp();
        board.mark(0, 0);
        board.mark(1, 2);
    }

    protected void alignementForO() {
        super.setUp();
        board.mark(1, 2);
        board.mark(0, 0);
        board.mark(2, 1);
    }

    @Test
    public void testXWinningDiagonalMoveOk() {
        alignementForX();
        move();

        assertEquals(Player.O, board.getCurrentTurn());
    }

    @Test
    public void testOWinningDiagonalMoveOk() {
        alignementForO();
        move();

        assertEquals(Player.X, board.getCurrentTurn());
    }
}
