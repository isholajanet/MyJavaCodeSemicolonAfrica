package africa.semicolon.chapterFive;

public class Triangle {
    public static void main(String[] args) {
        for(int count = 1; count<=10; count++){
            for(int asterickCount = 1; asterickCount <= count; asterickCount++){
                System.out.print("*");
            }
            for(int spaceCount = 10; spaceCount >= count; spaceCount--){
                System.out.print(" ");
            }
            for(int spaceCount = 10; spaceCount >= count; spaceCount--){
                System.out.print(" ");
            }

            for(int asterickCount = 1; asterickCount <= count; asterickCount++){
                System.out.print("*");
            }

          for(int spaceCount = 1; spaceCount <= count; spaceCount++){
                System.out.print(" ");
          }

            for(int asterickCount = 10; asterickCount >= count; asterickCount--){
                System.out.print("*");
            }

            for(int spaceCount = 10; spaceCount >= count; spaceCount--){
                System.out.print(" ");
            }
            for(int spaceCount = 10; spaceCount <= count; spaceCount++){
                System.out.print(" ");
            }

            for(int asterickCount = 1; asterickCount <= count; asterickCount++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
