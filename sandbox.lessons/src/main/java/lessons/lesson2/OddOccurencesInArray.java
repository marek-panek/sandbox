package lessons.lesson2;

import java.util.HashSet;
import java.util.Set;

public class OddOccurencesInArray {

	public int solution(int[] A) {
		if (A.length % 2 == 0) {
			throw new IllegalArgumentException("Input array must contain odd number of elements.");
		}
		
		final Set<Integer> set = new HashSet<>();

		for (int number : A) {
			if (set.contains(number)) {
				set.remove(number);
			} else {
				set.add(number);
			}
		}
		
		return set.stream().findFirst().get();
	}

}
