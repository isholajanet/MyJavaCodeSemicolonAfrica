package africa.semicolon.chapterEight.Time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){
        this(0,0,0);
    }
    public Time(int hour){
        this.hour = hour;
    }
    public Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public Time(int hour, int minute, int second) {
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException("Hour should be in between 0-23");
        }
        if(minute < 0 || minute >= 60){
            throw new IllegalArgumentException("Minute should be in between 0 - 59");
        }
        if(second < 0 || second >= 60){
            throw new IllegalArgumentException("Second should be in between 0-59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time(Time time){
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void setHour(int hour) {
        if(hour < 0 || hour >= 24) throw new IllegalArgumentException("Hour must be 0-23");
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute >=60){
            throw new IllegalArgumentException("Minute should be 0 - 59");
        }
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if(second < 0 || second >= 60) throw new IllegalArgumentException("Second should be 0-59");
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    public void incrementHour() {
        if(!(hour > 24) ){
            hour++;
        }
    }

    public void incrementMinute() {
        if(!(minute > 60)){
            minute++;
        }
    }

    public void incrementSecond() {
        if(!(second > 60)){
            second++;
        }
    }

    public void tick() {
        if(second >= 59){
            incrementMinute();
            second = 0;
        }
        if(minute >= 59){
            incrementHour();;
            minute = 0;
        }
        if(minute >= 59 && hour == 23){
            hour++;


        }
    }
}
