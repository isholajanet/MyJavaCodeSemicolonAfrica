package africa.semicolon.chapterFifteen;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.Files.*;

public class File {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file or directory name:");
        Path path = Paths.get(input.nextLine());

        System.out.println(path.getFileName() + " exists");

        if(isDirectory(path)) {
            System.out.println("It is a directory");
        }else{
            System.out.println("It is not a directory");
        }
        if(path.isAbsolute()) {
            System.out.println("It is an absolute path");
        }else{
            System.out.println("It is not an absolute path");
        }

        System.out.println("Last modified: " + getLastModifiedTime(path));
        System.out.println("Size: " + size(path));
        System.out.println("Path: " + path.toString());
        System.out.println("Absolute path: " + path.toAbsolutePath());
    }
}
