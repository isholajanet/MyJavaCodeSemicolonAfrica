package africa.semicolon.chapterFifteen;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(Paths.get("C:/Semicolon/Java/clients.txt"));
        try (input) {
            System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name",
                    "Last Name", "Balance");

            while (input.hasNext()) {
                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            }
        } catch (NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
