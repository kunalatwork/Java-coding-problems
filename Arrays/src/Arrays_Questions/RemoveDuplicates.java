package Arrays_Questions;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] num = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		// Output = {0, 1, 2, 3, 4};
		remove(num);
	}

	public static void remove(int[] a) {
		int len = a.length-1;
		int i = 0;
		int j = 1;
		System.out.print(a[i]+" ");
		while (i < len) {
			if (a[i] == a[j]) {
				j++;
			} else {
				i = j;
				System.out.print(a[i]+ " ");
			}
		}

	}
}
