package com.krisdev.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.krisdev.pattern.Observer;
import com.krisdev.pattern.Subject;
import com.krisdev.utils.Time;

/**
 * @author larha
 *
 */
public class MyTimer extends JPanel implements Subject, ActionListener{
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(MyTimer.class);
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
private Timer time;
private int delay = 1000;
private ArrayList<Observer> observers = new ArrayList<Observer>();

/**
 * 
 */
public MyTimer() {
	startTimer();
}

/**
 * 
 */
public void startTimer() {
    time = new Timer(delay, this);
    time.setInitialDelay(0);
    time.start();
}


/**
 *
 */
public void notifyObservers() {
    for (Observer ob : observers) { 
    	//logger.info("Notify "+ob.getClass());
        ob.update(new Time());
    }
}

/**
 *
 */
public void registerObserver(Observer observer) {
	logger.info("Add new observer: "+observer.getClass());
	observers.add(observer);
	
}

/**
 *
 */
public void removeObserver(Observer observer) {
	  logger.info("Remove observer: "+observer.getClass());
	  observers.remove(observer);
	
}

/**
 *
 */
public void actionPerformed(ActionEvent e) {
	notifyObservers();
}

}