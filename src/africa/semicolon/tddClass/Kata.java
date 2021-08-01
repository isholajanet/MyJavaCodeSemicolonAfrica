package africa.semicolon.tddClass;
import java.util.Scanner;

public class Kata {
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a 3-digit number: ");
        number = input.nextInt();
        if(number/100 == number % 10 ){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");

        }


    }


    public static String displayGrade(int score) {
        String grade = "";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score < 60) {
            grade = "F";
        }
        return grade;
    }


    public static int displayTotalPrice(int numberOfCopies) {
        int sellerPrice;
        int price = 1;
        if (numberOfCopies >= 1 && numberOfCopies <= 4) {
            price = 1500;
        } else if (numberOfCopies >= 5 && numberOfCopies <= 9) {
            price = 1400;
        } else if (numberOfCopies >= 10 && numberOfCopies <= 29) {
            price = 1200;
        } else if (numberOfCopies >= 30 && numberOfCopies <= 49) {
            price = 1100;
        } else if (numberOfCopies >= 50 && numberOfCopies <= 99) {
            price = 1000;
        } else if (numberOfCopies >= 100 && numberOfCopies <= 199) {
            price = 900;
        } else if (numberOfCopies >= 200) {
            price = 800;
        }
        sellerPrice = numberOfCopies * price;
        return sellerPrice;
    }

    private int sellerProfit;

    public static int displayProfit(int numberOfCopies) {
        int sellerProfit;
        int price = 1;
        sellerProfit = 2000;

        if (numberOfCopies >= 1 && numberOfCopies <= 4) {
            price = 1500;
        } else if (numberOfCopies >= 5 && numberOfCopies <= 9) {
            price = 1400;
        } else if (numberOfCopies >= 10 && numberOfCopies <= 29) {
            price = 1200;
        } else if (numberOfCopies >= 30 && numberOfCopies <= 49) {
            price = 1100;
        } else if (numberOfCopies >= 50 && numberOfCopies <= 99) {
            price = 1000;
        } else if (numberOfCopies >= 100 && numberOfCopies <= 199) {
            price = 900;
        } else if (numberOfCopies >= 200) {
            price = 800;
        }
        sellerProfit = (numberOfCopies * sellerProfit) - (numberOfCopies * price);
        return sellerProfit;

    }

    public static int returnFactorCount(int number) {
        int factor = 1;
        int count = 0;
        while (factor <= number) {
            if (number % factor == 0) {

                count++;
            }
            factor++;
        }
        return count;

    }

    public static String getReverse(int number) {
        //number = 12345;

        int firstDigit = number / 10000;
        int firstModulo = number % 10000;
        int secondDigit = firstModulo / 1000;
        int secondModulo = firstModulo % 1000;
        int thirdDigit = secondModulo / 100;
        int thirdModulo = secondModulo % 100;
        int fourthDigit = thirdModulo / 10;
        int fourthModulo = thirdModulo % 10;
        int fifthDigit = fourthModulo;
        return fifthDigit + "" + fourthDigit + "" + thirdDigit + "" + secondDigit + "" + firstDigit;
    }

    public static String getReverseUsingLoop(int number) {
        int remainder;
        int dividend;
        String reverse = "";
        int divisor = 10;
        while (number != 0) {
            remainder = number % divisor;
            dividend = number / divisor;
            reverse = reverse + remainder;
            number = dividend;
        }
        return reverse;
    }



    public static int findFactorialOf(int number) {
        int multiple = 1;
        while (number > 1) {
            multiple = multiple * number;
            number--;
        }
        return multiple;
    }

    public static String findBinaryOf(int number) {
        int dividend;
        int remainder = 0;
        String binary = "";
        while (number != 0) {
            remainder = number % 2;
            dividend = number / 2;
            number = dividend;
            binary = remainder + binary + "";

        }
        return binary;
    }

    public static String ConvertNumberToBase(int number, int base) {
        int dividend;
        int remainder;
        String binary = "";
        while (number != 0) {
            if (base != 0) {
                remainder = number % base;
                dividend = number / base;
                number = dividend;
                binary = remainder + binary + "";

            }
        }
        return binary;


    }

    public static int getMaximumNumber(int[] numbers) {
        int highest = numbers[0];
        int count = 0;
        while(count < numbers.length){
            if(numbers[count] > highest){
                highest = numbers[count];
            }

            count++;
        }
        return highest;
    }

    public static int getMinimumNumber(int[] numbers) {
        int lowest = numbers[0];
        int count = 0;
        while(count < numbers.length){
            if(numbers[count] < lowest){
                lowest = numbers[count];
            }
            count++;
        }

        return lowest;
    }

    public static double getAverage(int[] numbers) {
        double average;
        int count = 0;
        int totalNumber = 0;
        while(count < numbers.length){
            totalNumber+=numbers[count];
            count++;
        }
        average = totalNumber / (count*1.0);
        return average;
    }

    public static int sumOf(int[] numbers){
        int count = 0;
        int totalNumber = 0;
        while(count < numbers.length){
            totalNumber += numbers[count];
            count++;
        }
        return totalNumber;
    }

    public static int maximumOfSum(int[] numbers) {
        int maximumOfSum;

        maximumOfSum = sumOf(numbers) - getMinimumNumber(numbers);
        return maximumOfSum;
    }

    public static int minimumOfSum(int[] numbers) {
        int minimumOfSum;

        minimumOfSum = sumOf(numbers) - getMaximumNumber(numbers);

        return minimumOfSum;
    }

    private static int isMultipleOf(int number){

        int multiple = 0;
        for (int i = 0; i < number; i++) {

        }


        return multiple;
    }
}

