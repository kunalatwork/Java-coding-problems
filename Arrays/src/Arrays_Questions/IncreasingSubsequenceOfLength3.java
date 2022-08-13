package Arrays_Questions;

public class IncreasingSubsequenceOfLength3 {
	public static void main(String[] args) {
		int ar[] = { 8, 7, 3, 1, 6, 5, 9, 2 };
		search(ar);
	}

	public static void search(int[] a) {
		int len = a.length - 1;
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				for(int k=j+1; k<len; k++) {
					if(a[i]<a[j] && a[j]<a[k]) {
						System.out.println(a[i]+" : "+a[j]+" : "+a[k]);
					}
				}
			}
		}

	}
}
