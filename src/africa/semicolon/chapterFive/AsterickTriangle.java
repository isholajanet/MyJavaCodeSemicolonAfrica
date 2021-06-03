package africa.semicolon.chapterFive;

public class AsterickTriangle {
    public static void main(String[] args) {
        for(int count = 1; count <= 10; count++){
            for(int asterickCount = 1; asterickCount<=count; asterickCount++){
                System.out.println("*");
                for(int spaceCount = 10; spaceCount >= count; spaceCount--){
                    System.out.println(" ");

                }
            }



        }
    }
}
