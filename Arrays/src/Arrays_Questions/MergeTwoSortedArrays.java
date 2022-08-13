package Arrays_Questions;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] ar = { 1, 3, 5, 7, 9 };
		int[] ar1 = { 2, 4, 6, 8, 10 };

		// output = {1,2,3,4,5,6,7,8,9,10};

		int[] s = sort(ar, ar1);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}

	}

	public static int[] sort(int[] a, int[] b) {

		int len1 = a.length;
		int len2 = b.length;
		int[] newar = new int[len1 + len2];
		int i = 0;
		int j = 0;
		int pot = 0;
		while (i < len1) {
			if (a[i] < b[j]) {
				newar[pot] = a[i];
				i++;
				pot++;
			} else {
				newar[pot] = b[j];
				j++;
				pot++;
			}
		}
		while (i < len1) {
			newar[pot] = a[i];
			i++;
			pot++;
		}

		while (j < len2) {
			newar[pot] = b[j];
			j++;
			pot++;
		}

		return newar;

	}

}
