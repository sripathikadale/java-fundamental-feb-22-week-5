package march13assignment;

public class sparsematrix {

	public static void main(String[] args) {
		int rows =0,columns=0,size=0,count=0;
		int [][]arr = {{1,0,0},{0,5,0},{0,0,8}};
		rows=arr.length;
		columns=arr[0].length;
		size=rows*columns;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(arr[i][j]==0)
					count++;
			}
		}
		if(count>(size/2))
		{
			System.out.println("given matrix is a sparx matrix");
		}
		else
		{
			System.out.println("given matrix is not a sparx matrix");
		}
		// TODO Auto-generated method stub

	}

}
