package exceptions;

public class FirstExcep {

	public static void main(String[] args) 
	{
		try
		{
			int a[] = {3,5,7};
			System.out.println(a[3]);
			String str = "Hello World";
			System.out.println(str.length());
			int res = 4/0;
			System.out.println(res);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of bound index " +e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println(" Cannot print the length of the array" +e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println(" Cannot divide a number by zero" +e.getMessage());
		}
		finally
		{
			System.out.println(" This is finally block");
		}
		}
	}


		
		
			
			
		
