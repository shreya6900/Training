package day45;

public class DivByZero 
{
	    public static void main(String[] args) {
	        try {
	            int result = divide(10, 0);
	            System.out.println("Result: " + result);
	        } catch (Exception e) {
	            System.out.println("Cannot Divide a number by Zer0"+e.getMessage());
	        }
	    }

	    public static int divide(int dividend, int divisor) {
	        return dividend / divisor;
	    }
	}
