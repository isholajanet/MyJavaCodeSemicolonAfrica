package africa.semicolon.chapterEight.Time;

public class MainTime {
    public static void main(String[] args) {


        try{
            Time t1 = new Time(27,54,68);
        }catch(IllegalArgumentException e){
            System.out.println("Error message: " + e.getMessage());
        }


    }
}
