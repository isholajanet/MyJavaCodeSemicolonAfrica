package africa.semicolon.chapterFour;

public class Cryptography {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getNumberCount(int number) {
        int count = 1;
        int remainder;
        int dividend;
        while(count >= 1){
            remainder = number % 10;
            dividend = number / 10;
            number = dividend;
            count++;
        }
        return count;
    }
}
