package africa.semicolon.chapterEight.Date;

public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year) {
        if(month < 1 || month > 12){
            throw new IllegalArgumentException("month (" + month + ") must be between 1-12");
        }
        if(day <= 0 || (day > daysPerMonth[month] && (!(month == 2 && day == 29)))){
            throw new IllegalArgumentException("Day (" + day + ") out of range for the specified month and year");
        }
        if(month == 2 && day == 29 && (!(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))){
            throw new IllegalArgumentException("Day (" + day + ") out of range for the specified month and year");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date() {

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
//        if(month < 1 || month > 12){
//            throw new IllegalArgumentException("month (" + month + ") must be between 1-12");
//        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
//        if(day <= 0 || (day > daysPerMonth[month] && (!(month == 2 && day == 29)))){
//            throw new IllegalArgumentException("Day (" + day + ") out of range for the specified month and year");
//        }
//        if(month == 2 && day == 29 && (!(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))){
//            throw new IllegalArgumentException("Day (" + day + ") out of range for the specified month and year");
//        }
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    public void nextDay() {
        day++;
    }
    public boolean validateDay(){

        if(day <= 0 || (day > daysPerMonth[month] && (!(month == 2 && day == 29)))){
           return false;
        }
        if(month == 2 && day == 29 && (!(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))){
            return false;
        }
        return true;
    }

    public void incrementMonth() {
        month++;
    }
}
