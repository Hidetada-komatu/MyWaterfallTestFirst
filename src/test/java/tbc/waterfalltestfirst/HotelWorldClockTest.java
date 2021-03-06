package tbc.waterfalltestfirst;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelWorldClockTest{
    @Test
    public void the_time_of_clock_london_should_be_1_after_the_phone_clock_is_set_to_9_beijing_clock(){
//        Arrange
        CityClock londonClock = new CityClock(0);
        PhoneClock phoneClock = new PhoneClock(8);
//        Act
        phoneClock.setCityClock(londonClock);
        phoneClock.setTime(9);
//        Assert
        assertEquals(1,londonClock.getTime());
    }
}