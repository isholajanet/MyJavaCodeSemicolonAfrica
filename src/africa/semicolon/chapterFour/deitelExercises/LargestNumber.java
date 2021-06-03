package africa.semicolon.chapterFour.deitelExercises;


public class LargestNumber {
    private int number;
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
   public int getTheLargestNumberBetweenTenNumbers(int... numbers){

        int count = 0;
        int largest =0;

       while (count < numbers.length) {
           if(numbers[count]> largest){
               largest = numbers[count];
           }
           count++;
       }
       return largest;
//
//        while (count < numbers.length){
//            if (number > largest){
//                largest = number;
//            }
//            count++;
//        }
        //System.out.println("The largest number is " +largest);
//        return largest;
    }
}
