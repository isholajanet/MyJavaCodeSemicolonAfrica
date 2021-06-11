package africa.semicolon.chapterFive;

import java.util.Scanner;

public class PyramidUsingPrintf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter the number of lines: ");
        number = input.nextInt();

        for (int count = 1; count <= number; count++){
//            for(int spaceCount = number; spaceCount >= count; spaceCount--){
//                System.out.print(" ");
//            }
            for(int numberCount = count; numberCount >= 1; numberCount--){
                System.out.printf("%4s%d"," ",numberCount);
            }

            System.out.println();
        }
    }
}
