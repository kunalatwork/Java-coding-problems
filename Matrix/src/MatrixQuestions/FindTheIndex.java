package MatrixQuestions;

public class FindTheIndex {
	
	// 1st approach	
	public static void main(String[] args) {
		int[][] ar = { { 4, 6, 8 }, 
				       { 9, 14, 16 }, 
				       { 17, 19, 21 }, 
				       {22, 25, 29} };
		// index = {2,2};
		
		int len = ar.length;
		int target = 21;
		SearchIndex(ar, target, len);
		Search(ar, target);
	}
		
	public static void SearchIndex(int[][] ar, int target, int len) {
		for(int i=0; i<len-1; i++) {
			for(int j=0; j<len-1; j++) {
				if(ar[i][j] == target)
				{
					System.out.println(i +","+j);
				}
			}
		}
	
	}	

	 
	//2nd Approach
	public static boolean Search(int[][] a, int target) {
		int i=0;
		int j=a[0].length-1;
		while(i<a.length) 
		{
			if(a[i][j]==target) {
				System.out.println(i + ","+j);
				return true;
			}
			
			if(a[i][j]<target) {
				i++;
			}
			else
			{
				j--;
			}
		}
		System.out.println("false");
		return false;
		
	}

}
