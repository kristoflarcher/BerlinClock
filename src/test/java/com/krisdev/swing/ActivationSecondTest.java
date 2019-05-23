package com.krisdev.swing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.krisdev.utils.Time;


public class ActivationSecondTest {
    
    @Test
    public void testSecond_2s() {
    	Time time = new Time();
    	time.setSecond(2);
    	int blocNumber=1;
        Second second = new  Second(8,100,100,blocNumber);
        second.setTime(time);
        assertEquals(second.checkActivation(), true);
    }
    
    
    @Test
    public void testSecond_3s() {
    	Time time = new Time();
    	time.setSecond(3);
    	int blocNumber=1;
        Second second = new  Second(8,100,100,blocNumber);
        second.setTime(time);
        assertEquals(second.checkActivation(), false);
    }
  
}