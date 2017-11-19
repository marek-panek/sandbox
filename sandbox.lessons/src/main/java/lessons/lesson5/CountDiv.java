package lessons.lesson5;

public class CountDiv {
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 2_000_000_000;
	
	private void checkArgument(int arg, int min, int max) {
		if (arg < min || arg > max) {
			throw new IllegalArgumentException(String.format("Param %1$d is outside the range!", arg));
		}
	}
	
	public int solution(int A, int B, int K) {
		checkArgument(A, MIN_VALUE, MAX_VALUE);
		checkArgument(B, MIN_VALUE, MAX_VALUE);
		checkArgument(K, MIN_VALUE + 1, MAX_VALUE);
		
		return B / K - A / K + (0 == A % K ? 1 : 0);
	}

}
