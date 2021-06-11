package africa.semicolon.chapterFour;

public class asterick {
    public static void main(String[] args) {
        int count = 1;
        int asterickCount = 1;
        while( count <= 20){
            while( asterickCount <= count){
                System.out.print("*");
                asterickCount++;
            }
            count++;
            System.out.println();
        }
    }
}
