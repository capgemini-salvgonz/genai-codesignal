package blackbox.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LosslessDataCompression {

	public static String[] solution(String[] emails) {
		List<String> result = new ArrayList<>();
		int i = 0;
		String currentString = "";

		while (i < emails.length) {
			if (emails[i].length() == 1) {
				if (currentString.length() > 0) {
					result.add(currentString);
					currentString = "";
				}
				result.add(emails[i]);
			} else {
				currentString += emails[i].substring(0, emails[i].length() - 1) + "(" + (emails[i].length() - 2) + ","
						+ (emails[i].length() - 1) + ")";
			}
			i++;
		}

		if (currentString.length() > 0) {
			result.add(currentString);
		}

		return result.toArray(new String[0]);
	}
}
