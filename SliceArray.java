package day6;
import java.util.Arrays;

public class SliceArray 
{
	public static void main(String args[])
	{
	
	int givenArray[] = {1,2,3,4,5};
	System.out.println(" Given Array is "+Arrays.toString(givenArray));
	int firstIndex = 1, lastIndex =3;
	int sliceArray[] = new int[lastIndex-firstIndex];
	for(int i=0;i<sliceArray.length;i++)
	{
		sliceArray[i] = givenArray[firstIndex+i];
	}
	System.out.println(" Sliced Array is "+Arrays.toString(sliceArray));

	}
}
