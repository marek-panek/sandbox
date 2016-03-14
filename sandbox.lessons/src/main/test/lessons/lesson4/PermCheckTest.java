package lessons.lesson4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit tests for PermCheck.
 * 
 * @author mpanek
 */
public class PermCheckTest {
	
	private PermCheck permCheck;

	@Before
	public void setUp() throws Exception {
		permCheck = new PermCheck();
	}

	@Test
	public void testSolution() {
		assertEquals(1, permCheck.solution(new int[] {1,4,3,2}));
		assertEquals(0, permCheck.solution(new int[] {1,4,3}));
		assertEquals(0, permCheck.solution(new int[] {1,1,1,1}));
		assertEquals(1, permCheck.solution(new int[] {1}));
	}

}
