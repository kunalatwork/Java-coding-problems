package String_Questions;

import java.util.*;

public class CountCharacters {
	public static void main(String args[]) {
		String str = "aabcccccaaa";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			if (map.containsKey(key)) {
				int value = map.get(str.charAt(i)) + 1;
				map.put(key, value);
			} else
				map.put(key, 1);
		}
		System.out.println(map);
	}
	
}
