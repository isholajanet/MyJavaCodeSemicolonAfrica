package africa.semicolon.chapterSix;

public class PrimeNumbers {
    public static boolean isPrimeNumber(int number) {
       for(int count = 2; count < number; count++){
           if (number % count == 0)
               return false;
           }
                return true;
       }

    public static void main(String[] args) {
        int totalPrimeNumber=0;
            for (int number = 2; number <= 10000; number++) {
                if (isPrimeNumber(number)) {
                    System.out.println(number);
                    totalPrimeNumber++;
                }
            }
        System.out.println("Total prime number is: "+ totalPrimeNumber);
        }
    }

