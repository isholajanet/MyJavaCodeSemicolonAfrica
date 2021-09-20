package africa.semicolon.ArrayPractice.entities;

import africa.semicolon.ArrayPractice.enums.PenPosition;

public class Pen {
    private PenPosition penPosition;

    public Pen(){

        penPosition = PenPosition.UP;
    }

    public PenPosition getPenPosition() {
        return penPosition;
    }

    public void setPenPosition(PenPosition penPosition) {
        this.penPosition = penPosition;
    }
}
