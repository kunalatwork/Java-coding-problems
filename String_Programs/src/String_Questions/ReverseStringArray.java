package String_Questions;

public class ReverseStringArray {
	public static void main(String[] args) {
		char[] ar = { 'n', 'i', 'd', 'h', 'i' };
		swap(ar);
		for (char ch : ar) {
			System.out.print(ch);
		}
	}

	public static char swap(char[] ar) {
		int len = ar.length;
		int i = 0;
		int j = len - 1;
		while (i < j) {
			char temp = ar[j];
			ar[j] = ar[i];
			ar[i] = temp;
			i++;
			j--;
		}
		return ar[j];
	}
}
