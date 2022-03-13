package march13assignment;

public class smallandlargepallindromeinstring {
	public static boolean pallindrome(String str)
	{
		boolean value =true;
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				value = false;
				break;
			}
		}
		return value;
	}

	public static void main(String[] args) {
		String str = "wow its a madam";
		String smallpallindrome =" ";
		String largepallindrome =" ";
		String []words=new String[30];
		String word =" ";
		int temp=0;
		int count=0;
		String string = str.toLowerCase();
		string = string+" ";
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ');
			{
				word = word+ string.charAt(i);
			}
			else
			{
				words[temp]=word;
				temp++;
				word= " ";
			}
		}
		for(int i=0;i<temp;i++)
		{
			if(pallindrome(words[i]))
			{
				smallpallindrome=largepallindrome=words[i];
			}
			else
			{
				if(smallpallindrome.length()>words[i].length())
				{
					smallpallindrome=words[i];
			}
				if(largepallindrome.length()<words[i].length())
				{
					largepallindrome=words[i];
				}
					
				}
		}
		if(count==0)
		{
			System.out.println("no pallindrome");
		}
		else
		{
			System.out.println("small pallindrome is :: "+smallpallindrome);
			System.out.println("large pallindrome is :: "+largepallindrome);
		}
		
		
		// TODO Auto-generated method stub

	}

}
