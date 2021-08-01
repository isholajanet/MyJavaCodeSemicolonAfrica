package africa.semicolon.randomExercises;

public class SequenceAndSeries {

    public int getTheSeriesOf(int firstNumber, int secondNumber, int thirdNumber) {
        int commonDifference = secondNumber - firstNumber;
        int nextNumber = thirdNumber + commonDifference;

        return nextNumber;
    }
}
