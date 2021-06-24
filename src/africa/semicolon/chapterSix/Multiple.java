package africa.semicolon.chapterSix;

public class Multiple {
    public static String getMultipleOf(int number) {
        int multiple;
        String multipleList = "";

        for(int count = 1; count <= 10;  count++){
            if(count % number == 0){
                multiple = count;
                multipleList += multiple + " ";

            }
        }

        return multipleList;
    }

    public static boolean checkIfItIsAMultiple(int number, int multiple) {

        return multiple % number == 0;


    }
}
