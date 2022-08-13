package Arrays_Questions;

public class TripletSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		boolean tar = Triplet(nums, target);
		System.out.println(tar);
	}
	
	// 1st Approach
	public static boolean Triplet(int[] ar, int sum) {
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
	
	// 2nd Approach
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

}
