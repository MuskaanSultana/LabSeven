package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
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
}
