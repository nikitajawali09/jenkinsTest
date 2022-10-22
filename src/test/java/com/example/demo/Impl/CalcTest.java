package com.example.demo.Impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.beans.factory.annotation.Autowired;

@RunWith(MockitoJUnitRunner.class)
public class CalcTest {
	
	@Mock
	Calculator Calculator;
	
	@Before
	public void setup() {
		
	}

	@Test
	public void addTest() {
		Calculator myCalc = new Calculator();
		
		Mockito.when(Calculator.addNumbers(10, 6)).thenReturn(10, 5);
		Assert.assertNotNull(myCalc);
	}

	
}
