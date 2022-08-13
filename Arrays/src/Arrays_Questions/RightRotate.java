package Arrays_Questions;

public class RightRotate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int len = arr.length;
		int n = 3;
		RightRotateForLoop(arr, len, n);
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//Using for Loop
	public static void RightRotateForLoop(int[] a, int len, int n) {
		for(int i=0; i<n; i++) {
			int temp = a[len-1];
			for(int j = len-1; j>0; j--) {
				a[j] = a[j-1];
			}
			a[0] = temp;
		}
	}	
	
	//Using While loop
	public static void RightRotateWhileLoop(int[] a, int len, int n) {
		int i = 0;
		while(i<n) {
			int temp = a[len-1];
			int j = len-1;
			while(j>0) {
				a[j] = a[j-1];
				j--;
			}
			a[0] = temp;
			i++;
			
		}
	}
}
