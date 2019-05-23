package com.krisdev.swing;

import static org.junit.Assert.assertEquals;
import java.awt.Color;
import org.junit.Test;


public class ColorHourUpperBlocTest {

    @Test
    public void testHourUpperBloc1Color() {
    	int blocNumber = 1;
        HourUpper hour = new  HourUpper(8,100,100,blocNumber);
        assertEquals(hour.getColor(), Color.RED);
    }
    
    @Test
    public void testHourUpperBloc2Color() {
    	int blocNumber = 2;
        HourUpper hour = new  HourUpper(8,100,100,blocNumber);
        assertEquals(hour.getColor(), Color.RED);
    }
    
    @Test
    public void testHourUpperBloc3Color() {
    	int blocNumber = 3;
        HourUpper hour = new  HourUpper(8,100,100,blocNumber);
        assertEquals(hour.getColor(), Color.RED);
    }
    
    @Test
    public void testHourUpperBloc4Color() {
    	int blocNumber = 4;
        HourUpper hour = new  HourUpper(8,100,100,blocNumber);
        assertEquals(hour.getColor(), Color.RED);
    }
}