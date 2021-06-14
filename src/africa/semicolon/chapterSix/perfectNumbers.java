package africa.semicolon.chapterSix;

public class perfectNumbers {
    public static void main(String[] args) {
        int totalFactor = 0;
        for (int count = 1; count <= 10; count++){
            for(int number = count; number <= 10; number++){
                if(number % count == 0){
                    int factor = number;
                    totalFactor += factor;
                }
            }

        }
    }
}
