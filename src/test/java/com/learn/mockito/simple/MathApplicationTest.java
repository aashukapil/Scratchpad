package com.learn.mockito.simple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by aashu on 27/11/16.
 * Using my mac in Singapore Bedok Court.
 */

//@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    @InjectMocks
    private MathApplication mathApplication;
    @Mock
    private CalculatorService calcService;

    @Before
    public void setUp() {
//        mathApplication = new com.learn.mockito.simple.MathApplication();
//        calcService = mock(com.learn.mockito.simple.CalculatorService.class);
//        mathApplication.setCalculatorService(calcService);
    }

    @Test
    public void testAddAndSubtract() {

        //add the behavior to add numbers
        when(calcService.add(20.0, 10.0)).thenReturn(30.0);

        //subtract the behavior to subtract numbers
        when(calcService.subtract(20.0, 10.0)).thenReturn(10.0);

        //test the subtract functionality
        Assert.assertEquals(mathApplication.subtract(20.0, 10.0), 10.0, 0);

        //test the add functionality
        Assert.assertEquals(mathApplication.add(20.0, 10.0), 30.0, 0);

        //verify call to calcService is made or not
        verify(calcService).add(20.0, 10.0);
        verify(calcService).subtract(20.0, 10.0);
    }
}
