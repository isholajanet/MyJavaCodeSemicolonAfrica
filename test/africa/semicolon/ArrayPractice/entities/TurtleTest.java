package africa.semicolon.ArrayPractice.entities;

import africa.semicolon.ArrayPractice.enums.CardinalPoint;
import africa.semicolon.ArrayPractice.enums.PenPosition;
import africa.semicolon.ArrayPractice.exceptions.TurtleException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    private Turtle turtle;
    private SketchPad board;

    @BeforeEach
    void setUp() {
        turtle = new Turtle("turtle");
        board = new SketchPad();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void changePenPositionFromUpToDown(){
        assertEquals(PenPosition.UP, turtle.getPen().getPenPosition());
        turtle.changePenPosition(PenPosition.DOWN);
        assertEquals(PenPosition.DOWN, turtle.getPen().getPenPosition());
    }

    @Test
    void changePenPositionFromDownToUp(){
        assertEquals(PenPosition.UP, turtle.getPen().getPenPosition());
        turtle.changePenPosition(PenPosition.DOWN);
        assertEquals(PenPosition.DOWN, turtle.getPen().getPenPosition());
        turtle.changePenPosition(PenPosition.UP);
        assertEquals(PenPosition.UP, turtle.getPen().getPenPosition());
    }

    @Test
    void turnRightFromEast(){
        assertEquals(CardinalPoint.EAST, turtle.getDirection());
        turtle.turnRight();
        assertEquals(CardinalPoint.SOUTH, turtle.getDirection());
    }
    @Test
    void turnRightFromSouth(){
        assertEquals(CardinalPoint.EAST, turtle.getDirection());
        turtle.turnRight();
        assertEquals(CardinalPoint.SOUTH, turtle.getDirection());
        turtle.turnRight();
        assertEquals(CardinalPoint.WEST, turtle.getDirection());
    }
    @Test
    void turnRightFromWest(){
        assertEquals(CardinalPoint.EAST, turtle.getDirection());
        turtle.turnRight();
        assertEquals(CardinalPoint.SOUTH, turtle.getDirection());
        turtle.turnRight();
        assertEquals(CardinalPoint.WEST, turtle.getDirection());
        turtle.turnRight();
        assertEquals(CardinalPoint.NORTH, turtle.getDirection());
    }
    @Test
    void turnRightFromNorth(){
        assertEquals(CardinalPoint.EAST, turtle.getDirection());
        turtle.turnRight();
        assertEquals(CardinalPoint.SOUTH, turtle.getDirection());
        turtle.turnRight();
        assertEquals(CardinalPoint.WEST, turtle.getDirection());
        turtle.turnRight();
        assertEquals(CardinalPoint.NORTH, turtle.getDirection());
        turtle.turnRight();
        assertEquals(CardinalPoint.EAST, turtle.getDirection());
    }
    @Test
    void turnLeftFromEast(){
        assertEquals(CardinalPoint.EAST, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(CardinalPoint.NORTH, turtle.getDirection());
    }
    @Test
    void turnLeftFromNorth(){
        assertEquals(CardinalPoint.EAST, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(CardinalPoint.NORTH, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(CardinalPoint.WEST, turtle.getDirection());
    }
    @Test
    void turnLeftFromWest(){
        assertEquals(CardinalPoint.EAST, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(CardinalPoint.NORTH, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(CardinalPoint.WEST, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(CardinalPoint.SOUTH, turtle.getDirection());
    }
    @Test
    void turnLeftFromSouth(){
        assertEquals(CardinalPoint.EAST, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(CardinalPoint.NORTH, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(CardinalPoint.WEST, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(CardinalPoint.SOUTH, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(CardinalPoint.EAST, turtle.getDirection());
    }

    @Test
    void moveForwardFromEast(){
        assertEquals(0, turtle.getxCoordinate());
        assertEquals(0, turtle.getyCoordinate());

        try {
            turtle.moveForward(12);
        } catch (TurtleException e) {
            e.printStackTrace();
        }

        assertEquals(11, turtle.getxCoordinate());
        assertEquals(0, turtle.getyCoordinate());
    }

    @Test
    void moveForwardFromEastToSouth(){
        turtle.setDirection(CardinalPoint.SOUTH);
        assertEquals(0, turtle.getxCoordinate());
        assertEquals(0, turtle.getyCoordinate());

        try {
            turtle.moveForward(12);
        } catch (TurtleException e) {
            e.printStackTrace();
        }

        assertEquals(0, turtle.getxCoordinate());
        assertEquals(11, turtle.getyCoordinate());

    }

    @Test
    void moveForwardFromWest(){
        turtle.setDirection(CardinalPoint.WEST);


        turtle.setxCoordinate(11);
        assertEquals(0, turtle.getyCoordinate());

        try {
            turtle.moveForward(12);
        } catch (TurtleException e) {
            e.printStackTrace();
        }
        assertEquals(0, turtle.getxCoordinate());
        assertEquals(0, turtle.getyCoordinate());

    }

    @Test
    void moveForwardFromNorth(){
        turtle.setDirection(CardinalPoint.NORTH);

        turtle.setyCoordinate(11);
        assertEquals(0, turtle.getxCoordinate());

        try {
            turtle.moveForward(12);
        } catch (TurtleException e) {
            e.printStackTrace();
        }

        assertEquals(0, turtle.getxCoordinate());
        assertEquals(0, turtle.getyCoordinate());
    }


    @Test
    void moveForwardFromEastWithExcessSteps(){
        turtle.setxCoordinate(10);
        assertEquals(0, turtle.getyCoordinate());

        assertEquals(0, turtle.getyCoordinate());
        assertThrows(TurtleException.class, ()-> turtle.moveForward(12, board));

        assertEquals(10, turtle.getxCoordinate());
        assertEquals(0, turtle.getyCoordinate());
    }
    @Test
    void moveForwardFromSouthWithExcessSteps(){
        turtle.setDirection(CardinalPoint.SOUTH);
        turtle.setyCoordinate(10);
        assertEquals(0, turtle.getxCoordinate());

        assertEquals(0, turtle.getxCoordinate());
        assertThrows(TurtleException.class, ()-> turtle.moveForward(12, board));

        assertEquals(0, turtle.getxCoordinate());
        assertEquals(10, turtle.getyCoordinate());
    }
    @Test
    void moveForwardFromWestWithExcessSteps(){
        turtle.setDirection(CardinalPoint.WEST);
        turtle.setxCoordinate(10);
        assertEquals(0, turtle.getyCoordinate());

        assertEquals(0, turtle.getyCoordinate());
        assertThrows(TurtleException.class, ()-> turtle.moveForward(12, board));

        assertEquals(10, turtle.getxCoordinate());
        assertEquals(0, turtle.getyCoordinate());
    }
    @Test
    void moveForwardFromNorthWithExcessSteps(){
        turtle.setDirection(CardinalPoint.NORTH);
        turtle.setyCoordinate(10);
        assertEquals(0, turtle.getxCoordinate());

        assertEquals(0, turtle.getxCoordinate());
        assertThrows(TurtleException.class, ()-> turtle.moveForward(12, board));

        assertEquals(0, turtle.getxCoordinate());
        assertEquals(10, turtle.getyCoordinate());
    }
    @Test
    void printSquare() throws TurtleException {

        turtle.changePenPosition(PenPosition.DOWN);
        turtle.setDirection(CardinalPoint.EAST);
        System.out.println(turtle.getxCoordinate());
        turtle.moveForward(12,board);
        System.out.println(turtle.getxCoordinate());

        turtle.turnRight();
        turtle.moveForward(6, board);
        //board.displayBoard();
        turtle.turnLeft();
        turtle.moveForward(2,board);
        board.displayBoard();



    }


}