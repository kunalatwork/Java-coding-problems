package Arrays_Questions;

import java.util.*;

public class SumOfTwoDiffSizeArrays {

//  1st approach;

	public static void main(String[] args) {
		int[] ar1 = { 9, 7, 8, 2 };
		int[] ar = { 5, 4, 7 };
		List<Integer> list = MatSum(ar, ar1);

		List<Integer> Sumlist = Sum(list, ar1);
		for (int j : Sumlist) {
			System.out.println(j);
		}
	}

	// 1st Approach
	public static List<Integer> MatSum(int[] a, int[] b) {
		int len = a.length;
		int len1 = b.length;
		List<Integer> list = new ArrayList<Integer>();
		if (len < len1) {
			int gap = len1 - len;
			for (int i = 0; i < gap; i++) {
				list.add(0);
			}
			for (int i = 0; i < len; i++) {
				list.add(a[i]);
			}

		} else {
			int gap = len - len1;
			System.out.println(len + " - " + len1 + " = " + gap);
			for (int i = 0; i < gap; i++) {
				list.add(0);
			}
			for (int i = 0; i < len; i++) {
				list.add(a[i]);
			}
		}

		return list;
	}

	public static List<Integer> Sum(List<Integer> list, int[] b) {
		int len1 = b.length;
		int sum = 0;
		int carry = 0;
		List<Integer> Sumlist = new ArrayList<Integer>();
		for (int i = len1 - 1; i >= 0; i--) {
			sum = list.get(i) + b[i] + carry;
			Sumlist.add(sum % 10);
			if (sum >= 10) {
				carry = 1;
			} else
				carry = 0;
		}

		if (carry == 1) {
			Sumlist.add(carry);
		}
		return Sumlist;

	}

	// 2nd Approach
	public static List<Integer> sum(int[] a, int[] b) {
		int i = a.length - 1;
		int j = b.length - 1;
		int carry = 0;
		int val1 = 0;
		int val2 = 0;
		int sum = 0;
		List<Integer> Sumlist = new ArrayList<Integer>();
		while (i >= 0 || j >= 0 || carry == 1) {
			val1 = i >= 0 ? a[i] : 0;
			val2 = j >= 0 ? b[j] : 0;
			sum = val1 + val2 + carry;
			Sumlist.add(sum % 10);
			carry = (int) (sum / 10);
			i--;
			j--;
		}

		return Sumlist;
	}
}
