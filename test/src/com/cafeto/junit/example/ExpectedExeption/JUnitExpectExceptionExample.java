package com.cafeto.junit.example.ExpectedExeption;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by jolaya on 2/19/2015.
 */

//You can find this example at http://www.asjava.com/junit/junit-3-vs-junit-4-comparison/
public class JUnitExpectExceptionExample {
    
    //Since JUnit 4 al expectedexcpetion test cases use the following notation
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetElement() {
        (new ArrayList()).get(0);
    }
}
