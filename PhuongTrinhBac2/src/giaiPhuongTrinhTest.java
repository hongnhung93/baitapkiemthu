
import static org.junit.Assert.*;

import org.junit.Test;


public class giaiPhuongTrinhTest {
	giaiPhuongTrinh phuongTrinh = new giaiPhuongTrinh();
	double a = -1111111111;
	double b = 1111111111;
	@Test
	public void testPhuongTrinhBacNhat() {
		double[] nghiem = phuongTrinh.giai(0, 1, 2);
		assertEquals(-2.0, nghiem[0], -2.0);
		assertEquals(a, nghiem[1], 1);
	}
	
	@Test
	public void testPhuongTrinhVoNghiem() {
		double[] nghiem = phuongTrinh.giai(1, 2, 3);
		assertEquals(a, nghiem[0], 1);
		assertEquals(a, nghiem[1], 1);
	}

	@Test
	public void testPhuongTrinhVoSoNghiem() {
		double[] nghiem = phuongTrinh.giai(0, 0, 0);
		assertEquals(b, nghiem[0], 1);
		assertEquals(b, nghiem[1], 1);
	}
	
	@Test
	public void testPhuongTrinhNghiemKep() {
		double[] nghiem = phuongTrinh.giai(1, 2, 1);
		assertEquals(-1.0, nghiem[0], 0.001);
		assertEquals(a, nghiem[1], 0.001);
	}
	
	@Test
	public void testPhuongTrinhHaiNghiem() {
		double[] nghiem = phuongTrinh.giai(2, -3, 1);
		assertEquals(1.0, nghiem[0], 1.0);
		assertEquals(0.5, nghiem[1], 0.1);
	}
}
