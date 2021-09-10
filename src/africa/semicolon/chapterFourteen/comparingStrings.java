package africa.semicolon.chapterFourteen;

import java.util.Scanner;

public class comparingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstWord = scanner.next();
        System.out.print("Enter the second string: ");
        String secondWord = scanner.next();
        int value = firstWord.compareToIgnoreCase(secondWord);

        if(value== 0){
            System.out.println("Equal");
        }else if(value < 0){
            System.out.println("First word is less than second word.");
        }else {
            System.out.println("First word is greater than second word.");
        }
    }
}
