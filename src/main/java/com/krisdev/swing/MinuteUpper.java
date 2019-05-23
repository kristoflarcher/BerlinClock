package com.krisdev.swing;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @author larha
 *
 */
public class MinuteUpper extends Shape {
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(MinuteUpper.class);
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
	public MinuteUpper(int thickness, int width, int height, int blocNumber) {
		super(thickness, width, height, blocNumber);
		// TODO Auto-generated constructor stub
		if ( this.getBlocNumber() % 3 == 0) {
			this.setColor(Color.RED);
		}
		else {
			this.setColor(Color.YELLOW);
		}
	}

	/**
	 *
	 */
	public void paintComponent(Graphics g) {
		//super.paintComponent(g);
		super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D) g;
   
	    if ( checkActivation()   ) {
	    	this.setActive(true);
	    	logger.info("Hour upper bloc number "+this.getBlocNumber()+" is active");
	    }
	    else {
	    	this.setActive(false);
	    }
	    
	    if (isActive()) {	   
	     g2.setColor(this.getColor());
	     g2.fillRoundRect(50, 20, getHeight()-50, getWidth()/12-80,15,15);
	    }
	    else {
	    	g2.setColor(this.getBackground());
	    	g2.fillRoundRect(50, 20, getHeight()-50, getWidth()/12-80,15,15);
	    }
	    
	    g2.setColor(Color.BLACK);
	    g2.setStroke(new BasicStroke(this.thickness));
	    g2.drawRoundRect(50, 20, getHeight()-50, getWidth()/12-80, 15, 15);
	  }
	
	@Override
	public boolean checkActivation() {
		if ( this.getTime().getMinute() / ( 5 * this.getBlocNumber()) >=1   ) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}

}