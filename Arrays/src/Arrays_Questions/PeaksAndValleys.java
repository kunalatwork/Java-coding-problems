package Arrays_Questions;

import java.util.Arrays;

public class PeaksAndValleys {
	public static void main(String[] args) {
		int[] ar = {3, 6, 7, 1, 4, 8, 9, 2};	
		// Output = {2, 1, 4, 3, 7, 6, 9, 8};
		int[] a = convert(ar);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static int[] convert(int[] a) {
		Arrays.sort(a);
		int len = a.length-1;
		int i=0;
		int j=i+1;
		int temp = 0;
		while(i<len) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i=i+2;
			j=i+1;
		}
		return a;
	}
}
