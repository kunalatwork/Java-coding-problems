package Arrays_Questions;

public class InsertionInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int len = arr.length;
		int n = 9;
		int index = 7;
		Insert(arr, len, n, index);
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Insert(int[] a, int len, int n, int index) {
		for (int i = 0; i < len; i++) {
			if (a[i] == a[index]) {
				int temp = 0;
				int val = n;
				for (int j = i; j <= len - 1; j++) {
					temp = a[j];
					a[j] = val;
					val = temp;
				}
			}
		}
	}
}
