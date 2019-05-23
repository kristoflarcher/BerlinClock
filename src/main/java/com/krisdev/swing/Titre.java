package com.krisdev.swing;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

/**
 * @author larha
 *
 */
public class Titre extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int thickness;	
	
    public int Number(int a, int b)
    {
      return (a <= b) ? a : b;
    } 

/**
 *
 */
public void paintComponent(Graphics g) {
	//super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    g2.setStroke(new BasicStroke(this.thickness));
    g2.setColor(Color.BLACK);
    int length = Number(this.getWidth(),this.getHeight());
    Font Font1 = new Font("SansSerif", Font.PLAIN, length /5);
    g2.setFont(Font1);
    g2.drawString("Berlin Clock", (int) length/2-100, length/5);


  }
}