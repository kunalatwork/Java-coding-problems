
package Searching;

public class Binary_Linear {


/*	
 
 1.  Intersection of Three Sorted Arrays
 
	public static void main(String[] args) {
		int[] v1 = { 1, 2, 3, 4, 5 };
		int[] v2 = { 1, 2, 5, 7, 9 };
		int[] v3 = { 1, 3, 4, 5, 8 };
		Binary_Linear v = new Binary_Linear();
		v.InterSectionsort(v1, v2, v3);

	}

	
	public void InterSectionsort(int[] a, int[] b, int[] c) {
		int len1 = a.length;
		int len2 = b.length;
		int len3 = c.length;

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < len1 && j<len2 && k<len3) {
			if (a[i] == b[j] && b[j]==c[k]) {
				System.out.println(a[i]);
				i++;
				j++;
			}
			else if(a[i]<len1) {
				i++;
			}
			else if(b[j]<len2) {
				j++;
			}
			else {
				k++;
			}
		}
	
	}
*/
	
//	public static void main(String[] args) {
//		int[] v1 = { 1,2,2,1};
//		int[] v2 = {2,2 };
//		Binary_Linear l = new Binary_Linear();
//		l.InsetionoTwo(v1, v2);
//		System.out.println();
//
//	}
//	
//	public void InsetionoTwo(int[] a, int[] b) {
//		int len1 = a.length;
//		int len2 = b.length;
//		int i=0;
//		int j=0;
//		while(i<len1 && j<len2) {
//			if(a[i]==b[j]) {
//				System.out.println(a[i]);
//				i++;
//				j++;
//			}
//			else if(a[i]<len1) {
//				i++;
//			}
//			
//			else
//				j++;
//		}
//						
//	}
	
	

// Question : find the 1st and last index on target
//	public static void main(String[] args) { // 3 3 3 3 3 3 3 3 3 3 3 3
//		int[] ar = { 0, 2, 2, 2, 2, 2, 3, 4, 5};
//		int target = 3;
//		int s = search(ar, target);
//		int d = Fsearch(ar, s, target);
//		int g = Lsearch(ar, s, target);
//		System.out.println(d);
//		System.out.println(g);
//	}
//
//	public static int search(int[] a, int target) {
//		int len = a.length;
//		int i = 0;
//		int j = len-1;
//
//		while (i <= j) {
//			int mid = (i + j) / 2;
//			if (a[mid] == target) {
//				return mid;
//			}
//			else if (a[mid] < target) {
//				i = mid + 1;			
//			} else
//				j = mid - 1;
//		}
//		return -1;
//	}
//	
//	public static int Fsearch(int[] a, int index, int target) { // 3 3 3 3 3 5 6 
//		int i = index-1;
//		while (i>=0 && a[i]==target) 
//			i--;
//		return i+1;
//	}
//	
//	public static int Lsearch(int[] a, int index, int target) { // 3 3 3 3 3 5 6 
//		int j = index+1;
//		while (j<a.length && a[j]==target)
//				j++;
//		return j-1;
//	}

}
