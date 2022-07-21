package org.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

public class HelloworldTest extends TestCase {
    @InjectMocks
    Helloworld helloworld;

    @Test
    public void test(){
        helloworld = new Helloworld();
       // Mockito.when(helloworld.handler()).thenReturn("Hello world");

        assertEquals("Hello World",helloworld.handler());
    }

}