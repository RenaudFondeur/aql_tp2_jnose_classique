package fr.univ_lille.aql_tp1.model.move;

public class BoardOutOfBoundRowMoveTest extends BoardInvalidRangeMoveTest {

    @Override
    protected void move() {
        super.move();
        board.mark(3, 0);
    }

}
