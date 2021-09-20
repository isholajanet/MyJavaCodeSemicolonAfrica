package africa.semicolon.chapterEight.Date;

public class MainDate {
    public static void main(String[] args) {
        Date date = new Date(2,1,2000);


        for(int i = 1; i < 31; i++){
            if(!date.validateDay()){
                date.incrementMonth();
            }
            date.setDay(i);
            System.out.println(date);
        }
    }
}
