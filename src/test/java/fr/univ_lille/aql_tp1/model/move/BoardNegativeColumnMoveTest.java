package fr.univ_lille.aql_tp1.model.move;

public class BoardNegativeColumnMoveTest extends BoardInvalidRangeMoveTest {
    
    @Override
    protected void move() {
        super.move();
        board.mark(0, -1);
    }
}
