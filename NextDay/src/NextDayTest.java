import static org.junit.Assert.*;

import org.junit.Test;


public class NextDayTest {

	@Test
	public void testFebruary() {
		NextDay date = new NextDay();
		String rTest = date.nextday(28, 2, 2014);
		assertEquals("1 - 3 - 2014", rTest);
		
		rTest = date.nextday(29, 2, 2000);
		assertEquals("1 - 3 - 2000", rTest);
		
		rTest = date.nextday(30, 2, 2000);
		assertEquals("Not available", rTest);
		
		rTest = date.nextday(27, 2, 2000);
		assertEquals("28 - 2 - 2000", rTest);
	}

	@Test
	public void testDecember() {
		NextDay date = new NextDay();
		String rTest = date.nextday(31, 12, 2014);
		assertEquals("1 - 1 - 2015", rTest);
		
		rTest = date.nextday(29, 12, 2014);
		assertEquals("30 - 12 - 2014", rTest);
		
		rTest = date.nextday(32, 12, 2014);
		assertEquals("Not available", rTest);
	}
	
	@Test
	public void testAnotherMonth() {
		NextDay date = new NextDay();
		String rTest = date.nextday(31, 1, 2014);
		assertEquals("1 - 2 - 2014", rTest);
		
		rTest = date.nextday(31, 4, 2014);
		assertEquals("Not available", rTest);
		
		rTest = date.nextday(30, 4, 2014);
		assertEquals("1 - 5 - 2014", rTest);
	}
	@Test
	public void testErrorInput() {
		NextDay date = new NextDay();
		String rTest = date.nextday(-31, 1, 2014);
		assertEquals("Not available", rTest);
		
		rTest = date.nextday(30, 13, 2014);
		assertEquals("Not available", rTest);
		
		rTest = date.nextday(30, 4, -2014);
		assertEquals("Not available", rTest);
	}
}
