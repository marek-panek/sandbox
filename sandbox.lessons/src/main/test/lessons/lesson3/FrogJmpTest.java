package lessons.lesson3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import lessons.lesson2.OddOccurencesInArray;

/**
 * JUnit tests for FrogJmp.
 * 
 * @author mpanek
 */
public class FrogJmpTest {
	
	private FrogJmp frogJmp;

	@Before
	public void setUp() throws Exception {
		frogJmp = new FrogJmp();
	}

	@Test
	public void testSolution() {
		assertEquals(3, frogJmp.solution(10, 85, 30));
		assertEquals(2, frogJmp.solution(10, 70, 30));
		assertEquals(20, frogJmp.solution(0, 1000, 50));
		assertEquals(1_000_000, frogJmp.solution(0, 1_000_000_000, 1000));
		assertEquals(1_000_001, frogJmp.solution(0, 1_000_000_001, 1000));
	}

}
