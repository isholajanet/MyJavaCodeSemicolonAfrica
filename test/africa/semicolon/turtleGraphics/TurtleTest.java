package africa.semicolon.turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static africa.semicolon.turtleGraphics.PenPosition.UP;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    Turtle turtle;
    Pen pen;
    @BeforeEach
    void setUp(){
        turtle = new Turtle();
        pen = new Pen();
    }

    @Test
    void turtleCanBeConstructedTest(){
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }
    @Test
    void turtleCanChangePenTest(){
        Turtle turtle = new Turtle();
        Pen pen = new Pen();
        turtle.setPen(pen);
        assertSame(pen, turtle.getPen());
    }
    @Test
    void turtleHasPenOnCreationTest(){
        assertNotNull(turtle.getPen());
    }
    @Test
    void penHasPositionTest(){
        assertNotNull(pen.getPosition());
    }
    @Test
    void penDefaultPositionIsUpTest() {
        assertSame(UP, pen.getPosition());
    }
    @Test
    void turtleCanTurnPenDown(){
        assertSame(UP, turtle.getPenPosition());
        turtle.penDown();
        //turtle.getPen().setPosition(Position.DOWN);
        //assertSame(Position.DOWN, turtle.getPen().getPosition());
        assertSame(PenPosition.DOWN, turtle.getPenPosition());
    }
    @Test
    void turtleCanTurnPenUp(){
        turtle.penDown();
        assertSame(PenPosition.DOWN, turtle.getPenPosition());

        turtle.penUp();
        assertSame(UP, turtle.getPenPosition());
    }
    @Test
    void turtleCanTurnRightWhenFacingEast(){
        assertSame(Direction.EAST, turtle.getDirection());
        //Direction is on East, to turn right you set direction to the South
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.getDirection());
    }
    @Test
    void turtleCanTurnRightWhenFacingSouth(){
        assertSame(Direction.EAST, turtle.getDirection());
        //Direction is on East, to turn right you set direction to the South
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.getDirection());

        turtle.turnRight();
        assertSame(Direction.WEST, turtle.getDirection());
    }
    @Test
    void turtleCanTurnRightWhenFacingWest(){
        assertSame(Direction.EAST, turtle.getDirection());
        //Direction is on East, to turn right you set direction to the South
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.getDirection());

        turtle.turnRight();
        assertSame(Direction.WEST, turtle.getDirection());

        turtle.turnRight();
        assertSame(Direction.NORTH, turtle.getDirection());
    }
    @Test
    void turtleCanTurnRightWhenFacingNorth(){
        assertSame(Direction.EAST, turtle.getDirection());
        //Direction is on East, to turn right you set direction to the South
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.getDirection());

        turtle.turnRight();
        assertSame(Direction.WEST, turtle.getDirection());

        turtle.turnRight();
        assertSame(Direction.NORTH, turtle.getDirection());

        turtle.turnRight();
        assertSame(Direction.EAST, turtle.getDirection());
    }
    @Test
    void turtleCanTurnLeftWhileFacingEast(){
        assertSame(Direction.EAST, turtle.getDirection());
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getDirection());
    }

    //to do North, West and South;
    @Test
    void turtleCanTurnLeftWhileFacingNorth(){
        assertSame(Direction.EAST, turtle.getDirection());
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getDirection());
        turtle.turnLeft();
        assertSame(Direction.WEST, turtle.getDirection());
    }
    @Test
    void turtleCanTurnLeftWhileFacingWest(){
        assertSame(Direction.EAST, turtle.getDirection());
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getDirection());
        turtle.turnLeft();
        assertSame(Direction.WEST, turtle.getDirection());
        turtle.turnLeft();
        assertSame(Direction.SOUTH, turtle.getDirection());
    }
    @Test
    void turtleCanTurnLeftWhileFacingSouth(){
        assertSame(Direction.EAST, turtle.getDirection());
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getDirection());
        turtle.turnLeft();
        assertSame(Direction.WEST, turtle.getDirection());
        turtle.turnLeft();
        assertSame(Direction.SOUTH, turtle.getDirection());
        turtle.turnLeft();
        assertSame(Direction.EAST, turtle.getDirection());
    }
    @Test
    void turtleCanMoveForwardWhileFacingEastTest(){
        TurtlePosition position = turtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());

        turtle.move(5);

        TurtlePosition turtleposition = turtle.getTurtlePosition();
        assertEquals(5, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
    }
    @Test
    void turtleCanMoveForwardWhileFacingSouthTest() {
        TurtlePosition position = turtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
        turtle.turnRight();

        turtle.move(5);

        TurtlePosition turtleposition = turtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(5, position.getRowPosition());
    }
    @Test
    void turtleCanMoveForwardWhileFacingWestTest() {
        turtle.move(5);
        turtle.turnLeft();
        turtle.turnLeft();
        TurtlePosition position = turtle.getTurtlePosition();
        assertEquals(5, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
        assertSame(Direction.WEST, turtle.getDirection());

        turtle.move(5);

        TurtlePosition turtleposition = turtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
    }
    @Test
    void turtleCanMoveForwardWhileFacingNorthTest() {
        turtle.move(5);
        turtle.turnLeft();
        TurtlePosition position = turtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
        assertSame(Direction.NORTH, turtle.getDirection());

        turtle.move(5);

        TurtlePosition turtleposition = turtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
    }

    @Test
    public void turtleCanWriteEastWardsWhenPenIsDown(){
        Sketchpad sketchpad = new Sketchpad(20,20);
        turtle.penDown();
        //when
        turtle.move(5, sketchpad);

        //assert
        assertEquals(1, sketchpad.getFloor()[0][0]);
        assertEquals(1, sketchpad.getFloor()[0][1]);
        assertEquals(1, sketchpad.getFloor()[0][2]);
        assertEquals(1, sketchpad.getFloor()[0][3]);
        assertEquals(1, sketchpad.getFloor()[0][4]);
        assertEquals(0, sketchpad.getFloor()[0][5]);

        TurtlePosition turtlePosition = turtle.getTurtlePosition();
        assertEquals(4, turtlePosition.getColumnPosition());
        assertEquals(0, turtlePosition.getRowPosition());

    }


}
