package com.krisdev.swing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * @author larha
 *
 */
public class Second extends Shape  {
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Second.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param thickness
	 * @param width
	 * @param height
	 * @param blocNumber
	 */
	public Second(int thickness, int width, int height, int blocNumber) {
		super(thickness, width, height, blocNumber);
		// TODO Auto-generated constructor stub
		this.setColor(Color.BLUE);
	}

	
    public int Number(int a, int b)
    {
      return (a <= b) ? a : b;
    } 

  /**
 *
 */
public void paintComponent(Graphics g) {
	//super.paintComponent(g);
	super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;


    g2.setStroke(new BasicStroke(this.thickness));
    int width= getWidth()/2;
    int height= getHeight()/2;
    int radius = getWidth()/16;
    
    if ( checkActivation()   ) {
    	this.setActive(true);
    	logger.info("Second bloc is active");
    }
    else {
    	this.setActive(false);
    }
    
    if (isActive()) {
    g2.setColor(this.getColor());
    g2.fill( new Ellipse2D.Double(width-radius, height-radius, radius*2, radius*2) );
    }
    else {
    	g2.setColor(this.getBackground());
        g2.fill( new Ellipse2D.Double(width-radius, height-radius, radius*2, radius*2) );
    }
    
    g2.setColor(Color.BLACK);
    g2.draw( new Ellipse2D.Double(width-radius, height-radius, radius*2, radius*2) );

     //Draw DigitalClock
	 g2.setColor(Color.BLACK); 
	 int length = Number(this.getWidth(),this.getHeight()); Font Font1 = new Font("SansSerif",
	 Font.PLAIN, length /5); g2.setFont(Font1); g2.drawString("Berlin Clock", (int) length/2-100, length/5);
		 

  }

@Override
public boolean checkActivation() {
	 if ( this.getTime().getSecond() %2  == 0   ) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
}
}