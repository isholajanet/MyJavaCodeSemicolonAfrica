package africa.semicolon.chapterThree;

public class Bike {
    private int speedInKmPerHour;
    private boolean isOn;
    private int gearInMotion;

    /**
     * public Bike(boolean isEngineOn, int OurDefaultSpeedInKmPerHour){
     * isOn = isEngineOn;
     * speedInKmPerHour = OurDefaultSpeedInKmPerHour;
     * <p>
     * }
     **/


    public void setSpeedInKmPerHour(int newSpeedInKmPerHour) {
        if (isOn) {
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
        this.isOn = isEngineOn;

    }

    public void speedUpBike() {

   }

    public void setGear(int gear) {
        if(isOn && speedInKmPerHour > 0 && speedInKmPerHour <= 60){
            gear = 1;
        }else if (isOn && speedInKmPerHour > 61 && speedInKmPerHour <= 120){
            gear = 2;
        }else if (isOn && speedInKmPerHour > 121 && speedInKmPerHour <= 180){
            gear = 3;
        }else if (isOn && speedInKmPerHour > 181 && speedInKmPerHour <= 240){
            gear = 4;
        }else if (isOn && speedInKmPerHour > 241 && speedInKmPerHour <= 300){
            gear = 5;
        }
        this.gearInMotion = gear;
    }

    public int getGear() {
        return gearInMotion;
    }
}

