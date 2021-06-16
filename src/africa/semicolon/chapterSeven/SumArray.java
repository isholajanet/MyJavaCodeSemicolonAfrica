package africa.semicolon.chapterSeven;

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int totalNumber = 0;
        int count = 0;
        while(count < numbers.length){
            totalNumber += numbers[count];
            count++;
        }
        System.out.println("The total is " +totalNumber);
    }
}
