package march13assignment;

public class swap2strings {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "world";
		System.out.println("strings before swapping :: "+str1 +" "+str2);
		str1 = str1+str2;
		str2 =str1.substring(0,(str1.length()-str2.length()));
		str1 = str1.substring(str2.length());
		System.out.println("after swapping :: "+str1+" "+str2);
		

	}

}
