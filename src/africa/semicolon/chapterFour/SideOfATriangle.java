package africa.semicolon.chapterFour;

public class SideOfATriangle {
    private int number;
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        if(number < 0) {
            return 0;
        }else
            return number;
    }

    public int getTheCountOfDigit(int number) {
        int count = 0;
        int remainder;
        int divisor = 10;
        int dividend;
        while(number > 0){
            remainder = number % 10;
            dividend = number / 10;
            count++;
        }
        return count;
    }
}
