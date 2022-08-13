package String_Questions;

import java.util.*;

public class UniqueCharacter {
	public static void main(String[] args) {
		String str = "levels";
		// UniqueCharacter = 'V';
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				int val = map.get(str.charAt(i)) + 1;
				map.put(str.charAt(i), val);
			} else
				map.put(str.charAt(i), 1);
		}

		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) == 1) {
				System.out.println(str.charAt(i));
				break;

			}

		}
	} 
}
