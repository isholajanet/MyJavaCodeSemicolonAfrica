package africa.semicolon.ArrayPractice.entities;

public class SketchPad {
    private int[][] floor = new int[20][20];

    public int[][] getFloor() {
        return floor;
    }

    public void setFloor(int[][] floor) {
        this.floor = floor;
    }

    public void displayBoard(){
        for (int i = 0; i < floor.length; i++) {
            for (int j = 0; j < floor.length; j++) {
                if (floor[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
