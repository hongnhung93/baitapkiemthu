import static org.junit.Assert.*;

import org.junit.Test;


public class IsATriangleTest {

	@Test
	public void testNotATriangle() {
		IsATriangle temp = new IsATriangle();
		String rTest = new String(); 
		rTest = temp.isATriangle(0,1,1);
		assertEquals("NotATriangle", rTest);
	}

	@Test
	public void testEquilateral() {
		IsATriangle temp = new IsATriangle();
		String rTest = new String(); 
		rTest = temp.isATriangle(3,3,3);
		assertEquals("Triangle is Equilateral", rTest);
	}

	@Test
	public void testScalene() {
		IsATriangle temp = new IsATriangle();
		String rTest = new String(); 
		rTest = temp.isATriangle(3,4,5);
		assertEquals("Triangle is Scalene", rTest);
	}
	
	@Test
	public void testIsosceles() {
		IsATriangle temp = new IsATriangle();
		String rTest = new String(); 
		rTest = temp.isATriangle(4,4,5);
		assertEquals("Triangle is Isosceles", rTest);
	}
}
