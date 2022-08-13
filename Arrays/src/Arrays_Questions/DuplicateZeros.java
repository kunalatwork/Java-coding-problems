package Arrays_Questions;

import java.util.ArrayList;

public class DuplicateZeros {
	public static void main(String[] args) {
		int[] a = { 1, 7, 0, 2, 0, 0, 6, 7, 8 };
		int len = a.length;
		// output = {1,7, 0, 0, 2, 0, 0, 0, 0};
		ThirdDuplicateZero(a, len);
		for(int i=0; i<len; i++) {
			System.out.print(a[i]+" ");
		}

	}
		public static void FirstDuplicateZero(int[] a) {
// 1st Approach
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 0;
		while (list.size() < a.length) {
			if (a[i] != 0) {
				list.add(a[i]);
			} else if (a[i] == 0) {
				list.add(a[i]);
				list.add(a[i]);
			}
			i++;
		}
		for (int k : list) {
			System.out.print(k + " ");
		}
	}
	

// 2nd Approach
	public static int[] SecondZeroDuplicate(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == 0) {
				for (int j = a.length - 1; j > i; j--) {
					a[j] = a[j - 1];
				}
			}
		}
		return a;
	}
	
// 3rd Approach
	public static void ThirdDuplicateZero(int[] a, int len) {
		int i=0;
		while(i<len) {
			if(a[i]==0) {
				int j = i;
				int val = 0;
				int temp;
				while(j+1<len) {
					temp = a[j+1];
					a[j+1] = val;
					val = temp;
					j++;
				}
				i++;
			}
			i++;
		}
	}
}
