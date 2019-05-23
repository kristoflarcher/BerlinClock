package com.krisdev.swing;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.krisdev.pattern.Subject;


public class InstanceOfSubjectTest {

    @Test
    public void testSecondInstanceOfSubject() {
        MyTimer myTimer = new  MyTimer();
        assertThat(myTimer, instanceOf(Subject.class));
    }
    

}