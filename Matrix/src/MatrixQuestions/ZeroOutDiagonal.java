package MatrixQuestions;

public class ZeroOutDiagonal {
	public static void main(String[] args) {
		int[][] ar = {{1, 2, 3,},
				      {4, 5, 6},
				      {7, 8, 9}};
		int[][] a1 = {{0, 3, 5, 6, 0},
		          {3, 0, 3, 0, 1},
		          {1, 2, 0, 4, 5},
		          {7, 0, 2, 0, 6},
		          {0, 1, 5, 3, 0}};

		int[][] Input = {{ 1 ,2 ,3 ,4},
	            {4, 5, 6, 5},
	            {7 ,8 ,9 ,5},
	            {4, 6, 8, 3}};


		int[][] a = FirstZeroOut(Input);
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 1st Approach
	 
	 public static int[][] FirstZeroOut(int[][] a) {
			int row = a.length;
		int col = a[0].length;
		int i = 0;
		int j=col-1;
		int k=0;
		while (i < row) {
			if (k != j) {
				a[i][k] = 0;
				k++;
				a[i][j]=0;
				j--;
			} 
			else {
				a[i][k] = 0;
				k--;
				a[i][j] = 0;
				j++;
			}
			i++;
		}
		return a;
	}

	// 2nd Approach
	 
	 	public static int[][] SecondZeroOut(int[][] a) {
	 		int row = a.length-1;
			int col = a[0].length;

			for(int i=0; i<a.length; i++) {
				a[i][i]=0;
			}

			int i=0;
			for(int j=a[0].length-1; j>=0; j--) {
				a[i][j]=0;
				i++;
			}
			
			return a;
		}
}
