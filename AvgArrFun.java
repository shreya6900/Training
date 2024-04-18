package arrays;

public class AvgArrFun 
{

	public static void main(String[] args)
	{
		int a[] = {10,90,50};
		int x = find_avg(a);
		System.out.println("Avg value is"+x);

	}
	public static int find_avg(int [] a)
	{
		int sum =0;
		for(int i=0;i<a.length;i++)
			{
			sum = sum +a[i];
			}
		System.out.println(sum);
		int avg = sum/(a.length);
return avg;
	}

}
