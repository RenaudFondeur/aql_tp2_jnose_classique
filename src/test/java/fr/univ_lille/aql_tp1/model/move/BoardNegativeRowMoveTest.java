package fr.univ_lille.aql_tp1.model.move;

public class BoardNegativeRowMoveTest extends BoardInvalidRangeMoveTest {
    
    @Override
    protected void move() {
        super.move();
        board.mark(-1, 0);
    }
}
