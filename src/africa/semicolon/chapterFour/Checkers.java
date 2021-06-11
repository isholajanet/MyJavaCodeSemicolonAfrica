package africa.semicolon.chapterFour;

public class Checkers {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 10) {
            if (count %2 == 0){
                System.out.print(" ");
            }
            int asteriskCount = 1;
            while (asteriskCount <= 10) {
                System.out.print("* ");
                asteriskCount++;
            }

            count ++;
            System.out.println();
        }
    }
}
