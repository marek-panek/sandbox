package lessons.lesson5;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit tests for CountDiv.
 * 
 * @author mpanek
 */
public class CountDivTest {
	
	private CountDiv countDiv;

	@Before
	public void setUp() throws Exception {
		countDiv = new CountDiv();
	}

	@Test
	public void testSolution() {
		assertEquals(3, countDiv.solution(6, 11, 2));
		assertEquals(20, countDiv.solution(11, 345, 17));
		assertEquals(1, countDiv.solution(0, 0, 11));
		assertEquals(0, countDiv.solution(1, 1, 11));
		
		
		assertEquals(1, countDiv.solution(10, 10, 5));
		assertEquals(0, countDiv.solution(10, 10, 7));
		assertEquals(0, countDiv.solution(10, 10, 20));
	}

}
