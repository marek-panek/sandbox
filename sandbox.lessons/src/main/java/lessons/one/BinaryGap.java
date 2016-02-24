package lessons.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryGap {

	public int solution(final int number) {
		if (number < 1) {
			throw new IllegalArgumentException(String.format("Input number must be in range [%1$d, %2$d].", 1, Integer.MAX_VALUE));
		}
		
		final String regex = "1(0*)1";
		final String binaryString = Integer.toBinaryString(number);
		final Pattern pattern = Pattern.compile(regex);
		final Matcher matcher = pattern.matcher(binaryString);
		
		int result = 0;
		int index = 0;
		
		while (matcher.find(index)) {
			final String matchingGroup = matcher.group(1);
			
			index += matcher.group().length() - 1;
			if (matchingGroup.length() > result) {
				result = matchingGroup.length();
			}
		}
		
		return result;
	}
}
