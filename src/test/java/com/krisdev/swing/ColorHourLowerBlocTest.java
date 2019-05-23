package com.krisdev.swing;

import static org.junit.Assert.assertEquals;
import java.awt.Color;
import org.junit.Test;


public class ColorHourLowerBlocTest {

    @Test
    public void testHourLowerBloc1Color() {
    	int blocNumber = 1;
        HourLower hour = new  HourLower(8,100,100,blocNumber);
        assertEquals(hour.getColor(), Color.RED);
    }
    
    @Test
    public void testHourLowerBloc2Color() {
    	int blocNumber = 2;
        HourLower hour = new  HourLower(8,100,100,blocNumber);
        assertEquals(hour.getColor(), Color.RED);
    }
    
    @Test
    public void testHourLowerBloc3Color() {
    	int blocNumber = 3;
        HourLower hour = new  HourLower(8,100,100,blocNumber);
        assertEquals(hour.getColor(), Color.RED);
    }
    
    @Test
    public void testHourLowerBloc4Color() {
    	int blocNumber = 4;
        HourLower hour = new  HourLower(8,100,100,blocNumber);
        assertEquals(hour.getColor(), Color.RED);
    }
}