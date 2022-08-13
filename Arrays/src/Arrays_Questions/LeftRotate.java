package Arrays_Questions;

public class LeftRotate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int len = arr.length;
		int n = 3;
		LeftRotateForLoop(arr, len, n);
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//Using for Loop
	public static void LeftRotateForLoop(int[] a, int len, int n) {
		for (int i = 0; i < n; i++) { 
	        int temp = a[0];
	        for (int j = 0; j < len - 1; j++) {
	            a[j] = a[j + 1];       
	        }
	        a[len - 1] = temp;
		}
	}
	
	//Using while loop
	public static void LeftRotateWhileLoop(int[] a, int len, int n) {
		int i = 0;
		while(i<n) {
			int temp = a[0];
			int j = 0;
			while(j<len-1) {
				a[j] = a[j+1];
				j++;
			}
			a[len-1] = temp;
			i++;
		}
	}
}
