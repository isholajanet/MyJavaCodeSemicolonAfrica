package africa.semicolon.chapterFive;

public class TrianglePrinting {
    public static void main(String[] args) {
        for(int count = 1; count <= 10; count++){
            for(int asterickCount = 1; asterickCount <= count; asterickCount++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for(int count = 1; count <= 10; count++){
            for(int asterickCount = 10; asterickCount >= count; asterickCount--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for(int count = 1; count <= 10; count++){
            for(int spaceCount = 0; spaceCount < count; spaceCount++){
                System.out.print(" ");
            }
            for (int asterickCount = 10; asterickCount >= count; asterickCount--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int count = 1; count <= 10; count++){
            for(int spaceCount = 10; spaceCount >= count; spaceCount-- ){
                System.out.print(" ");
            }
            for(int asterickCount = 1; asterickCount <= count; asterickCount++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
