package arrays;

public class BubbleSort 
{

	public static void main(String[] args)
	{
		int a[] = {90,30,40,10,20};
		int temp=0,n=a.length;
		for(int i=0;i<n;i++)
		{
		for(int j=1;j<=(n-i);j++)
	{
			if(a[j-1]>a[j])
			{
				temp = a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			
			}
		}
			System.out.println(" "+a[i]);
		}
			
	}
}


