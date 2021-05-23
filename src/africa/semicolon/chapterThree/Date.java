package africa.semicolon.chapterThree;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public Date() { }

    public void setMonth(int month) {
        if (month < 1 || month > 12){
            this.month = 0;
            System.out.println("enter valid month between 1 and 12");
        }else{
            this.month = month;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if(year < 1950 || year > 2050){
            this.year = 0;
        }
        this.year = year;
    }

    public int getYear() {
        return year;
    }




    public String displayDate() {
        return String.format(month +"/" +day +"/" + year ) ;
    }
}
