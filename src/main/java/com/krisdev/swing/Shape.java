package com.krisdev.swing;

import javax.swing.JPanel;
import java.awt.Color;

import com.krisdev.pattern.Observer;
import com.krisdev.utils.Time;

/**
 * @author larha
 *
 */
public abstract class Shape extends JPanel implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int thickness;
	private int blocNumber;
	private int width;
	private int height;
	private boolean active;
	private Time time;
	private Color color;
	
	/**
	 * @param thickness
	 * @param width
	 * @param height
	 * @param blocNumber
	 */
	public Shape(int thickness, int width, int height, int blocNumber) {
		this.setThickness(thickness);
		this.setBlocNumber(blocNumber);
		this.setHeight(height);
		this.setWidth(width);
		this.setBlocNumber(blocNumber);
		this.setActive(false);
	}
	
	public abstract boolean checkActivation();
	

	/**
	 * @return
	 */
	public boolean isActive() {
		return active;
	}


	/**
	 * @param active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}


	/**
	 * @return
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/**
	 *
	 */
	public int getWidth() {
		return width;
	}


	/**
	 *
	 */
	public int getHeight() {
		return height;
	}


	/**
	 * @param height
	 */
	public void setHeight(int height) {
		this.height=height;
		
	}
    
    /**
     * @param width
     */
    public void setWidth(int width) {
		this.width=width;
		
	}

	/**
	 * @return
	 */
	public int getBlocNumber() {
		return blocNumber;
	}
	
	/**
	 * @param blocNumber
	 */
	public void setBlocNumber(int blocNumber) {
		this.blocNumber = blocNumber;
	}
 
	/**
	 * @return
	 */
	public java.awt.Color getColor() {
		return color;
	}

	public void setColor(java.awt.Color color) {
		this.color = color;
	}


	/**
	 * @return
	 */
	public int getThickness() {
		return thickness;
	}

	/**
	 * @param thickness
	 */
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	public Time getTime() {
		return time;
	}


	/**
	 * @param date
	 */
	public void setTime(Time time) {
		this.time = time;
	}


	/**
	 *
	 */
	public void update(Time date) {
	 this.setTime(date);
	 this.repaint();
	}
}
