package fr.univ_lille.aql_tp1.model.turn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import fr.univ_lille.aql_tp1.model.BoardTest;
import fr.univ_lille.aql_tp1.model.Player;

public class BoardFirstTurnTest extends BoardTest {

   
    @Override
    protected void move() {
        super.move();
        board.mark(0, 0);
    }

    @Test
    public void testfirstTurnOk() {
        move();

        assertEquals(Player.O, board.getCurrentTurn());
        
    }

    @Disabled("this test is disabled because it is not implemented yet")
    @Test
    public void testFirstTurnWrongPlayer() {
        board.setCurrentTurn(Player.O);

        // player O cannot play on odd turn, should throw an exception but does not
        assertThrows(IllegalStateException.class, () -> move());
    }
}
