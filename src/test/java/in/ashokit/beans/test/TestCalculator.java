package in.ashokit.beans.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.ashokit.beans.Calculator;

public class TestCalculator {
	
	@Test
	public void testAdd()
	{
		Calculator cal=new Calculator();
		Integer actualResult = cal.add(10, 20);
		Integer expectedResult=30;
		
		assertEquals(expectedResult, actualResult);
	}

}
