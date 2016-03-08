package lessons.lesson3;

import java.util.stream.IntStream;

public class TapeEquilibrium {

	public int solution(int[] A) {
		 int min = Integer.MAX_VALUE;

	     int sumLeft  = 0;
	     int sumRight = IntStream.of(A).sum();

	     for (int i = 1; i < A.length; i++) {
	         int val = A[i - 1];
	         
	         sumLeft  += val;
	         sumRight -= val;

	         int diff = Math.abs(sumLeft - sumRight);

	         if (min > diff)
	         {
	             min = diff;
	         }
	     }

	     return min;
	}
	
	public static void main(String[] args) {
		final TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
		System.out.println(tapeEquilibrium.solution(new int[] {3,1,2,4,3}));
	}

}
