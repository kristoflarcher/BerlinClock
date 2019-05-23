package com.krisdev.pattern;

import com.krisdev.utils.Time;

/**
 * @author larha
 *
 */
public interface Observer {
 /**
 * @param date
 */
public void update(Time date);
}