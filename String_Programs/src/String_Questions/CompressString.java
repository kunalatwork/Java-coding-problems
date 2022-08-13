package String_Questions;

public class CompressString {
	public static void main(String[] args) {
		String str = "aabcccccaaab";
		// Output = a2b1c5a3b1;
		System.out.println(compress(str));
	}

	public static String compress(String str) {
		int len = str.length();
		int count = 1;
		int i = 0;
		String result = "";
		while (i < len - 1) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				result += str.charAt(i) + "" + String.valueOf(count);
				count = 1;
			}
			i++;
		}
		result += str.charAt(i) + "" + String.valueOf(count);
		return result;
	}
}
