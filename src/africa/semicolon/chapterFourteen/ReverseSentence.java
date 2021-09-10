package africa.semicolon.chapterFourteen;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = scanner.nextLine();

        for(int i = sentence.length() - 1; i >= 0; i-- ){
            System.out.print(sentence.charAt(i));
        }

    }
}
