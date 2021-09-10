package africa.semicolon.chapterSeven.gameOfCrap;

public class DiceRoll {
    private Dice firstRoll;
    private Dice secondRoll;
    private Result result;

    public DiceRoll(Dice firstRoll, Dice secondRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
    }

    public DiceRoll() {
    }

    public void setFirstRoll(Dice firstRoll) {
        this.firstRoll = firstRoll;
    }

    public Dice getFirstRoll() {
        return firstRoll;
    }

    public void setSecondRoll(Dice secondRoll) {
        this.secondRoll = secondRoll;
    }

    public Dice getSecondRoll() {
        return secondRoll;
    }


    public int sumOfDiceRoll() {
       return getFirstRoll().getFace() + getSecondRoll().getFace();

    }

    public void checkResult() {
        if(sumOfDiceRoll() == 7 || sumOfDiceRoll() == 11){
            result = Result.WIN;
        }
        if(sumOfDiceRoll() == 2 || sumOfDiceRoll() == 3 || sumOfDiceRoll() == 12){
            result = Result.LOSE;
        }
        if(sumOfDiceRoll() == 4 || sumOfDiceRoll() == 5 || sumOfDiceRoll() == 6 || sumOfDiceRoll() == 8 || sumOfDiceRoll() == 9 || sumOfDiceRoll() == 10) {
            result = Result.CONTINUE;
            getOtherResult();
        }

    }

    public Result getResult() {
        return result;
    }
    private void getOtherResult(){
        if(result == Result.CONTINUE && isScoreTheSame()){
            result = Result.WIN;
        }else{
            result = Result.LOSE;
        }
    }


    public int sumOfOtherDiceRoll() {
        return firstRoll.getFace() + secondRoll.getFace();
    }

    public boolean isScoreTheSame() {
        return sumOfDiceRoll() == sumOfOtherDiceRoll();
    }

}
