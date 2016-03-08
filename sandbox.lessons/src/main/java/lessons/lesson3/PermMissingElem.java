package lessons.lesson3;

import java.util.stream.IntStream;

public class PermMissingElem {

	public int solution(int[] A) {
		long N = A.length + 1;
		return (int) (((N * (N + 1)) / 2) - IntStream.of(A).sum());
	}

	public static void main(String[] args) {
		final PermMissingElem permMissingElem = new PermMissingElem();
		System.out.println(permMissingElem.solution(new int[] { 2, 3, 4, 5, 6 }));
	}

}
