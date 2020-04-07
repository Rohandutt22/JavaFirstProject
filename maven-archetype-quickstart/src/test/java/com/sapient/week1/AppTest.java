package com.sapient.week1;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void shouldAnswerWithTrue1()
    {
        CheckEven e;
e= new CheckEven();
        assertEquals(e.check(2), true );
    }
    @Test
    public void shouldAnswerWithTrue2()
    {
        CheckEven e;
e= new CheckEven();
        assertEquals(e.check(4), true );
    }
    @Test
    public void shouldAnswerWithFalse()
    {
        CheckEven e;
     
e= new CheckEven();   assertEquals(e.check(3), false );
    }
    @Test
    public void shouldAnswerWithFalse2()
    {
        CheckEven e;
     
e= new CheckEven();   assertEquals(e.check(1), false );
    }
}
