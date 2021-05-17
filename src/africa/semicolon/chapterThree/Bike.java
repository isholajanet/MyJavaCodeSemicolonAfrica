package africa.semicolon.chapterThree;

public class Bike {
    private int speedInKmPerHour;
    private boolean isOn;
    private int gearInMotion;

    /**
     * public Bike(boolean isEngineOn, int OurDefaultSpeedInKmPerHour){
     * isOn = isEngineOn;
     * speedInKmPerHour = OurDefaultSpeedInKmPerHour;
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
        if(isOn){
            gearInMotion = 1;
        }
        else{
            gearInMotion = 0;
        }

    }


    public void setGear(int gear) {
        this.gearInMotion = gear;
    }

    public int getGear() {
        return gearInMotion;
    }

    public void accelerate(){
        int maximumSpeed = 300;
        if(isOn && speedInKmPerHour > 0 && speedInKmPerHour < 60){
            gearInMotion = 1;
        }else if (isOn && speedInKmPerHour >= 60 && speedInKmPerHour < 120){
            gearInMotion = 2;
        }else if (isOn && speedInKmPerHour >= 120 && speedInKmPerHour < 180){
            gearInMotion = 3;
        }else if (isOn && speedInKmPerHour >= 180 && speedInKmPerHour < 240){
            gearInMotion = 4;
        }else if (isOn && speedInKmPerHour >= 240 && speedInKmPerHour < 300){
            gearInMotion = 5;
        } else if (speedInKmPerHour == maximumSpeed){
            gearInMotion = 0;
        }

        speedInKmPerHour = speedInKmPerHour + gearInMotion;
    }
}

