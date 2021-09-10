package africa.semicolon.chapterFourteen;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
    }
}
