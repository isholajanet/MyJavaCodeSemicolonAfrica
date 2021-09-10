package africa.semicolon.chapterSeven.gameOfCrap;

public class Dice {
    private int face;

    public Dice(int face) {
        this.face = face;
    }
    public Dice(){

    }

    public void setFace(int face) {
        this.face = face;
    }

    public int getFace() {
        return face;
    }
}
