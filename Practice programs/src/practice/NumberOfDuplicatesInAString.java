package practice;

import java.util.HashMap;
import java.util.Map;

public class NumberOfDuplicatesInAString {
	public static void main(String args[]) {
		String str = "TESTYANTRA";
		char[] c = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char value : c) {
			System.out.println(value);
			if (Character.isAlphabetic(value)) {
				if (map.containsKey(value)) {
					map.put(value, map.get(value) + 1);
				} else {
					map.put(value, 1);
				}
			}

		}
		System.out.println(map);
	}
}
