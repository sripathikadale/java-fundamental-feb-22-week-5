package march13assignment;

public class longestrepeatingsequence {
	public static int seq(String str)
	{
		int n = str.length();
		int[][] arr = new int[14][15];
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
         {
	        if(str.charAt(i-1)==str.charAt(j-1) && i!=j)
	        {
	        	arr[i][j] = 1+arr[i-1][j-1];
	        	
	        }
	        else
	        {
	        	arr[i][j] = Math.max(arr[i-1][j-1], arr[i-1][j]);
	        	
	       
         }
		}
			
        }
		return arr[n][n];
		//System.out.println(str);
	}
	

	public static void main(String[] args) {
		String str = "aaabbbsb";
		System.out.println("longest repeating string is :: " +seq(str));
		// TODO Auto-generated method stub

	}

}
