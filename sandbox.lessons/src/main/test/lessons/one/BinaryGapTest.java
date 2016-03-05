package lessons.one;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit tests for BinaryGap.
 * 
 * @author mpanek
 */
public class BinaryGapTest {

	private BinaryGap binaryGap;

	@Before
	public void setUp() throws Exception {
		binaryGap = new BinaryGap();
	}

	@Test
	public void testSolution() {
		assertEquals(0, binaryGap.solution(0b11));
		assertEquals(1, binaryGap.solution(0b101));
		assertEquals(2, binaryGap.solution(0b1001));
		assertEquals(3, binaryGap.solution(0b10001));
		assertEquals(2, binaryGap.solution(0b101001));
		assertEquals(3, binaryGap.solution(0b1010001));
		assertEquals(3, binaryGap.solution(0b11011001110001));
		assertEquals(2, binaryGap.solution(0b1101100111000));
		assertEquals(0, binaryGap.solution(Integer.MAX_VALUE));
	}
	
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSolutionWithInvalidNumber() {
		binaryGap.solution(0);
	}

}

