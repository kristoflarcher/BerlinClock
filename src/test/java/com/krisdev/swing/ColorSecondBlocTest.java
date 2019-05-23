package com.krisdev.swing;

import static org.junit.Assert.assertEquals;
import java.awt.Color;
import org.junit.Test;


public class ColorSecondBlocTest {

    @Test
    public void secondBlocColor() {
    	int blocNumber = 1;
        Second second = new  Second(8,100,100,blocNumber);
        assertEquals(second.getColor(), Color.BLUE);
    }
    
}