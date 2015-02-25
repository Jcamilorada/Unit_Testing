package com.cafeto.junit.example;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

/**
 * Created by jolaya on 2/25/2015.
 */
public class TestMockingVoidExample {
    MockingVoidExample mockMockingVoidExample = mock(MockingVoidExample.class);

    /**
     * When do throw is called over the void method randomMethod a NullPointerException is created thus when the method *
     * is called an expected NullPointerException is caught.* 
     *  * 
     */
    
    @Test(expected = NullPointerException.class)
    public void testDoThrow(){
        doThrow(new NullPointerException()).when(mockMockingVoidExample).randomMethod();
        mockMockingVoidExample.randomMethod();
    }

    /**
     * When the void method sendMessage is called the real execution of the method is done, in this case a Message is sent *
     * to the system. Thus the test is true.* 
     */
    
    @Test
    public void testDoCallRealMethod(){
        doCallRealMethod().when(mockMockingVoidExample).sendMessage();
        mockMockingVoidExample.sendMessage();
        assertTrue(true);
    }

    /**
     * When the void method randomMethod is called a NullPointerException is called but before that we want to call it and do nothing *
     * so doNothing is called on the first call of the method and the on the second call it throws a NullPointerException.  * 
     */
    
    @Test(expected = NullPointerException.class)
    public void testDoNothing(){
        doNothing().doThrow(new NullPointerException()).when(mockMockingVoidExample).randomMethod();
        System.out.println("First call to randomMethod");
        mockMockingVoidExample.randomMethod();
        
        System.out.println("Second call to randomMethod returns NullPointerException");
        mockMockingVoidExample.randomMethod();
        
    }

    /**
     * The test consist in proving the functionality of doAnswer. The test provides to set the state internally as "not *
     * ready". * 
     */
    
    @Test
    public void testDoAnswer(){
        int something;
        
        doNothing().doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) {
                Object[] args = invocation.getArguments();
                return (String) args[0];
            }
        }).when(mockMockingVoidExample).setState(anyString());
        
        mockMockingVoidExample.setState("Ready");
        mockMockingVoidExample.setState("Not Ready!");
        
        assertTrue(true);
    }

    /**
     * This test show why/when to use doReturn. In some cases theReturn while not be able to pass by given that a exception *
     * could be triggered by a seemingly trivial execution. This example can be found at: *
     * http://docs.mockito.googlecode.com/hg-history/29f82983afa1a30adc7b4efa7977ffb45f67f7cc/org/mockito/Mockito.html#doReturn%28java.lang.Object%29 *
     */
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDoReturnErrorCase(){
        List list = new LinkedList();
        List spy = spy(list);

        //Impossible: real method is called so spy.get(0) throws IndexOutOfBoundsException (the list is yet empty)
        when(spy.get(0)).thenReturn("foo");
        
    }

    /**
     * This test shows the rare cases when it is necessary to use soReturn instead of when(Object). *
     * This example can be found at: *
     * http://docs.mockito.googlecode.com/hg-history/29f82983afa1a30adc7b4efa7977ffb45f67f7cc/org/mockito/Mockito.html#doReturn%28java.lang.Object%29 *
     */
    
    @Test
    public void testDoReturn(){
        List list = new LinkedList();
        List spy = spy(list);
        
        //You have to use doReturn() for stubbing:
        doReturn("foo").when(spy).get(0);
        
    }

}
