package com.krisdev.utils;

import java.util.Calendar;

/**
 * @author larha
 *
 */
public class Time {
	   Calendar rite;
	   private String stringTime;
       private int hour, minute, second;
       private String aHour = "";
       private String bMinute = "";
       private String cSecond = ""; 
       
	/**
	 * 
	 */
	public Time() {
		Calendar rite = Calendar.getInstance();
        this.setHour(hour = rite.get(Calendar.HOUR_OF_DAY));
        this.setMinute(rite.get(Calendar.MINUTE));
        this.setSecond(rite.get(Calendar.SECOND));
        if (hour < 10)
        {
          this.aHour = "0"; 
        } 
      if (hour >= 10)
        {
          this.aHour = "";
        } 
      if (minute < 10)
        {
          this.bMinute = "0";
        } 
      if (minute >= 10)
        {
          this.bMinute = "";
        }
      if (second < 10)
        {
          this.cSecond = "0";
        }
      if (second >= 10)
        {
          this.cSecond = "";
        } 
      setStringTime(aHour + hour + ":" + bMinute+ minute + ":" + cSecond + second);
      
	}

	/**
	 * @return
	 */
	public Calendar getRite() {
		return rite;
	}

	/**
	 * @param rite
	 */
	public void setRite(Calendar rite) {
		this.rite = rite;
	}

	/**
	 * @return
	 */
	public String getStringTime() {
		return stringTime;
	}

	/**
	 * @param stringTime
	 */
	public void setStringTime(String stringTime) {
		this.stringTime = stringTime;
	}

	/**
	 * @return
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * @param hour
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}

	/**
	 * @return
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * @param minute
	 */
	public void setMinute(int minute) {
		this.minute = minute;
	}

	/**
	 * @return
	 */
	public int getSecond() {
		return second;
	}

	/**
	 * @param second
	 */
	public void setSecond(int second) {
		this.second = second;
	}

}
