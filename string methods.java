public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello World";
		
		System.out.println("String length: " + s.length());
		
		System.out.println("Character at 3rd position: " + s.charAt(3));
		
		System.out.println("Substring: "+s.substring(3));
		
		System.out.println("Substring: "+ s.substring(2, 5));
		
		String s1 = "Hello";
		String s2 = " World";
		System.out.println("Concatenated String: "+ s1.concat(s2));
		
		String s4 = "Learn Share Learn";
		System.out.println("Index of Share " + s4.indexOf("Share"));
		
		System.out.println("Index of a: " + s4.indexOf('a', 3));
		
		Boolean out = "Hello".equals("Worlds");
		System.out.println("Checking Equality: " + out);
		out = "Hello".equals("Hello");
		System.out.println("Checking Equality: " + out);
		
		out = "Hello".equalsIgnoreCase("hEllo");
		System.out.println("Checing Equality: " + out);
		
		int out1 = s1.compareTo(s2);
		System.out.println("If s1 = s2 : " + out);
		
		String word1 = "Hello World" ;
		System.out.println("Changing to lower Case: " + word1.toLowerCase());
		
		String word2 = "Hello World";
		System.out.println("Changing to Upper case: " + word2.toUpperCase());
		
		String word3 = " Learn Share Learn ";
		System.out.println("Trim the word: "+word3.trim());
		
		String str1 = "Hello ";
		System.out.println("Orginal String: "+ str1);
		String str2 = str1.replace(" ", " World");
		System.out.println("Replaced String: " + str2);
		
	}
}
