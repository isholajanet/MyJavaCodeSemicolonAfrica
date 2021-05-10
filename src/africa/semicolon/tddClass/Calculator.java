package africa.semicolon.tddClass;

public class Calculator {
    public int add(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;

        return sum;
    }

    public int multiply(int firstNumber, int secondNumber) {
        int product = firstNumber * secondNumber;

        return product;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int difference = firstNumber - secondNumber;
        return difference;
    }

    public int divide(int firstNumber, int secondNumber) {
        if (firstNumber == 0){
            int result = firstNumber / secondNumber;
            result = 0;
            return result;
        }else{
            int result = firstNumber / secondNumber;
            return result;
        }
    }
}
