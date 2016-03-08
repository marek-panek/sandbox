package lessons.lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

	public int solution(int X, int[] A) {
		final Set<Integer> hset = new HashSet<Integer>();

        for (int i = 0 ; i < A.length; i++) {
            if (A[i] <= X)
               hset.add(A[i]);   
            if (hset.size() == X)
               return i;
        }

        return -1;
	}

	public static void main(String[] args) {
		final FrogRiverOne frogRiverOne = new FrogRiverOne();
		System.out.println(frogRiverOne.solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }));
		System.out.println(frogRiverOne.solution(1, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }));
		System.out.println(frogRiverOne.solution(3, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }));
	}

}
