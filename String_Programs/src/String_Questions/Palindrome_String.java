package String_Questions;

import java.util.*;

public class Palindrome_String {
	public static void main(String[] args) {
		String str = "radar";
		int len = str.length();
		
		palindrome1(str, len);
		palindrome2(str, len);
		palindrome3(str, len);

	}

	// 1st Approach
	public static void palindrome1(String str, int len) {
		String temp = str;
		String revString = "";
		for (int i = temp.length()-1; i >= 0; i--) {
			revString += temp.charAt(i);
		}
		if(str.equalsIgnoreCase(revString)) {
			System.out.println("Pelindrome");
		}else
			System.out.println("Not Pelindrome");
	}

	// 2nd Approach
	public static void palindrome2(String str, int len) {

		int[] ch = new int[256];
		// Counting occurring characters
		for (int i = 0; i < len; i++) {
			ch[str.charAt(i)]++;
		}
		int odd = 0;
		for (int i = 0; i < 256; i++) {
			if (ch[i] % 2 == 1) {
				odd++;
				System.out.println(ch[i] + " " + (char) i);
			}
		}
		if (odd > 1) {
			System.out.println("Not Palindome");
		} else
			System.out.println("Palindrome");
	}

	// 3rd Approach
	public static void palindrome3(String str, int len) {
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				int g = map.get(c);
				map.put(c, g + 1);
			} else
				map.put(c, 1);
		}
		int count = 0;

		for (Integer value : map.values()) {
			if (value % 2 == 1)
				count++;
		}
		if (count > 1) {
			System.out.println("Not Palindome");
		} else
			System.out.println("Palindrome");

	}
}
