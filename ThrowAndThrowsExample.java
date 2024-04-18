package exceptions;

import java.io.IOException;

public class ThrowAndThrowsExample
{
	public static void checkAge(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException(" Underage person cannot be processed");
		}
		else
		{
			System.out.println(" Valid age");
		}
		
	}
	public static void readFile() throws IOException
	{
	throw new IOException(" File not found");	
	}

	

	public static void main(String[] args) 
	{
		try
		{
			checkAge(5);
		}

	catch (Exception e)
	{
		System.out.println(" Exception is caught" +e.getMessage());

	}
		try {
			readFile();
		}
		catch (Exception e)
		{
			System.out.println("Exception found" +e.getMessage());
		}
	}
}

