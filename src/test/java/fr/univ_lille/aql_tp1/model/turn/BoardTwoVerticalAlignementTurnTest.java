package fr.univ_lille.aql_tp1.model.turn;

public class BoardTwoVerticalAlignementTurnTest extends BoardTwoAlignementTurnTest {
    
    @Override
    protected void move() {
        super.move();
        board.mark(1, 0);
    }

}
