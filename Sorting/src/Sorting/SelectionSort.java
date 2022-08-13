package Sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] ar = { 1, 5, 8, 3, 6, 9, 2, 7 };
		SelectionSorting(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
	
	public static void SelectionSorting(int[] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}
}
