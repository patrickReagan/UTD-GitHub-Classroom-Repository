package myClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalTest {
	
	@Before
	public void setUp()
	{
		//Does nothing
	}
	
	//Test 1 Tests the leap year with February 29th
	@Test
	public void testLeapYear() {
		
		int test = 0;
		test = DaysDurationCalculator.cal(1,1,2,29,2020);
		assertEquals(test, 59);
		
	}
	
	//Test 2 Tests to see what cal() does with a zero month
	@Test
	public void testZeroMonth() {
					
		int test = 0;
		test = DaysDurationCalculator.cal(0,1,2,1,2000);
		assertEquals(test, 31);
		
	}
	
	//Test 3
	@Test
	public void testLeapYearZeroMonth() {
					
		int test = 0;
		test = DaysDurationCalculator.cal(0,1,2,29,2000);
		assertEquals(test, 59);
	}
	
	//Test 4 Just a Normal Test with standard dates and no leap year
	@Test
	public void testNormalNoLeapYear() {
					
		int test = 0;
		test = DaysDurationCalculator.cal(1,1,5,5,1997);
		assertEquals(test, 124);
	}
		
	//Test 5
	@Test
	public void testSameMonth() {
						
		int test = 0;
		test = DaysDurationCalculator.cal(1,1,1,31,1997);
		assertEquals(test, 30);	
	}
		
	//Test 6
	@Test
	public void testSameMonthSameDay() {
					
		int test = 0;
		test = DaysDurationCalculator.cal(1,1,1,1,1997);
		assertEquals(test, 0);
	}	
	
	//Test 7
	@Test
	public void testSameMonthSameDayLeapYear() {
						
		int test = 0;
		test = DaysDurationCalculator.cal(2,29,2,29,2000);
		assertEquals(test, 0);	
	}
	
	
	//Test 8 Test February 29th if it is not a leap year
	@Test
	public void testFebruaryWithOutLeapYear() {
						
		int test = 0;
		test = DaysDurationCalculator.cal(2,1,2,29,2001);
		assertEquals(test, 27);	
		//It should be result in 27 but it results in 28 without the leap year.
	}
	
	//Test 9 If the month is the same but day 1 is larger than day 2
	@Test
	public void testNegativeDay() {
						
		int test = 0;
		test = DaysDurationCalculator.cal(1,10,1,1,2000);
		assertEquals(test, -9);		
	}
	
	//Test 10
	@Test
	public void testValidReturn() {
			
		int test = 0;
		test = DaysDurationCalculator.cal(1,5,7,10,2001);
		assertNotNull(test);
	}
	
	@After
	public void after()
	{
		//Does nothing
	}
}
