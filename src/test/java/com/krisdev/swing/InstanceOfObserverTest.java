package com.krisdev.swing;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.krisdev.pattern.Observer;


public class InstanceOfObserverTest {

    @Test
    public void testSecondInstanceOfObserver() {
        Second second = new  Second(8,100,100,1);
        assertThat(second, instanceOf(Observer.class));
    }
    
    @Test
    public void testHourUpperInstanceOfObserver() {
        HourUpper hourup = new  HourUpper(8,100,100,1);
        assertThat(hourup, instanceOf(Observer.class));
    }
    
    @Test
    public void testHourLowerInstanceOfObserver() {
        HourLower hourlow = new  HourLower(8,100,100,1);
        assertThat(hourlow, instanceOf(Observer.class));
    }
    
    @Test
    public void testMinuteUpperInstanceOfObserver() {
        MinuteUpper minuteup = new  MinuteUpper(8,100,100,1);
        assertThat(minuteup, instanceOf(Observer.class));
    }
    
    @Test
    public void testMinuteLowerInstanceOfObserver() {
        MinuteLower minutelow = new  MinuteLower(8,100,100,1);
        assertThat(minutelow, instanceOf(Observer.class));
    }
    
    @Test
    public void testSimpleDigitalClockInstanceOfObserver() {
    	SimpleDigitalClock digitalClock = new  SimpleDigitalClock(8,100,100,1);
        assertThat(digitalClock, instanceOf(Observer.class));
    }
}