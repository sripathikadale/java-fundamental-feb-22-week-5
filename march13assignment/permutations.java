package march13assignment;

public class permutations {
	public static void  permutation(String str,int a,int b)
	{
		if(a==b)
		{
			System.out.println(str);
			
		}
		else
		{
			for(int i=a;i<=b;i++)
			{
				str = swap(str,a,i);
				permutation(str,a+1,b);
				str = swap(str,a,i);
			}
		}
		
	}
	
	
	

	
	public static String swap(String str, int s, int e) {
		{
			char temp;
			char[] charArray = str.toCharArray();
			temp =charArray[s];
			charArray[s] = charArray[e];
			charArray[e] =temp;
			return String.valueOf(charArray);
		}
	
	}





	

	public static void main(String[] args) {
		String str ="abc";
		int length = str.length();
		System.out.println("permutations are ::");
		permutations permutation = new permutations();
		permutations.permutation(str,0,length-1);
		
		// TODO Auto-generated method stub

	}

}
