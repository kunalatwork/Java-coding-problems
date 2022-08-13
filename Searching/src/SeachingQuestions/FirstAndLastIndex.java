package SeachingQuestions;

public class FirstAndLastIndex {

	public static void main(String[] args) {
		int[] ar = { 0, 2, 2, 2, 2, 2, 3, 4, 5};
		int target = 2;
		int s = search(ar, target);
		int d = Fsearch(ar, s, target);
		int g = Lsearch(ar, s, target);
		System.out.println("First Index : " + d);
		System.out.println("Last Index : " + g);
	}

	public static int search(int[] a, int target) {
		int len = a.length;
		int i = 0;
		int j = len-1;

		while (i <= j) {
			int mid = (i + j) / 2;
			if (a[mid] == target) {
				return mid;
			}
			else if (a[mid] < target) {
				i = mid + 1;			
			} else
				j = mid - 1;
		}
		return -1;
	}
	
	public static int Fsearch(int[] a, int index, int target) {
		int i = index-1;
		while (i>=0 && a[i]==target) 
			i--;
		return i+1;
	}
	
	public static int Lsearch(int[] a, int index, int target) { 
		int j = index+1;
		while (j<a.length && a[j]==target)
				j++;
		return j-1;
	}

}
