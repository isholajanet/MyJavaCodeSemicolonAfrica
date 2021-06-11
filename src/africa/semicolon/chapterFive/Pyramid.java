package africa.semicolon.chapterFive;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter the number of lines: ");
        number = input.nextInt();

        for(int count = 1; count <= number; count++ ){
            for(int spaceCount = number; spaceCount >= count; spaceCount--){
                System.out.printf("%2s", " ");
            }
            for(int numberCount = count; numberCount >= 1; numberCount--){
                System.out.printf("%2d",numberCount);
            }
            for(int numberCount = 2; numberCount <= count; numberCount++){
                System.out.printf("%2d",numberCount);
            }

            System.out.println();
        }
    }
}
