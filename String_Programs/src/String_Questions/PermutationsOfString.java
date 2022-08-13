package String_Questions;

public class PermutationsOfString {
	public static void main(String[] args) {
		String str = "abc";
		check(str);
	}

	public static String swap(String str, int a, int b) {
		char[] ch = str.toCharArray();
		char temp = ch[a];
		ch[a] = ch[b];
		ch[b] = temp;
		return String.valueOf(ch);
	}

	public static void permutation(String str, int index) {
		if (index == str.length()) {
			return;
		}
		for (int i = index; i < str.length(); i++) {
			str = swap(str, index, i);
			permutation(str, index + 1);
			str = swap(str, index, i);
		}

	}

	public static boolean check(String str) {
		permutation(str, 0);
		System.out.println(str);
		if (str.contains("abc")) {
			return true;
		}
		return false;

	}

}
