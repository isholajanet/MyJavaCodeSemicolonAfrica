package africa.semicolon.chapterFive;

public class DiamondPrinting {
    public static void main(String[] args) {
        for(int count = 1; count <= 9; count++){
            for(int spaceCount = 1; spaceCount <= count; spaceCount++){
                System.out.print(" ");
            }
            for(int asterickCount = 1; asterickCount <= count; asterickCount++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
