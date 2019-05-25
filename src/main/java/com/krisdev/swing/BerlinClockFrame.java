package com.krisdev.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

	
	/**
	 * @author larha
	 *
	 */
	public class BerlinClockFrame extends JFrame {
  	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(BerlinClockFrame.class);
	private static final long serialVersionUID = 1L;	
	
	private JPanel title;
	private ArrayList<Shape> TimeUIComponents;
	private int thickness;
	private Shape dc;	

		/**
		 * 
		 */
		public BerlinClockFrame() { 
			this.setTitle("Berlin Clock");
			Container container = this.getContentPane();
			GridLayout layout =  new GridLayout(3,1);
			container.setLayout(layout);
			
			 int width = 1600;
		     int height = 900;
			 setSize(width, height);
		     setResizable(false);
		     
		     TimeUIComponents = new ArrayList<Shape>();
		     thickness=8;
		     
		     //Timer
		     MyTimer myTimer = new MyTimer();
		    
		    //Titre
		    JPanel titre = new JPanel(new BorderLayout());
		    titre.setPreferredSize(new Dimension(width, height/10));
		    title= new Titre();
			titre.add(title, BorderLayout.WEST);
		    
			//Seconds
		    JPanel seconds = new JPanel(new BorderLayout());
		    seconds.setPreferredSize(new Dimension(width, height/4));
		    Shape shapes = new Second(thickness,width,height/4,1);
		    TimeUIComponents.add(shapes);
			seconds.add(shapes, BorderLayout.CENTER);
			
			//Hours
			JPanel hours = new JPanel(new GridLayout(2,4));			
			//hours.setPreferredSize(new Dimension(width, height/4));
			//hours.setPreferredSize(new Dimension(width, height/3));
			
			for (int blocNumber=1; blocNumber<=4; blocNumber++ )
			{
				 Shape shapehu = new HourUpper(thickness,width,height/8,blocNumber);
				 TimeUIComponents.add(shapehu) ;
				 hours.add(shapehu);
			}	
			for (int blocNumber=1; blocNumber<=4; blocNumber++ )
			{
				 Shape shapehl = new HourLower(thickness,width,height/8,blocNumber);
				 TimeUIComponents.add(shapehl) ;
				 hours.add(shapehl);
			}
			
				
			//Minutes
			JPanel minutes = new JPanel(new GridLayout(3,1));
			//minutes.setPreferredSize(new Dimension(width, height/3));
			
			//MinutesUpper
			JPanel minutesUpper = new JPanel(new GridLayout(1,11));
			minutesUpper.setPreferredSize(new Dimension(width, height/8));
			
			for (int blocNumber=1; blocNumber<=11; blocNumber++ )
			{
				 Shape shapemu = new MinuteUpper(thickness,width,height/8,blocNumber);
				 TimeUIComponents.add(shapemu) ;
				 minutesUpper.add(shapemu);
			}

			//MinutesLower
			JPanel minutesLower = new JPanel(new GridLayout(1,4));
			minutesLower.setPreferredSize(new Dimension(width, height/8));
			for (int blocNumber=1; blocNumber<=4; blocNumber++ )
			{
				 Shape shapeml = new MinuteLower(thickness,width,height/8,blocNumber);
				 TimeUIComponents.add(shapeml) ;
				 minutesLower.add(shapeml);
			}		
			
			//DigitalClock
			JPanel digitalClock = new JPanel(new GridLayout(1,1));
			dc = new SimpleDigitalClock(thickness,width,height/8,1);
			TimeUIComponents.add(dc);
			digitalClock.add(dc);
		    
			minutes.add(minutesUpper);
			minutes.add(minutesLower);
			minutes.add(digitalClock);
			
		    container.add(seconds);
		    container.add(hours);
		    container.add(minutes);		
		    
		    Iterator<Shape> iter = TimeUIComponents.iterator(); 
		    while (iter.hasNext()) { 
		    	myTimer.registerObserver(iter.next()); 
	        }
			
		  }
	
}
