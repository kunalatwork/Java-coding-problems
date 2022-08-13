package Arrays_Questions;

public class TwoSum {

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

}
