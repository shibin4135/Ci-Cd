package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
   public void shouldAddNumber(){
        int a=20;
        int b=20;
        Calculator calculator=new Calculator();
        assertEquals(40,calculator.add(a,b));
    }

    @Test
    public void shouldMultiplyNumber(){
        int a=50;
        int b=2;
        Calculator calculator=new Calculator();
        assertEquals(100,calculator.multiply(a,b));
    }

}
