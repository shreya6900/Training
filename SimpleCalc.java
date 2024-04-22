package com;
public class SimpleCalc {

	public static void main(String[] args) 
	{
		System.out.println(args[0]+" "+ args[1]+" "+ args[2]);
		int first = Integer.valueOf(args[0]);
		int sec = Integer.valueOf(args[1]);
		int third = Integer.valueOf(args[2]);
		System.out.println(args[2]);
		int sum = first +sec+third;
		System.out.println(sum);
		int sub = first - third;
		System.out.println(sub);
		int mul = first *sec*third;
		System.out.println(mul);
		int div = third/sec;
		System.out.println(div);
		int a=45;
		int b=9;
		int result;
		char operator ='/';
		switch(operator)
		{
		case '+':
			result = a+b;
			System.out.println(result);
			break;
		case '-':
			result = a-b;
			System.out.println(result);
			break;
		case '*':
			result = a*b;
			System.out.println(result);
			break;
		case '/':
			result = a/b;
			System.out.println(result);
			break;
		default:
			System.out.println(" Invalid Operator");
		}
	}
}