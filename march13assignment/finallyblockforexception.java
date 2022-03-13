package march13assignment;


public class finallyblockforexception{
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
			finally
			{
				System.out.println("hii");
				
			}
			
		}
		
			

		// TODO Auto-generated method stub

	}


