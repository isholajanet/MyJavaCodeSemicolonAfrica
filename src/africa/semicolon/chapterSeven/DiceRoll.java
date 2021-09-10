package africa.semicolon.chapterSeven;
public class DiceRoll {
    private Dice firstRoll;
    private Dice secondRoll;
    private int[] diceFaceFrequency = new int[13];

    public void setFirstRoll(Dice firstRoll) {
        this.firstRoll = firstRoll;
    }

    public void setSecondRoll(Dice secondRoll) {
        this.secondRoll = secondRoll;
    }

    public Dice getFirstRoll() {
        return firstRoll;
    }

    public Dice getSecondRoll() {
        return secondRoll;
    }

    public void setFrequency() {

        ++diceFaceFrequency[firstRoll.getFace() + secondRoll.getFace()];
    }

    public int[] getDiceFaceFrequency() {
        return diceFaceFrequency;
    }
}
