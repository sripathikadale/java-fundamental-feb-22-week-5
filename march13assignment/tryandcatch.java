package march13assignment;

public class tryandcatch {

	public static void main(String[] args) {
		int a = 10;
		
		int b = 0;
		
		         try
				{
					System.out.println( a/ b);	
				}
				catch(ArithmeticException e)
				{
					System.out.println(e.getMessage());
					System.out.println(e.toString());
					
				}
				
		
		// TODO Auto-generated method stub

	}

}
