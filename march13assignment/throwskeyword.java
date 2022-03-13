package march13assignment;

import java.io.IOException;

public class throwskeyword {
	void method()throws ioException
	{
		throw new ioException();
		
	}

	public static void main(String[] args) {
		try
		{
			throwskeyword cl = new throwskeyword();
					cl.method();
		}
		catch(Exception e)
		{
			System.out.println("exeption handled");
		}
		
		System.out.println("continue handling......");
		// TODO Auto-generated method stub

	}
}

