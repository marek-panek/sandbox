package lessons.lesson5;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit tests for PassingCars.
 * 
 * @author mpanek
 */
public class PassingCarsTest {
	
	private PassingCars passingCars;

	@Before
	public void setUp() throws Exception {
		passingCars = new PassingCars();
	}

	@Test
	public void testSingle() {
		assertEquals(0, passingCars.solution(new int[] { 0 }));
		assertEquals(0, passingCars.solution(new int[] { 1 }));
	}
	
	@Test
	public void testDouble() {
		assertEquals(0, passingCars.solution(new int[] { 0, 0 }));
		assertEquals(1, passingCars.solution(new int[] { 0, 1 }));
		assertEquals(0, passingCars.solution(new int[] { 1, 0 }));
		assertEquals(0, passingCars.solution(new int[] { 1, 0 }));
	}
	
	@Test
	public void testSample() {
		assertEquals(0, passingCars.solution(new int[] { 0, 0, 0, 0, 0 }));
		assertEquals(0, passingCars.solution(new int[] { 1, 1, 1, 1, 1 }));
		assertEquals(5, passingCars.solution(new int[] { 0, 1, 0, 1, 1 }));
		assertEquals(6, passingCars.solution(new int[] { 0, 1, 0, 1, 0, 1}));
	}


}
