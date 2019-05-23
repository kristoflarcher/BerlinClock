package com.krisdev.swing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.krisdev.utils.Time;


public class ActivationMinuteUpperTest {
    
    @Test
    public void testMinuteUpperBloc3_7m() {
    	Time time = new Time();
    	time.setMinute(7);
    	int blocNumber=3;
        MinuteUpper minute = new  MinuteUpper(8,100,100,blocNumber);
        minute.setTime(time);
        assertEquals(minute.checkActivation(), false);
    }
    
    
    @Test
    public void testMinuteUpperBlock4_21m() {
    	Time time = new Time();
    	time.setMinute(21);
    	int blocNumber=4;
        MinuteUpper minute = new  MinuteUpper(8,100,100,blocNumber);
        minute.setTime(time);
        assertEquals(minute.checkActivation(), true);
    }
    
    @Test
    public void testMinuteUpperBlock1_21m() {
    	Time time = new Time();
    	time.setMinute(21);
    	int blocNumber=1;
        MinuteUpper minute = new  MinuteUpper(8,100,100,blocNumber);
        minute.setTime(time);
        assertEquals(minute.checkActivation(), true);
    }
  
}