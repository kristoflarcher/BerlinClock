package com.krisdev.swing;

import static org.junit.Assert.assertEquals;
import java.awt.Color;
import org.junit.Test;


public class ColorMinuteUpperBlocTest {

    @Test
    public void testMinuteLowerBloc1Color() {
    	int blocNumber = 1;
        MinuteLower minute = new  MinuteLower(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.YELLOW);
    }
    
    @Test
    public void testMinuteLowerBloc2Color() {
    	int blocNumber = 2;
        MinuteLower minute = new  MinuteLower(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.YELLOW);
    }
    
    @Test
    public void testMinuteLowerBloc3Color() {
    	int blocNumber = 3;
        MinuteLower minute = new  MinuteLower(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.YELLOW);
    }
    
    @Test
    public void testMinuteLowerBloc4Color() {
    	int blocNumber = 4;
        MinuteLower minute = new  MinuteLower(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.YELLOW);
    }
}