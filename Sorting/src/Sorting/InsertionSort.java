package Sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] ar = { 2, 5, 8, 3, 9, 6, 1, 12, 34, 21, 11 };
		int len = ar.length;
		insertion(ar, len);
		for (int i = 0; i < len; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}

	public static void insertion(int[] ar, int len) {
		int i = 1;
		while (i < len) {
			int j = i;
			int temp = ar[i];
			while (j > 0 && ar[j - 1] > temp) {
				ar[j] = ar[j - 1];
				j--;
			}
			ar[j] = temp;
			i++;
		}
	}
}
