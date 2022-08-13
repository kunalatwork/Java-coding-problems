package String_Questions;

public class PrintSingleCharacterOnly {

	public static void main(String[] args) {
		String str = "aaabeeebcc";
		SingleCharacters(str);
	}

	public static void SingleCharacters(String str) {
		int i = 0;
		int j = 0;
		System.out.println(str.charAt(i));
		while (j < str.length()) {
			if (str.charAt(i) == str.charAt(j))
				j++;
			else {
				i = j;
				System.out.println(str.charAt(i));
			}
		}
	}
}