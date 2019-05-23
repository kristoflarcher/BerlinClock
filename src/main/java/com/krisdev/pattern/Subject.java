package com.krisdev.pattern;

/**
 * @author larha
 *
 */
public interface Subject {
/**
 * @param observer
 */
public void registerObserver(Observer observer);

/**
 * @param observer
 */
public void removeObserver(Observer observer);

/**
 * 
 */
public void notifyObservers();
}