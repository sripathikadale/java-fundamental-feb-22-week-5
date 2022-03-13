package march13assignment;

public class usingthrow {

	public static void main(String[] args) {
        int a = 10;
		
		int b = 0;
		
		         try
				{
					System.out.println( a/ b);	
					throw new ArithmeticException("using throw keyword");
				}
				catch(ArithmeticException e)
				{
					System.out.println(e.getMessage());
					System.out.println(e.toString());
					e.printStackTrace();
					
				}
				

		// TODO Auto-generated method stub

	}

}
