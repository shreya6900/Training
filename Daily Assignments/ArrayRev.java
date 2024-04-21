package day123;

public class ArrayRev 
{
	    public static void main(String[] args) {
	        int[] n = new int[10]; 
	        for (int i = 0; i < n.length; i++) {
	            n[i] = i + 1;
	        }
	        
	        System.out.println("Original array:");
	        printArray(n);
	        System.out.println("\nArray in reverse order:");
	        printReverseArray(n);
	    }
	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	    public static void printReverseArray(int[] arr) {
	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
}
