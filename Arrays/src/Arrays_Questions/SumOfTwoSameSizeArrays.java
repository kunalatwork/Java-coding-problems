package Arrays_Questions;

import java.util.ArrayList;
import java.util.List;

public class SumOfTwoSameSizeArrays {

	public static void main(String[] args) {
		int[] ar = { 7, 4, 7 };
		int[] ar1 = { 7, 8, 2 };
		// Output = {1, 5, 2, 9 };
		
		List<Integer> f = sum1(ar, ar1);
		for (int h : f) {
			System.out.println(h + " ");
		}
	}

	public static List<Integer> sum1(int[] a, int[] b) {

		List<Integer> list = new ArrayList<Integer>();

		int sum = 0;
		int carry = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			sum = a[i] + b[i] + carry; // sum = 13%10 = 3, 7%10
			list.add(sum % 10);
			if (sum >= 10)
				carry = 1;
			else
				carry = 0;
		}

		if (carry == 1) {
			list.add(carry);
		}
		return list;
	}

}
