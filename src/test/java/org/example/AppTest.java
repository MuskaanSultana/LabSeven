package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    extends TestCase
{
    public void testFizzBuzz3(){
        String value = App.FizzBuzz(3);
        assertEquals("Fizz", value);
    }
    public void testFizzBuzz5(){
        String value = App.FizzBuzz(5);
        assertEquals("Buzz", value);
    }
    public void testFizzBuzz15(){
        String value= App.FizzBuzz(15);
        assertEquals("FizzBuzz",value);
    }
    public void testFizzBuzz11(){
        String value=App.FizzBuzz(11);
        assertEquals("11",value);
    }
}
