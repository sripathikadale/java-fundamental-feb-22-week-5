package march13assignment;

public class matrix2d {

	public static void main(String[] args) {
		int [][]arr1 = {{1,2,3},{4,5,6},{6,7,8}};
		int [][]arr2 = {{1,2,3},{4,5,6},{6,7,8}};
		int rows=3,columns=3;
		
		int[][] sum = new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("sum of two matrices ::");
		for(int[]row :sum)
		{
			for(int column:row)
			{
				System.out.print(column + " " );
			}
			System.out.println();
		}

		// TODO Auto-generated method stub

	}

}
