package day6;
import java.util.ArrayList;
import java.util.List;

public class RemoveSecEle 
{

	    public static void removeEverySecondElement(List<Integer> list) {
	        for (int i = 1; i < list.size(); i += 2) {
	            list.remove(i);
	        }
	    }

	    public static void main(String[] args) 
	    {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);
	        numbers.add(60);
	        numbers.add(70);
	        numbers.add(80);
	        numbers.add(90);
	        numbers.add(100);
	        
	        System.out.println("Original List: " + numbers);
	        
	        removeEverySecondElement(numbers);
	        
	        System.out.println("List after removing every second element: " + numbers);
	  }
}
