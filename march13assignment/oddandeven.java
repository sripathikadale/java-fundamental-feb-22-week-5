package march13assignment;

public class oddandeven {

	public static void main(String[] args) {
		int [][]arr = {{1,2},{4,5}};
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=1;j<arr.length;j++)
			{
			if(i%2==0 && j%2==0)
			{
				System.out.println("even elements ::"+ arr[i][j]);
			}
			else
			{
				System.out.print("odd elements ::" +arr[i][j]);
			}
	
		}
		
			
			
			}
			

		

	}

}
