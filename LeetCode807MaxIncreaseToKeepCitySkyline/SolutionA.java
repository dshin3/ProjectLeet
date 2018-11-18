public class SolutionA
{
       //See Leet code problem 807 for more information.
       //Time complexity is O(a*b) where a and b are the dimensions of the grid.
       //The memory complexity is O(a) + O(b) where a and b are the length of the dimensions of the grid.

	public static int maxIncreaseKeepingSkyline(int[][] grid) {
		int[] rowMaxArray = new int[grid.length];
		int[] colMaxArray = new int[grid[0].length];
		int sum =0;
		int minVal = 0;
		//Compute the maximum int value for West and East
		for(int i = 0;i<grid.length;i++)
		{
			int rowMax = 0;
			for(int j=0;j<grid[0].length;j++)
			{
				if(grid[i][j] > rowMax)
				{
					rowMax = grid[i][j];
				}
			}
			rowMaxArray[i] = rowMax;
		}
		
		//Compute the maximum int value for North and South
		for(int a = 0;a<grid.length;a++)
		{
			int colMax = 0;
			for(int b = 0;b<grid[0].length;b++)
			{
				if(grid[b][a]>colMax)
				{
					colMax = grid[b][a];
				}
				colMaxArray[a]=colMax;
			}
		}
		
	        //going through the grid again and computing the additional height differentials and 
                //adding it to sum.	
		for(int c =0;c<grid.length;c++)
		{
			for(int d =0;d<grid[0].length;d++)
			{
                               //Used minimum function to get the lesser of the two numbers.
				minVal = Math.min(rowMaxArray[c], colMaxArray[d]);
				if(grid[c][d]< minVal)
				{
					sum += minVal - grid[c][d];
				}
			}
		}
		return sum;
    }

    public static void main(String[] args)
	{
		int[][] grid = new int[][]{
				{3,0,8,4},
				{2,4,5,7},
				{9,2,6,3},
				{0,3,1,0}
		};

		int ans = maxIncreaseKeepingSkyline(grid);
		System.out.println(ans);

	}
}


