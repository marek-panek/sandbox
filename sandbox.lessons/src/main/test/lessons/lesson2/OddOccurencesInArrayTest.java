package lessons.lesson2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import lessons.lesson2.OddOccurencesInArray;

/**
 * JUnit tests for OddOccurencesInArray.
 * 
 * @author mpanek
 */
public class OddOccurencesInArrayTest {
	
	private OddOccurencesInArray oddOccurencesInArray;

	@Before
	public void setUp() throws Exception {
		oddOccurencesInArray = new OddOccurencesInArray();
	}

	@Test
	public void testSolution() {
		assertEquals(6, oddOccurencesInArray.solution(new int[] {3, 3, 6, 8, 3, 3, 8}));
		assertEquals(1, oddOccurencesInArray.solution(new int[] {3, 3, 3, 3, 3, 3, 1}));
		assertEquals(1, oddOccurencesInArray.solution(new int[] {1, 1, 1, 0, 0, 0, 0}));
	}

}
