package day123;

public class StringOperations 
{
	    public static String extractMiddleSubstring(String str1, String str2, int length) {
	        String concat = str1.concat(str2);
	        String rev = new StringBuilder(concat).reverse().toString();
	        int startIndex = (rev.length() - length) / 2;
	        if (startIndex < 0) {
	            return "Substring length is larger than the concatenated string.";
	        }
	        
	        String middleSubstring = rev.substring(startIndex, startIndex + length);
	        return middleSubstring;
	    }

	    public static void main(String[] args) {
	        String str1 = "Hello";
	        String str2 = "Java";
	        int length = 4;
	        
	        String middleSubstring = extractMiddleSubstring(str1, str2, length);
	        System.out.println("Middle Substring: " + middleSubstring);
	    }
	}