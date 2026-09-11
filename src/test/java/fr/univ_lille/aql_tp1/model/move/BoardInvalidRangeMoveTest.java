package fr.univ_lille.aql_tp1.model.move;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import fr.univ_lille.aql_tp1.model.BoardTest;

public abstract class BoardInvalidRangeMoveTest extends BoardTest {

    @Disabled("this test is disabled because it is not implemented yet")
    @Test 
    public void testInvalidMoveOnXShouldFail() {
        assertThrows(IllegalArgumentException.class, () -> move());
    }
    
    @Disabled("this test is disabled because it is not implemented yet")
    @Test
    public void testInvalidMoveOnOShouldFail() {
        board.mark(0, 1);
        assertThrows(IllegalArgumentException.class, () -> move());
    }
    
}
