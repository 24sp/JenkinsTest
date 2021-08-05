package in.ashokit.beans.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import in.ashokit.beans.Calculator;

public class TestCalculator {
	
	private static Calculator cal=null;

	@BeforeClass
	public static void init() {
		cal=new Calculator();
	}
	
	@AfterClass
	public static void destroy()
	{
		cal=null;
	}
	
	@Test
	public void testAdd()
	{
		Integer actualResult = cal.add(10, 20);
		Integer expectedResult=30;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testMultiply()
	{
		Integer actualResult = cal.multiply(10, 20);
		Integer expectedResult=200;
		
		assertEquals(expectedResult, actualResult);
	}

}
