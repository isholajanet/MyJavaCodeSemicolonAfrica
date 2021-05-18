package africa.semicolon.chapterThree;

public class Television {
    private String productName;
    private boolean isOn;
    private int channel;
    private int volume;
    private int brightness;

    public Television(String productName) {
        this.productName = productName;
    }

    public void setOn(boolean isTvOn) {

        isOn = isTvOn;
    }

    public Boolean isOn() {

        return isOn;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        if (!isOn){
            return 0;
        }
        return channel;
    }

    public int changeChannelIncrement() {
        final int MINIMUM_CHANNEL = 1;
        final int MAXIMUM_CHANNEL = 100;

        if (channel >= MINIMUM_CHANNEL && channel < MAXIMUM_CHANNEL){
            channel = channel + 1;
        }
            return channel;
    }

    public int ReduceChannelNumber() {
        final int MINIMUM_CHANNEL = 1;
        final int MAXIMUM_CHANNEL = 100;

        if (channel > MINIMUM_CHANNEL && channel <= MAXIMUM_CHANNEL){
            channel = channel - 1;
        }
        return channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        if (!isOn){
            return 0;

        }
        return volume;
    }

    public int increaseVolume() {
        final int MINIMUM_VOLUME = 0;
        final int MAXIMUM_VOLUME = 100;
        if (isOn == true)
            if (volume > MINIMUM_VOLUME && volume < MAXIMUM_VOLUME)
                volume = volume + 1;

            return volume;
        }

    public int decreaseVolume() {
        final int MINIMUM_VOLUME = 0;
        final int MAXIMUM_VOLUME = 100;
        if (isOn == true)
            if (volume > MINIMUM_VOLUME && volume <= MAXIMUM_VOLUME)
                volume = volume - 1;

        return volume;

    }

    public void setBrightness(int tvBrightness) {
        brightness = tvBrightness;
    }

    public int getTvBrightness() {
        if (!isOn)
            return 0;
        else
           return brightness;
    }

    public int increaseBrightness() {
        final int MINIMUM_BRIGHTNESS = 0;
        final int MAXIMUM_BRIGHTNESS = 100;
        if (isOn == true)
            if (brightness >= MINIMUM_BRIGHTNESS && brightness < MAXIMUM_BRIGHTNESS)
                brightness = brightness + 1;

        return brightness;



    }

    public int decreaseBrightness() {
        final int MINIMUM_BRIGHTNESS = 0;
        final int MAXIMUM_BRIGHTNESS = 100;
        if (isOn == true)
            if (brightness > MINIMUM_BRIGHTNESS && brightness <= MAXIMUM_BRIGHTNESS)
                brightness = brightness - 1;

        return brightness;

    }
}
