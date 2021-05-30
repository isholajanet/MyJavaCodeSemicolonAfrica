package africa.semicolon.chapterThree;

public class Date {
    private int day;
    private int month;
    private int year;
    private boolean leapYear;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
     if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
         if (day >= 1 && day <= 31){
             this.day = day;
         }
        }
    if(month == 4 || month == 6 || month == 9 || month == 11){
        if(day >= 1 && day <= 30){
            this.day = day;
        }
    }
    if(leapYear && month == 2){
        if(day >=1 && day <= 29){
            this.day = day;
        }
    }
    }

    public void setMonth(int month) {
        if( month >= 1 && month <= 12){
            this.month = month;
        }

    }

    public void setYear(int year) {
        if(year > 1950 && year < 2050){
            this.year = year;
        }

    }

    public String displayDate() {
        return day + "/" + month + "/" + year;
    }
    public boolean checkLeapYear(){
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            leapYear = true;
            System.out.println("This year is a leap year");
        } else {
            leapYear = false;
            System.out.println("This year is not a leap year");
        }
        return leapYear;
    }
}
