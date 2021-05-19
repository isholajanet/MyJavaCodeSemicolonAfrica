package africa.semicolon.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    Television myTv;
    @BeforeEach
    public void thisShouldRunBeforeEachMethod(){

        myTv = new Television("Samsung");
    }
    @Test
    public void testThatTvCanBeSwitchedOn(){
        myTv.setOn(true);
        assertTrue(myTv.isOn());
    }

//    @Test
//    public void testThatTvCanBeSwitchedOff(){
//        myTv.setOn(false);
//        assertFalse(myTv.isOn());
//
//    }

    @Test
    public void testThatChannelNumberCanBeSetWhenTvIsOn(){
        myTv.setOn(true);
        assertTrue(myTv.isOn());
        myTv.setChannel(1);
        assertEquals(1, myTv.getChannel());
    }

    @Test
    public void testThatChannelNumberCannotBeSetWhenTvIsOff(){
        myTv.setOn(false);
        assertFalse(myTv.isOn());
        myTv.setChannel(1);
        assertEquals(0, myTv.getChannel());
    }

    @Test
    public void testThatChannelNumberCanBeChangedManuallyIncrementallyWhenTvIsOn(){
        myTv.setOn(true);
        assertTrue(myTv.isOn());
        myTv.setChannel(99);
        assertEquals(99, myTv.getChannel());
        myTv.changeChannelIncrement();
        assertEquals(100, myTv.getChannel());
    }

    @Test
    public void testThatChannelNumberCanBeManuallyChangedByReducingTheNumberWhenTvIsOn(){
        myTv.setOn(true);
        assertTrue(myTv.isOn());
        myTv.setChannel(100);
        assertEquals(100, myTv.getChannel());
        myTv.ReduceChannelNumber();
        assertEquals(99, myTv.getChannel());
    }

    @Test
    public void testThatVolumeNumberCanBeSetWhenTvIsSwitchedOn(){
        myTv.setOn(true);
        assertTrue(myTv.isOn());
        myTv.setVolume(20);
        assertEquals(20, myTv.getVolume());
    }

    @Test
    public void testThatVolumeNumberCannotBeSetWhenTvIsSwitchedOff(){
        myTv.setOn(false);
        assertFalse(myTv.isOn());
        myTv.setVolume(20);
        assertEquals(0, myTv.getVolume());
    }

    @Test
    public void testThatVolumeNumberCanBeIncreasedWhenTvIsOn(){
        myTv.setOn(true);
        assertTrue(myTv.isOn());
        myTv.setVolume(20);
        myTv.increaseVolume();
        assertEquals(21, myTv.getVolume());
    }

    @Test
    public void testThatVolumeNumberCannotBeIncreasedWhenTvIsOff(){
        myTv.setOn(false);
        assertFalse(myTv.isOn());
        myTv.setVolume(20);
        myTv.increaseVolume();
        assertEquals(0, myTv.getVolume());
    }
    @Test
    public void testThatVolumeNumberCanBeDecreaseWhenTvIsOn(){
        myTv.setOn(true);
        assertTrue(myTv.isOn());
        myTv.setVolume(20);
        myTv.decreaseVolume();
        assertEquals(19, myTv.getVolume());
    }
    @Test
    public void testThatVolumeNumberCanBeDecreaseWhenTvIsOff(){
        myTv.setOn(false);
        assertFalse(myTv.isOn());
        myTv.setVolume(20);
        myTv.decreaseVolume();
        assertEquals(0, myTv.getVolume());
    }

    @Test
    public void testThatTvBrightnessCanBeSetWhenTvIsOn(){
        myTv.setOn(true);
        assertTrue(myTv.isOn());
        myTv.setBrightness(10);
        assertEquals(10, myTv.getTvBrightness());
    }

    @Test
    public void testThatTvBrightnessCanBeSetWhenTvIsOff(){
        myTv.setOn(false);
        assertFalse(myTv.isOn());
        myTv.setBrightness(10);
        assertEquals(0, myTv.getTvBrightness());
    }
    @Test
    public void testThatTvBrightnessCanBeIncreasedWhenTvIsOn(){
        myTv.setOn(true);
        assertTrue(myTv.isOn());
        myTv.setBrightness(100);
        myTv.increaseBrightness();
        assertEquals(100, myTv.getTvBrightness());
    }
    @Test
    public void testThatTvBrightnessCannotBeIncreasedWhenTvIsOff(){
        myTv.setOn(false);
        assertFalse(myTv.isOn());
        myTv.setBrightness(10);
        myTv.increaseBrightness();
        assertEquals(0, myTv.getTvBrightness());
    }

    @Test
    public void testThatTvBrightnessCanBeDecreasedWhenTvIsOn(){
        myTv.setOn(true);
        assertTrue(myTv.isOn());
        myTv.setBrightness(10);
        myTv.decreaseBrightness();
        assertEquals(9, myTv.getTvBrightness());
    }

    @Test
    public void testThatTvBrightnessCannotBeDecreasesWhenTvIsOff(){
        myTv.setOn(false);
        assertFalse(myTv.isOn());
        myTv.setBrightness(10);
        myTv.decreaseBrightness();
        assertEquals(0, myTv.getTvBrightness());
    }
    @Test
    public void testThatTvBrightnessRetainItsPreviousStateWhenItsSwitchedOn(){
        myTv.setOn(true);
        assertTrue(myTv.isOn());
        myTv.setBrightness(30);
        myTv.setOn(false);
        assertFalse(myTv.isOn());
        myTv.setOn(true);
        assertTrue(myTv.isOn());
        assertEquals(30, myTv.getTvBrightness());
    }


}
