package Tops.Assigment_selenium;

import org.junit.Test;



import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class p012_Asert {
	@Test
	public void test() {
		int ac =12;
		int ex = 23;
		assertEquals(ex, ac);
		assertTrue(true);
	}
	@Test
	public void test2() {
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		assertArrayEquals(a, b);
	}
}
