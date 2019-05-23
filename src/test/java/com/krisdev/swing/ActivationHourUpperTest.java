package com.krisdev.swing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.krisdev.utils.Time;


public class ActivationHourUpperTest {
    
    @Test
    public void testHourUpperBloc1_1h() {
    	Time time = new Time();
    	time.setHour(1);
    	int blocNumber=1;
        HourUpper hour = new  HourUpper(8,100,100,blocNumber);
        hour.setTime(time);
        assertEquals(hour.checkActivation(), false);
    }
    
    
    @Test
    public void testHourUpperBlock1_5h() {
    	Time time = new Time();
    	time.setHour(5);
    	int blocNumber=1;
        HourUpper hour = new  HourUpper(8,100,100,blocNumber);
        hour.setTime(time);
        assertEquals(hour.checkActivation(), true);
    }
  
}