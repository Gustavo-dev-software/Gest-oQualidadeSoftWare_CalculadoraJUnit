package mediaTestJUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import media.Media;

public class MediaTest {
	@Test
	public void media3Numeros() {
		Media med3 = new Media();
		assertEquals(med3.media3(4, 3, 2), 3.0);
		assertEquals(med3.media3(20, 40, 3), 21.0);
		assertEquals(med3.media3(13, 3, 5), 7.0);
	}
	
	@Test
	public void media2Numeros() {
		Media med2 = new Media();
		assertEquals(med2.media2(4, 3), 3.5);
		assertEquals(med2.media2(20, 40), 30.0);
		assertEquals(med2.media2(13, 3), 8.0);
	}
	
	@Test
	public void media4Numeros() {
		Media med4 = new Media();
		assertEquals(med4.media4(4, 4, 4, 4), 4);
		assertEquals(med4.media4(2, 2, 2, 2), 2);
		assertEquals(med4.media4(5, 5, 5, 5), 5);
		assertEquals(med4.media4(8, 8, 8, 8), 8);
		assertTrue(med4.media4(6, 6, 6, 6) == 6);
		}
}
