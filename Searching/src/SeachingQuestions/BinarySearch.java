package SeachingQuestions;

public class BinarySearch {

	public static void main(String[] args) {
		int[] ar = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println("Index No : "+ Search(ar,target));
	}
	
	public static int Search(int[] a, int target) {
		int len = a.length-1;
		int i = 0;
		int j = len-1;
		while (i < j) {
			int mid = i+(j-1);
			if(a[mid]==target) {
				return mid;
			}else if(a[mid]>target ) {
				i = mid-1;
			} else
				j = mid+1;
				
		 }
		return -1;
		
	}

}
