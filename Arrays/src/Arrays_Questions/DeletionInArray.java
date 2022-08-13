package Arrays_Questions;

public class DeletionInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int len = arr.length;
		int n = 4;
		Delete(arr, len, n);
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Delete(int[] a, int len, int n) {
		int i = 0;
		boolean found = false;
		while (i < len) {
			if (a[i] == n) {
				found = true;
				int j = i;
				while (j + 1 < len) {
					a[j] = a[j + 1];
					j++;
				}
			}
			i++;
		}
		if (found) {
			a[len - 1] = 0;
		}
	}
}
