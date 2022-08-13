package Arrays_Questions;

public class Median {

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
		//int sum = 0;
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
}
