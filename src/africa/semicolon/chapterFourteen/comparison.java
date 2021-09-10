package africa.semicolon.chapterFourteen;

import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String firstWord = scanner.next();
        System.out.println("Enter the second word: ");
        String secondWord = scanner.next();

        System.out.println(firstWord.regionMatches(true, 1, secondWord, 1,3));
    }
}
