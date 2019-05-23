package com.krisdev.swing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.krisdev.utils.Time;


public class ActivationHourLowerTest {
    
    @Test
    public void testHourLowerBloc1_6h() {
    	Time time = new Time();
    	time.setHour(6);
    	int blocNumber=1;
        HourLower hour = new  HourLower(8,100,100,blocNumber);
        hour.setTime(time);
        assertEquals(hour.checkActivation(), true);
    }
    
    
    @Test
    public void testHourLowerBlock4_21h() {
    	Time time = new Time();
    	time.setHour(5);
    	int blocNumber=4;
        HourLower hour = new  HourLower(8,100,100,blocNumber);
        hour.setTime(time);
        assertEquals(hour.checkActivation(), false);
    }
  
}