package africa.semicolon.randomExercises;

public class CreditCardValidation {
    private String number;
    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public int getDigit(String number) {
        int digit;
        digit = number.length();
        return digit;
    }

    public int sumOfDoubleEvenPlace(String number) {
        int oddSum = 0;
        for (int i = number.length() - 1; i >= 0; i-=2) {
            int num = Integer.parseInt(String.valueOf(number.charAt(i)));
            oddSum+= num;
        }
        return oddSum;
    }
    public int sumOfOddPlace(String number) {
        int evenSum = 0;
        for (int i = number.length() - 1; i > 0; i--) {
            if(i % 2 == 1){
                int num = Integer.parseInt(String.valueOf(number.charAt(i)));
                int doubleNumber = num * 2;
                evenSum+=doubleNumber/10;
                evenSum+=doubleNumber%10;
            }
        }
        return evenSum;
    }
    public int sumOfBothEvenAndOddPlace(String number) {
        return sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
    }

    public boolean IsValid(String number) {
        return sumOfBothEvenAndOddPlace(number) % 10 == 0;
    }

    public boolean isItAPrefixOf(String number, int prefixNumber) {
        if(Integer.parseInt(String.valueOf(number.charAt(0))) != prefixNumber) {
            return false;
        }
        return true;
    }

    public String getPrefix(String number, int prefix) {
        String prefixNumber = "";
        int count;
            for(count = 0; count <= prefix-1; count++){
                if(count > number.length()){
                    prefixNumber = number;
                    throw new IllegalArgumentException(number);

                }
                prefixNumber += number.charAt(count);
            }

        return prefixNumber;
    }
}
