package com.krisdev.swing;

import static org.junit.Assert.assertEquals;
import java.awt.Color;
import org.junit.Test;


public class ColorMinuteLowerBlocTest {

    @Test
    public void testMinuteUpperBloc1Color() {
    	int blocNumber = 1;
        MinuteUpper minute = new  MinuteUpper(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.YELLOW);
    }
    
    @Test
    public void testMinuteUpperBloc2Color() {
    	int blocNumber = 2;
        MinuteUpper minute = new  MinuteUpper(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.YELLOW);
    }
    
    @Test
    public void testMinuteUpperBloc3Color() {
    	int blocNumber = 3;
        MinuteUpper minute = new  MinuteUpper(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.RED);
    }
    
    @Test
    public void testMinuteUpperBloc4Color() {
    	int blocNumber = 4;
        MinuteUpper minute = new  MinuteUpper(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.YELLOW);
    }
    
    @Test
    public void testMinuteUpperBloc5Color() {
    	int blocNumber = 5;
        MinuteUpper minute = new  MinuteUpper(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.YELLOW);
    }
    
    @Test
    public void testMinuteUpperBloc6Color() {
    	int blocNumber = 6;
        MinuteUpper minute = new  MinuteUpper(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.RED);
    }
    
    @Test
    public void testMinuteUpperBloc7Color() {
    	int blocNumber = 7;
        MinuteUpper minute = new  MinuteUpper(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.YELLOW);
    }
    
    @Test
    public void testMinuteUpperBloc8Color() {
    	int blocNumber = 8;
        MinuteUpper minute = new  MinuteUpper(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.YELLOW);
    }
    @Test
    public void testMinuteUpperBloc9Color() {
    	int blocNumber = 9;
        MinuteUpper minute = new  MinuteUpper(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.RED);
    }
    
    @Test
    public void testMinuteUpperBloc10Color() {
    	int blocNumber = 10;
        MinuteUpper minute = new  MinuteUpper(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.YELLOW);
    }
    
    @Test
    public void testMinuteUpperBloc11Color() {
    	int blocNumber = 11;
        MinuteUpper minute = new  MinuteUpper(8,100,100,blocNumber);
        assertEquals(minute.getColor(), Color.YELLOW);
    }
    
}