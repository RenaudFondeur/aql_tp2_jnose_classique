package fr.univ_lille.aql_tp1.model.move;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import fr.univ_lille.aql_tp1.model.BoardTest;

public class BoardMoveOnAlreadyMarkedCellTest extends BoardTest {

    @Override
    protected void move() {
        super.move();
        board.mark(0, 0);
    }

    @Disabled("this test is disabled because it is not implemented yet")
    @Test
    public void testOMoveOnAlreadyMarkedCellShouldFail() {
        move();
        assertThrows(IllegalStateException.class, () -> move());
    }

    @Disabled("this test is disabled because it is not implemented yet")
    @Test
    public void testXMoveOnAlreadyMarkedCellShouldFail() {
        board.mark(1, 0);
        move();
        assertThrows(IllegalStateException.class, () -> move());
    }

}