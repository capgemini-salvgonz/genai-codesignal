package blackbox.algorithms;

import java.util.*;

public class CampusCup {
	public static String[] solution(String[] emails) {
		Map<String, Integer> schools = new HashMap<>();

		for (String email : emails) {
			String[] parts = email.split("@");
			String domain = parts[1];
			if (schools.containsKey(domain)) {
				schools.put(domain, schools.get(domain) + 20);
			} else {
				schools.put(domain, 20);
			}
		}

		List<Map.Entry<String, Integer>> sortedSchools = new ArrayList<>(schools.entrySet());
		Collections.sort(sortedSchools, (a, b) -> {
			int comparison = Integer.compare(b.getValue(), a.getValue());
			if (comparison == 0) {
				return a.getKey().compareTo(b.getKey());
			}
			return comparison;
		});

		String[] result = new String[sortedSchools.size()];
		for (int i = 0; i < sortedSchools.size(); i++) {
			result[i] = sortedSchools.get(i).getKey();
		}

		return result;
	}
}