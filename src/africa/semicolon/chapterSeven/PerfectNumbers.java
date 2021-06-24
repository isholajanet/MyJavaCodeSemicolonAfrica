package africa.semicolon.chapterSeven;

public class PerfectNumbers {
    public static String getFactorsOf(int number) {
        String factor = "";
        for(int count = 2; count < number; count++){
            if(number % count == 0){
                factor = factor + count + " ";
            }
        }
        return factor;
    }

    public static int addFactorsOf(int number) {
        int totalFactor = 0;
        for(int count = 1; count < number; count++){
            if(number % count == 0){
                totalFactor += count;
            }
        }
        return totalFactor;
    }

    public static boolean checkIfItsAPerfectNumber(int number) {
        if(addFactorsOf(number) == number){
            return true;
        }else{
            return false;
        }
    }

    public static String perfectNumbersBetween1And1000() {
        String perfectNumbers = "";
        for(int number = 1; number <= 1000; number++){
                if(checkIfItsAPerfectNumber(number)){
                    perfectNumbers += number +" ";

                }
            }
        return perfectNumbers;
        }

    }
