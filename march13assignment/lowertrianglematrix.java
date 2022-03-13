package march13assignment;

public class lowertrianglematrix {

	public static void main(String[] args) {
int arr[][] ={{1,2,3},{4,5,6},{6,7,8}};
		
		for(int i = 0; i < arr.length; i++) 
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(j<=i) 
				{
					System.out.print(arr[i][j] +" ");
				}
			}
			System.out.println();
			
		}
		
		


		// TODO Auto-generated method stub

	}

}
