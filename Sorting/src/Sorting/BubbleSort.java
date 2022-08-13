package Sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] ar = { 1, 5, 8, 3, 6, 9, 2, 7 };
		BubbleSorting(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
	//method
	public static void BubbleSorting(int[] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	
	
}
