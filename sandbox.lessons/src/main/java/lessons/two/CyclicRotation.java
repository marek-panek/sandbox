package lessons.two;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CyclicRotation {
	private static final int MIN_SIZE = 0;
	private static final int MAX_SIZE = 100;
	private static final int MIN_VALUE = -1000;
	private static final int MAX_VALUE = 1000;
	
	public int[] solution(int[] A, int K) {
		if (A == null || A.length < MIN_SIZE || A.length > MAX_SIZE) {
			throw new IllegalArgumentException(String.format("Input array must be not null and of size [%1$d, %2$d].", MIN_SIZE, MAX_SIZE));
		}
		
		final List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
		Collections.rotate(list, K);
			
		return list.stream().mapToInt(i->i).toArray();
	}
	
	private int[] generateRandomIntsArray(final int size, final int minValue, final int maxValue) {
		final Random random = new Random();
		return random.ints(size, minValue, maxValue + 1).toArray();
	}
	
	public static void main(String[] args) {
		final CyclicRotation rotation = new CyclicRotation();
		
		int[] tab1 = rotation.generateRandomIntsArray(5, MIN_VALUE, MAX_VALUE);
		int[] tab2 = rotation.generateRandomIntsArray(10, MIN_VALUE, MAX_VALUE);
		int[] tab3 = rotation.generateRandomIntsArray(15, MIN_VALUE, MAX_VALUE);
		int[] tab4 = rotation.generateRandomIntsArray(20, MIN_VALUE, MAX_VALUE);
		
		System.out.println("Before rotate:");
		System.out.println(Arrays.toString(tab1));
		System.out.println(Arrays.toString(tab2));
		System.out.println(Arrays.toString(tab3));
		System.out.println(Arrays.toString(tab4));
		
		tab1 = rotation.solution(tab1, 1);
		tab2 = rotation.solution(tab2, 5);
		tab3 = rotation.solution(tab3, 10);
		tab4 = rotation.solution(tab4, 3);
		
		System.out.println("After rotate:");
		System.out.println(Arrays.toString(tab1));
		System.out.println(Arrays.toString(tab2));
		System.out.println(Arrays.toString(tab3));
		System.out.println(Arrays.toString(tab4));
	}
}
