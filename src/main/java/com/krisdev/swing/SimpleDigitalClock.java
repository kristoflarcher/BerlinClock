package com.krisdev.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 * @author larha
 *
 */
public class SimpleDigitalClock extends Shape 
     { 
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(SimpleDigitalClock.class);
	private static final long serialVersionUID = 1L;
       
       /**
     * @param a
     * @param b
     * @return
     */
    public int Number(int a, int b)
         {
           return (a <= b) ? a : b;
         } 
       
       
   	/**
   	 * @param thickness
   	 * @param width
   	 * @param height
   	 * @param blocNumber
   	 */
   	public SimpleDigitalClock(int thickness, int width, int height, int blocNumber) {
   		super(thickness, width, height, blocNumber);
   		// TODO Auto-generated constructor stub
   	}
      /**
     *
     */
    @Override 
      public void paintComponent(Graphics g)
        {
          super.paintComponent(g);
          
          g.setColor(Color.BLACK);
          int length = Number(this.getWidth(),this.getHeight());
          Font Font1 = new Font("SansSerif", Font.PLAIN, length / 2);
          g.setFont(Font1);
          g.drawString(this.getTime().getStringTime(), (int) this.getWidth()/2-120, length-50);
        } 
    
    
	@Override
	public boolean checkActivation() {
       return true;
      }
     }
  
