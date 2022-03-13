package march13assignment;

public class nestedtry {

	public static void main(String[] args) {
		int a = 10;
		
		int b = 0;
		
		         try
				{
		        	 try
		        	 {
		        		 System.out.println( a/ b);
		        	 }
		        	 catch(ArithmeticException ae)
		        	 {
		        		 System.out.println(ae.getMessage()); 
		        		 System.out.println(ae.toString());
		        	 }
						
				}
				catch(Exception e)
				{
					System.out.println("exception occured"); 
				}
					
					
				}
				
		
		// TODO Auto-generated method stub

	}


