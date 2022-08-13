package String_Questions;

import java.util.Stack;

public class BackSpace {

	public static void main(String[] args) {
		char[] a1 = "a#b##".toCharArray();
		char[] b1 = "a#b##".toCharArray();
		System.out.println(match(a1).equals(match(b1)));

	}

	public static Stack<Character> match(char[] a) {
		int len1 = a.length;
		int i = 0;
		Stack<Character> alist = new Stack<Character>();
		while (i < len1) {
			if (a[i] != '#') {
				alist.push(a[i]);
			} else {
				if (!alist.isEmpty()) {
					alist.pop();
				}
			}
			i++;
		}
		return alist;
	}

}
