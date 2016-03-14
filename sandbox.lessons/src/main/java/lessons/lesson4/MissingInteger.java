package lessons.lesson4;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MissingInteger {

	public int solution(int[] A) {
		final Set<Integer> numbers = Arrays.stream(A).boxed().filter(i -> (i > 0)).collect(Collectors.toCollection(TreeSet::new));
		
		int min = 1;
		
		for (Integer number : numbers) {
			if (number == min) {
				min++;
			}
		}
		
		return min;
	}
}
