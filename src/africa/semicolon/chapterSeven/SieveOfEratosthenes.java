package africa.semicolon.chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static boolean isPrime(int number){
        boolean isPrime = false;
        for(int count = 2; count < number; count++ ){
            isPrime = number % count != 0;
        }
        return isPrime;
    }

    public static void main(String[] args) {

        boolean[] primeNumbers = new boolean[10];

        for(int i = 0; i < primeNumbers.length; i++){

            if(isPrime(i+1)){
                primeNumbers[i-1] = true;
            }else{
                primeNumbers[i] = false;
            }
        }


        System.out.println(Arrays.toString(primeNumbers));



    }
}
