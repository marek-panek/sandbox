package lessons.lesson4;

import java.util.Arrays;

public class MaxCounters {
	
	 public int[] solution(int N, int[] A) {
		 int[] counters = new int[N];
		 
		 int max = 0;
		 
		 for (int operation : A) {
			if (operation >= 1 && operation <= N) {
				int result = increase(counters, operation);
				if (result > max) {
					max = result;
				}
			} else if (operation == (N + 1)) {
				allMax(counters, max);
			}
		}
		 
		return counters;
	 }
	 
	 private int increase(int[] counters, int x) {
		 return ++counters[--x];
	 }
	 
	 private void allMax(int[] counters, int max) {
		 Arrays.fill(counters, max);
	 }
	 
}
