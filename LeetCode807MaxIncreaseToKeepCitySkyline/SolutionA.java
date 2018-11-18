public class SolutionA
{

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
		
		
		//System.out.println("RowMax:\n");
		for(int k = 0;k<grid.length;k++)
		{
			//System.out.println(rowMaxArray[k]);
		}
		
		//System.out.println("colMax:\n");
		for(int k = 0;k<grid.length;k++)
		{
			//System.out.println(colMaxArray[k]);
		}
		
		for(int c =0;c<grid.length;c++)
		{
			for(int d =0;d<grid[0].length;d++)
			{
				minVal = Math.min(rowMaxArray[c], colMaxArray[d]);
				if(grid[c][d]< minVal)
				{
					sum += minVal - grid[c][d];
					//System.out.print("sum: "+sum+"\n");
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


