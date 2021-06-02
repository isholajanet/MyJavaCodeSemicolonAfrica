package africa.semicolon.chapterFour;

public class Validate {
    private int studentNumber;
    private int result;
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setResult(int result) {
            this.result = result;
    }

    public int getResult(){
             return result;
    }

    public String getStudentResult(int result) {
        String resultDisplay = "";
        if(result == 1){
            resultDisplay = "Passed";
        }
        if(result == 2){
            resultDisplay = "Failed";
        }
        return resultDisplay;
    }

    public int getTheNumbersOfStudentThatPassed(int ...score) {
        int count = 0;
        int studentThatPassed = 0;
        while(count < score.length ){
            if (score[count] > 60) {
                studentThatPassed++;
            }
            count++;
        }
        return studentThatPassed;
    }

    public int getTheNumbersOfStudentThatFailed(int ...score) {
        int count = 0;
        int studentThatFailed = 0;
        while(count < score.length){
            if(score[count] < 60){
                studentThatFailed++;
            }
            count++;
        }
        return studentThatFailed;
    }

    public void checkThatLoopContinuesTillAValidInputIsEntered() {
        while(result == 1 && result == 2){
            this.result = result;
        }
    }
}
