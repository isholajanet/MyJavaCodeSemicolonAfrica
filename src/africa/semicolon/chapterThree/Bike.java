package africa.semicolon.chapterThree;

public class Bike {
    private int speedInKmPerHour;
    private boolean isOn;
    public Bike(boolean isEngineOn, int OurDefaultSpeedInKmPerHour){
        isOn = isEngineOn;
        speedInKmPerHour = OurDefaultSpeedInKmPerHour;

    }


    public void setSpeedInKmPerHour(int newSpeedInKmPerHour) {
        if(isOn) {
            speedInKmPerHour = newSpeedInKmPerHour;
        }
    }

    public int getSpeedInKmPerHour() {
        return speedInKmPerHour;
    }

    public boolean isOn() {
        return isOn;
    }


    public void setOn(boolean isEngineOn) {
        //this.isOn = isEngineOn;

    }
}
