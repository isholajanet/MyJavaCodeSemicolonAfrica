package africa.semicolon.chapterEight;

public enum TrafficLight {
    RED("30sec"),
    GREEN("20sec"),
    YELLOW("30sec");

private String time;
    TrafficLight(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
