package implicit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexpress {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("patternsz", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("hello patterns");
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
	}
}
