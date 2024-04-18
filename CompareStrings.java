package strings;

public class CompareStrings {

	public static void main(String[] args)
	{
		String s = "Shreya";
		s.concat("Swetha");
		System.out.println(s.concat(" Swetha"));
		System.out.println(s);
		String s1 = "Chocolates";
		String s2 = "Chocolates";
		String s3 = new String("Chocolates");
		String s4 = new String("Nestle");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		String s5 = "Alex";
		String s6 = "Martin";
		String s7 = new String("Martin");
		String s8 = "Alex";
		System.out.println(s5.compareTo(s6));
		System.out.println(s5.compareTo(s7));
		System.out.println(s6.compareTo(s7));
		System.out.println(s5.compareTo(s8));
		StringBuilder sb = new StringBuilder("Hello, ");
		sb.append("Welcome to java Class");
		System.out.println(sb);
		StringBuffer sbf = new StringBuffer("Good");
		sbf.append("Evening");
		System.out.println(sbf);
		

	}

}
