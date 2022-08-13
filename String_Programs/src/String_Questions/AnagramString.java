package String_Questions;

import java.util.*;

public class AnagramString {
	public static void main(String[] args) {
		// inputs for 1st Approach
		char[] s1 = "nidhi".toCharArray();
		char[] s2 = "indhi".toCharArray();
		
		// inputs for 2nd & 3rd Approach		 
		String str = "nidhi";
		String str1 = "indhi";
		
		System.out.println(Anagram(s1, s2));
		System.out.println(Anagram1(str, str1));
		System.out.println(Anagram2(str, str1));
	}

	//1st Approach
	public static boolean Anagram(char[] str, char[] str1) {
		
		boolean flag = true;
		if (str.length != str1.length) {
			flag = false;
		} else
		Arrays.sort(str);
		Arrays.sort(str1);
		// flag = Arrays.equals(str, str1);
		for (int i = 0; i < str.length; i++) {
			if (str[i] != str1[i]) {
				return false;
			}
		}
		return flag;
	}

	// 2nd Approach
	public static boolean Anagram1(String str, String str1) {
		boolean flag = true;
		Map<Character, Integer> map_1 = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map_1.containsKey(str.charAt(i))) {
				int value = map_1.get(str.charAt(i)) + 1;
				map_1.put(str.charAt(i), value);
			} else
				map_1.put(str.charAt(i), 1);
		}

		Map<Character, Integer> map_2 = new HashMap<Character, Integer>();
		for (int i = 0; i < str1.length(); i++) {
			if (map_2.containsKey(str1.charAt(i))) {
				int value = map_2.get(str1.charAt(i)) + 1;
				map_2.put(str1.charAt(i), value);
			} else
				map_2.put(str1.charAt(i), 1);
		}
		for (Character ch : map_1.keySet()) {
			if (!map_2.containsKey(ch) || !map_1.get(ch).equals(map_2.get(ch))) {
				flag = false;
				break;
			}

		}

		return flag;
	}

	// 3rd Approach
	public static boolean Anagram2(String str, String str1) {
		boolean flag = true;
		Map<Character, Integer> map_1 = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map_1.containsKey(str.charAt(i))) {
				int value = map_1.get(str.charAt(i)) + 1;
				map_1.put(str.charAt(i), value);
			} else
				map_1.put(str.charAt(i), 1);
		}

		Map<Character, Integer> map_2 = new HashMap<Character, Integer>();
		for (int i = 0; i < str1.length(); i++) {
			if (map_2.containsKey(str1.charAt(i))) {
				int value = map_2.get(str1.charAt(i)) + 1;
				map_2.put(str1.charAt(i), value);
			} else
				map_2.put(str1.charAt(i), 1);
		}

		if (!map_1.equals(map_2)) {
			flag = false;
		}
		return flag;
	}
}
