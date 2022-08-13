package Arryas;

import java.util.Stack;

public class Leet_Arrays {

/*	
//Question 1 : Sum of triple sub array

	public static void main(String[] args) {

		int[] ar = { 1, 2, 5, 6, 8 };
		int sum = 11;
		twoSum(ar, sum);
		sum(ar, sum);

	}

//1st Approach
	public static boolean twoSum(int[] ar, int sum) {
		int len = ar.length;
		for (int f = 0; f < len - 3; f++) {
			int i = f + 1;
			int j = len - 1;
			int k = sum - ar[f];
			while (i < j) {
				if (ar[i] + ar[j] == k) {
					System.out.println(ar[i] + " + " + ar[j] + " + " + ar[f] + " = " + sum);
					return true;
				} else if (ar[i] + ar[j] < k) {
					i++;
				} else
					j--;
			}
		}
		return false;
	}

//2nd Approach
	public static boolean sum(int[] ar, int sum) {
		for (int i = 0; i < ar.length - 3; i++) {
			for (int j = i + 1; j < ar.length - 2; j++) {
				for (int k = j + 2; k < ar.length; k++) {

					if (ar[i] + ar[j] + ar[k] == sum) {
						System.out.println(ar[i] + " + " + ar[j] + " + " + ar[k] + " = " + sum);
						return true;
					}
				}
			}
		}
		return false;
	}
*/
	
/*	
//Question 2 : Sum of two sub array

	public static void main(String[] args) {
	int[] nums = { 2, 7, 11, 15 };
	int target = 9;
	int tar = twoSum(nums, target);
	System.out.println(tar);
}

public static int twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
     
        while(i<j){
            if(nums[i]+nums[j]==target){
            	return nums[i]+nums[j];
            }else if(nums[i]+nums[j]<target){
                i++;
            }else
                j--;
        }
        return nums[i]+nums[j];
        
    }
*/	

	
/*
// 3. Median of Two Sorted Arrays

	public static void main(String[] args) {
		int[] num1 = { 1, 2 };
		int[] num2 = { 3, 4 };
		int[] a = add(num1, num2);
		System.out.println(median(a));
		
		
	}
	public static double median(int[] newar) {
		int sum=0;
		int mid = newar.length/2;
		for (int k = mid-1; k <= mid; k++) {
			sum+=newar[k];
		}
		float median = sum/2;
		System.out.println(sum );
		return median;
	}

	public static int[] add(int[] num1, int[] num2) {
		int len = num1.length + num2.length;
		int sum = 0;
		int[] ar = new int[len];
		int add = 0;
		for(int ar1 : num1) {
			ar[add] = ar1;
			add++;
		}
		for(int ar2 : num2) {
			ar[add] = ar2;
			add++;
		}
		return ar;
	}
*/

	
/*
//	  Question 4. Remove Duplicates from Sorted Array

	public static void main(String[] args) {
		int[] num = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		remove(num);
	}

	public static void remove(int[] a) {
		int len = a.length-1;
		int i = 0;
		int j = 1;
		System.out.print(a[i]);
		while (i < len) {
			if (a[i] == a[j]) {
				j++;
			} else {
				i = j;
				System.out.print(a[i]);
			}
		}

	}
*/

/*
 
 
// 5. Remove all duplicate Element from array
	public static void main (String[] args) {
		int[] ar = {0,1,2,2,3,0,4,2};
		int[] arr = removeDuplicate(ar);
		for(int s : arr) {
			System.out.print(s+" ");
		}
	}
	
	public static int[] removeDuplicate(int[] a) {
		int len = a.length;
		int count = 0;
		for(int i=0; i<len; i++) {
			if(a[i]==2) {
				count++;
			}
		}
		int[] newar = new int[len-count];
		int pot = 0;
		for(int j=0; j<len; j++) {
			if(a[j]!=2) {
				newar[pot]=a[j];
				pot++;
			}
		}
		pot++;
		
		return newar;
	}
*/

/*
// 6  Search in Rotated Sorted Array
	public static void main(String[] args) {
		int[] ar = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(Search(ar,target));
	}
	
	public static int Search(int[] a, int target) {
		int len = a.length;
		int i = 0;
		int j = len-1;
		while (i < j) {
			int mid = i+(j-1);
			if(a[mid]==target) {
				return mid;
			}else if(a[mid]>target ) {
				i = mid-1;
			} else
				j=mid+1;
				
		 }
		return -1;
		
	}
*/

/*	
// 7. Search element by binary searching algorithm.
	public static void main (String[] args) {
		int[] ar = {4, 18, 22, 26, 31, 44, 49,53, 84};
		int target = 44;
		System.out.println(SearchIndex(ar, target));
	}
	
	public static int SearchIndex(int[] a, int target) {
		int len = a.length;
		int i = 0;
		int j = len-1;
		 while(i<=j) {
			 int mid  = (i+j)/2;
			 if(a[mid]==target) {
				 return mid;
			 }else if(a[mid]<target) {
				 i=mid+1;
			 }else
				 j = mid-1;
		 }
		return -1;
		
	}
	
*/
	
//	public static void main(String[] args) {
//	int[] ar = { 1, 3, 5, 7 };
//	int[] ar1 = { 2, 4, 6, 8 };
//
//	// output = {1,2,3,4,5,6,7,8};
//
//	int[] s = sort(ar, ar1);
//	for (int i = 0; i < s.length; i++) {
//		System.out.print(s[i] + " ");
//	}
//
//}
//
//public static int[] sort(int[] a, int[] b) {
	
//	int len1 = a.length;
//	int len2 = b.length;
//	int[] newar = new int[len1 + len2];
//	int i = 0;
//	int j = 0;
//	int pot = 0;
//	while (i < len1) {
//		if (a[i] < b[j]) {
//			newar[pot] = a[i];
//			i++;
//			pot++;
//		} 
//		else {
//			newar[pot] = b[j];
//			j++;
//			pot++;
//		}
//	}
//	while (i<len1) {
//		newar[pot] = a[i];
//		i++;
//		pot++;
//	}
//	
//	while (j<len2) {
//		newar[pot] = b[j];
//		j++;
//		pot++;
//	}
//		
//	return newar;
//
//}
	
//Question : Backspace String Compress
	
//	public static void main(String[] args) {
//		char[] a1 = "a#b##".toCharArray();
//		char[] b1 = "a#b##".toCharArray();
//		System.out.println(match(a1).equals(match(b1)));
//	
//	}
//	public static Stack<Character> match(char[] a) {
//		int len1 = a.length;
//		int i = 0;
//		Stack<Character> alist = new Stack<Character>();
//		while (i < len1) {
//			if (a[i] != '#') {
//				alist.push(a[i]);
//			} else {
//				if(!alist.isEmpty()) {
//					alist.pop();
//				}
//			}
//			i++;
//		}
//		return alist;
//	}
	
	
}
