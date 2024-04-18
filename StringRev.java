package strings;

public class StringRev {

	public static void main(String[] args) 
	{
		String s = "This is java class";
		for(int i=s.length();i>0;i--)
		{
			System.out.print(s.charAt(i-1));
		}
		

	}

}
