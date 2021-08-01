package africa.semicolon.turtleGraphics;

import static africa.semicolon.turtleGraphics.Direction.*;
import static africa.semicolon.turtleGraphics.PenPosition.DOWN;

public class Turtle {
    private Pen pen;
    private Direction direction;
    private TurtlePosition turtlePosition;

    public Turtle(){
        pen = new Pen();
        direction = EAST;
        turtlePosition = new TurtlePosition();
    }
    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public Pen getPen() {
        return pen;
    }

    public void penDown() {
        pen.setPosition(DOWN);
    }

    public PenPosition getPenPosition() {
        return pen.getPosition();
    }

    public void penUp() {
        pen.setPosition(PenPosition.UP);
    }

    public Direction getDirection() {
        return direction;
    }

    public void turnRight() {
        if(direction == EAST) {
            direction = SOUTH;
        }
        else if(direction == SOUTH) {
            direction = WEST;
        }
        else if (direction == WEST){
            direction = NORTH;
        }else if(direction == NORTH){
            direction = EAST;
        }

    }

    public void turnLeft() {
        if(direction == EAST){
            direction = NORTH;
        }
        else if(direction == NORTH) {
            direction = WEST;
        }
        else if(direction == WEST){
            direction = SOUTH;
        }else if(direction == SOUTH){
            direction = EAST;
        }
    }

    public TurtlePosition getTurtlePosition() {
        return turtlePosition;
    }

    public void move(int numberOfSteps) {
        if(direction == EAST) turtlePosition.increaseColumnPositionBy(numberOfSteps-1);
        if(direction == SOUTH) turtlePosition.increaseRowPositionBy(numberOfSteps);
        if(direction == WEST) turtlePosition.decreaseColumnPositionBy(numberOfSteps);
    }

    public void move(int numberOfSteps, Sketchpad sketchpad) {
        if(pen.getPosition().equals(DOWN)){
            int columnPosition = turtlePosition.getColumnPosition();
            int rowPosition = turtlePosition.getRowPosition();
            switch(direction){
                case EAST -> {
                    for(int i = columnPosition; i < columnPosition+numberOfSteps; i++) {
                        sketchpad.getFloor()[rowPosition][i] = 1;
                    }
                }
            }

        }
        move(numberOfSteps);
    }
}
