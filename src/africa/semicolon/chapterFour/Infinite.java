package africa.semicolon.chapterFour;

public class Infinite {
    private int number;
    public void setInteger(int number) {
        this.number = number;
    }

    public int getInteger() {
        return number;
    }

    public String getMultiples(int number) {
        String multiple = "";
        int count = 0;
        while(count < 15){
            multiple = multiple + number + " ";
            number += 2;
            count++;
        }

        return multiple;
    }

}
