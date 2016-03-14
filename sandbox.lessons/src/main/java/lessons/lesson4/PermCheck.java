package lessons.lesson4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PermCheck {

	public int solution(int[] A) {
		final Set<Integer> numbers = Arrays.stream(A).boxed().collect(Collectors.toCollection(TreeSet::new));
		
		if (A.length != numbers.size()) {
			return 0;
		}
		
		int i = 0;
		final Iterator<Integer> iter = numbers.iterator();
		while (iter.hasNext()) {
			final Integer number = iter.next();
			if (number != ++i) {
				return 0;
			}
		}
		
		return 1;
	}
	
}
