package com.krisdev;

import java.awt.EventQueue;
import javax.swing.JFrame;
import com.krisdev.swing.BerlinClockFrame;


/**
 * @author larha
 *
 */
public class Main {
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable runnable = new Runnable(){
			public void run(){
				
				logger.info("Program starts");
				
				BerlinClockFrame frame = new BerlinClockFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//frame.pack();
				frame.setVisible(true);
			}
		};
		EventQueue.invokeLater(runnable);
		
		logger.info("Program ends");
	}

}