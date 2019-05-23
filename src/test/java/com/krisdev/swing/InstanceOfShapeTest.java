package com.krisdev.swing;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class InstanceOfShapeTest {

    @Test
    public void testSecondInstanceOfShape() {
        Second second = new  Second(8,100,100,1);
        assertThat(second, instanceOf(Shape.class));
    }
    
    @Test
    public void testHourUpperInstanceOfShape() {
        HourUpper hourup = new  HourUpper(8,100,100,1);
        assertThat(hourup, instanceOf(Shape.class));
    }
    
    @Test
    public void testHourLowerInstanceOfShape() {
        HourLower hourlow = new  HourLower(8,100,100,1);
        assertThat(hourlow, instanceOf(Shape.class));
    }
    
    @Test
    public void testMinuteUpperInstanceOfShape() {
        MinuteUpper minuteup = new  MinuteUpper(8,100,100,1);
        assertThat(minuteup, instanceOf(Shape.class));
    }
    
    @Test
    public void testMinuteLowerInstanceOfShape() {
        MinuteLower minutelow = new  MinuteLower(8,100,100,1);
        assertThat(minutelow, instanceOf(Shape.class));
    }
    
    @Test
    public void testSimpleDigitalClockInstanceOfShape() {
    	SimpleDigitalClock digitalClock = new  SimpleDigitalClock(8,100,100,1);
        assertThat(digitalClock, instanceOf(Shape.class));
    }
}