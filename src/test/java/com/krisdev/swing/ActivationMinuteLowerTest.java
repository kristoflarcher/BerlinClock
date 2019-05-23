package com.krisdev.swing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.krisdev.utils.Time;


public class ActivationMinuteLowerTest {
    
    @Test
    public void testMinuteLowerBloc3_7m() {
    	Time time = new Time();
    	time.setMinute(7);
    	int blocNumber=3;
        MinuteLower minute = new  MinuteLower(8,100,100,blocNumber);
        minute.setTime(time);
        assertEquals(minute.checkActivation(), false);
    }
    
    
    @Test
    public void testMinuteLowerBlock4_21m() {
    	Time time = new Time();
    	time.setMinute(21);
    	int blocNumber=4;
        MinuteLower minute = new  MinuteLower(8,100,100,blocNumber);
        minute.setTime(time);
        assertEquals(minute.checkActivation(), false);
    }
    
    @Test
    public void testMinuteLowerBlock1_21m() {
    	Time time = new Time();
    	time.setMinute(21);
    	int blocNumber=1;
        MinuteLower minute = new  MinuteLower(8,100,100,blocNumber);
        minute.setTime(time);
        assertEquals(minute.checkActivation(), true);
    }
  
}