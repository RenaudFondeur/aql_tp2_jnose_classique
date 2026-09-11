package fr.univ_lille.aql_tp1.model.win;

import org.junit.jupiter.api.Test;

import fr.univ_lille.aql_tp1.model.BoardTest;
import fr.univ_lille.aql_tp1.model.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;

public class BoardWinningDiagonalMoveTest extends BoardTest {

    @Override
    protected void move() {
        super.move();
        board.mark(2, 2);
    }

    private void winningBoardForX() {
        board.mark(0, 0);
        board.mark(1, 2);
        board.mark(1, 1);
        board.mark(2, 1);
    }

    private void winningBoardForO() {
        board.mark(1, 2);
        board.mark(0, 0);
        board.mark(2, 1);
        board.mark(1, 1);
        board.mark(2, 0);
    }

    @Test
    public void testXWinningDiagonalMoveOk() {
        winningBoardForX();
        move();

        assertEquals(Player.X, board.getCurrentTurn());
        assertEquals(board.getWinner(), Player.X);
    }

    @Test
    public void testOWinningDiagonalMoveOk() {
        winningBoardForO();
        move();

        assertEquals(Player.O, board.getCurrentTurn());
        assertEquals(board.getWinner(), Player.O);
    }

    @AfterEach
    @Override
    protected void endState() {
        assertTrue(board.isInFinishedMode());
        assertEquals(previousPlayer, board.getCurrentTurn());
    }
    
}
