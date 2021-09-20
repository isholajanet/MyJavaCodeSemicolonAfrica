package africa.semicolon.ArrayPractice.entities;

import africa.semicolon.ArrayPractice.enums.CardinalPoint;
import africa.semicolon.ArrayPractice.enums.PenPosition;
import africa.semicolon.ArrayPractice.exceptions.TurtleException;
import chapterTwo.Car;

public class Turtle {
    private String name;
    private CardinalPoint direction;
    private Pen pen;
    private int xCoordinate;
    private int yCoordinate;
    private PenPosition penPosition;

    public Turtle(){
        pen = new Pen();
        pen.setPenPosition(PenPosition.UP);

    }
    public Turtle(String name){
        this.name = name;
        pen = new Pen();
        pen.setPenPosition(PenPosition.UP);
        direction = CardinalPoint.EAST;

    }
    public Turtle(String name, int xCoordinate, int yCoordinate){
        this(name);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public CardinalPoint getDirection() {
        return direction;
    }

    public void setDirection(CardinalPoint direction) {
        this.direction = direction;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }


    public void changePenPosition(PenPosition penPosition){
        this.getPen().setPenPosition(penPosition);
    }


    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void turnRight(){
        switch (direction){
            case EAST -> setDirection(CardinalPoint.SOUTH);
            case SOUTH -> setDirection(CardinalPoint.WEST);
            case WEST -> setDirection(CardinalPoint.NORTH);
            case NORTH -> setDirection(CardinalPoint.EAST);

        }

    }

    public void turnLeft() {
        switch (direction){
            case EAST -> setDirection(CardinalPoint.NORTH);
            case SOUTH  -> setDirection(CardinalPoint.EAST);
            case WEST -> setDirection(CardinalPoint.SOUTH);
            case NORTH -> setDirection(CardinalPoint.WEST);
        }
    }

    public void moveForward(int numberOfSteps) throws TurtleException {
        if(direction.equals(CardinalPoint.EAST)){
            xCoordinate += (numberOfSteps - 1);
        }else if(direction.equals(CardinalPoint.SOUTH)){
            yCoordinate += (numberOfSteps - 1);
        }else if(direction.equals(CardinalPoint.WEST)){
            xCoordinate -= (numberOfSteps - 1);
        }else if(direction.equals(CardinalPoint.NORTH)){
            yCoordinate -= (numberOfSteps - 1);
        }
    }

    public void moveForward(int numberOfSteps, SketchPad pad) throws TurtleException {
       validateStepsToMove(numberOfSteps, pad);
//       if(pen.getPenPosition().equals(PenPosition.DOWN) && direction.equals(CardinalPoint.EAST)){
//           for(int i = xCoordinate; i < numberOfSteps; i++){
//               pad.getFloor()[yCoordinate][xCoordinate] = 1;
//               xCoordinate++;
//           }
//       }else{
//           moveForward(numberOfSteps);
//       }
        if(direction.equals(CardinalPoint.EAST)){
            if (pen.getPenPosition().equals(PenPosition.DOWN)){
                for(int i = 0; i < numberOfSteps; i++){
               pad.getFloor()[yCoordinate][xCoordinate] = 1;
               xCoordinate++;
           }
                System.out.println(xCoordinate);
            }
            else {
                System.out.println("Moving forward");
                moveForward(numberOfSteps);
            }
        }
        else if(direction.equals(CardinalPoint.WEST)){
          if(pen.getPenPosition().equals(PenPosition.DOWN)){
              for(int i = xCoordinate; i < numberOfSteps; i++){
                  pad.getFloor()[yCoordinate][xCoordinate] = 1;
                  xCoordinate--;
              }
          }else{
              moveForward(numberOfSteps);
          }
        }
        else if(direction.equals(CardinalPoint.SOUTH)){
            if(pen.getPenPosition().equals(PenPosition.DOWN)){
                for (int i = yCoordinate; i < numberOfSteps; i++){
                    pad.getFloor()[yCoordinate][xCoordinate] = 1;
                    yCoordinate++;
                }
            }else{
                moveForward(numberOfSteps);
            }
        }

//       if(pen.getPenPosition().equals(PenPosition.DOWN) && direction.equals(CardinalPoint.WEST)){
//           for(int i = xCoordinate; i < numberOfSteps; i++){
//               pad.getFloor()[yCoordinate][xCoordinate] = 1;
//               xCoordinate--;
//           }
//       }else{
//           moveForward(numberOfSteps);
//       }
       if(pen.getPenPosition().equals(PenPosition.DOWN) && direction.equals(CardinalPoint.SOUTH)){
           for (int i = yCoordinate; i < numberOfSteps; i++){
               pad.getFloor()[yCoordinate][xCoordinate] = 1;
               yCoordinate++;
           }
       }else{
          // moveForward(numberOfSteps);
       }
       if(pen.getPenPosition().equals(PenPosition.DOWN) && direction.equals(CardinalPoint.NORTH)){
           for(int i = yCoordinate; i < numberOfSteps; i++){
               pad.getFloor()[yCoordinate][xCoordinate] = 1;
           }
       }else{
           //moveForward(numberOfSteps);
       }
    }
    private void validateStepsToMove(int numberOfSteps, SketchPad pad) throws TurtleException{
        if(numberOfSteps > pad.getFloor().length-1){
            throw new TurtleException("Number of steps too high");
        }
        int destination = -1;
        if(direction.equals(CardinalPoint.EAST)){
            destination = xCoordinate + numberOfSteps-1;
            if(destination > pad.getFloor().length-1){
                throw new TurtleException("Number of steps too high");
            }
        }
        if(direction.equals(CardinalPoint.SOUTH)){
            destination = yCoordinate + numberOfSteps-1;
            if(destination > pad.getFloor().length){
                throw new TurtleException("Number of steps too high");
            }
        }else if(direction.equals(CardinalPoint.WEST)){
            destination = xCoordinate - numberOfSteps-1;
            if(destination < pad.getFloor().length){
                throw new TurtleException("Number of steps too high");
            }
        }else if(direction.equals(CardinalPoint.NORTH)){
            destination = yCoordinate - numberOfSteps - 1;
            if(destination < 1){
                throw new TurtleException("Number of steps too high");
            }
        }
    }

}
