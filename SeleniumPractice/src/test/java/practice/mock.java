package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class mock {
	public static void main (String[]args) {
		
//		Scanner sc= new Scanner(System.in);
//		int n= 5;
//		fibonacci(n);
//		sc.close();
//	}
//		 
//		public static void fibonacci(int n) {
//			
//			int first= 0;
//			int second= 1;
//			System.out.println(first);
//			if(n>1) {
//			System.out.println(second);
//			}
//			
//		for(int i=2; i<n; i++) {
//			int next= first + second;
//			System.out.println(next);
//	
//		
//		 first= second;
//		 second= next;
//		
//		}
		
//		Scanner sc= new Scanner(System.in);
//		int n= 3;
//		sc.close();
//		largestprime(n);
//	}
//	
//		
//		public static boolean isprime(int num) {
//			if(num<= 1) {
//				return false;
//			}
//			for(int i=2; i*i<= num; i++) {
//				if(num%i == 0) {
//					return false;
//				}
//			}
//			return true;
//		}
//			
//		
//		public static  void largestprime(int n) {
//			int largest= (int) Math.pow(10, n)-1;
//			int smallest= (int) Math.pow(10, n-1);
//			for(int i =largest; i>= smallest; i--) {
//			if(isprime (i)) {
//			  System.out.println(i);
//			  return;
//			
//			}
//				
//	}
//			System.out.println("no prime" + n);
//		}
//}
//		
//		Scanner sc=new Scanner(System.in);
//		int [] n= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//		sc.close();
//		for(int i=1; i<= n.length; i++) {
//			if(i%3 == 0 && i%5 == 0) {
//				System.out.println("FizzBuzz");
//			}else if (i%3 == 0) {
//				System.out.println("Fizz");
//			}else if( i%5  == 0) {
//				System.out.println("Buzz");
//			}else {
//				System.out.println(i);
//			}
//		}
		
//		String s="manish";
//		String reversestring="";
//		for(int i=s.length()-1;i>= 0; i-- ) {
//			reversestring += s.charAt(i);
//			
//		}
//		System.out.println(reversestring);
//		String s="01010101";
//		String binary= rearrange(s);
//		System.out.println(binary);
//		}
//	public static String rearrange(String s) {
//		int count0=0;
//		int count1=0;
//		for(char c: s.toCharArray()) {
//			if(c == '0') {
//				count0++;
//			}else if(c == '1') {
//				count1++;
//			}
//			
//		}
//		StringBuilder rearranged= new StringBuilder();
//		for(int i=0; i<count0; i++) {
//			rearranged.append('0');
//		}for(int i=0; i<count1; i++) {
//			rearranged.append('1');
//	}
//		return rearranged.toString();
		
//		String s= "aaaabbbccd";
//		String compressed= compress(s);
//		System.out.println(compressed);
//	}
//	public static String compress(String s) {
//	if(s.isEmpty()) {
//		return s;
//	}
//	StringBuilder compresseddd= new StringBuilder();
//	char currchar= s.charAt(0);
//	int count= 1;
//	for(int i=1; i<s.length(); i++) {
//		if(s.charAt(i) == currchar ) {
//			count++;
//		}else {
//			compresseddd.append(currchar).append(count);
//			currchar= s.charAt(i);
//			count=1;
//		}
//	}
//	
//	compresseddd.append(currchar).append(count);
//	String compressedresult= compresseddd.toString();
//	if(compressedresult.length()< s.length()) {
//		return compressedresult;
//	}else {
//		return s;
//	}
	
//		String s="helloworld";
//		int result= countvowels(s);
//		System.out.println(result);
//	}
//	public static int countvowels(String s) {
//		Set<Character> vowels= new HashSet<>();
//		vowels.add('a');
//		vowels.add('e');
//		vowels.add('i');
//		vowels.add('o');
//		vowels.add('u');
//		int vowelscount= 0;
//		int consonantcount=0;
//		for(char c: s.toCharArray()) {
//			if(vowels.contains(c)) {
//				vowelscount++;
//			}else {
//				consonantcount++;
//			}
//		}
//		int diff= Math.abs(consonantcount- vowelscount);
//		return diff;
		
//		String s="Manish";
//		int subcount= substring(s);
//		System.out.println(subcount);
//	}
//	public static int substring(String s) {
//		Set<String> substrings= new HashSet<>();
//		for(int i=0; i<s.length(); i++) {
//			for(int  j=i+1; j<s.length(); j++) {
//				String subs= s.substring(i, j);
//				substrings.add(subs);
//				}
//		}
//		return substrings.size();
		
		
		  String s= "hello world";
		  String capitalizedString = capitalizeWords(s);
	        
	        // Print the capitalized string
	        System.out.println(capitalizedString);
	    }

	    // Function to capitalize the first letter of each word in a string
	    public static String capitalizeWords(String s) {
	        // Split the input string into words using space as the delimiter
	        String[] words = s.split(" ");
	        
	        // Create a StringBuilder to store the capitalized words
	        StringBuilder capitalizedString = new StringBuilder();
	        
	        // Iterate through each word in the array
	        for (String word : words) {
	            // Check if the word is not empty
	            if (!word.isEmpty()) {
	                // Capitalize the first letter of the word
	                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
	                
	                // Add the capitalized word to the result, followed by a space
	                capitalizedString.append(capitalizedWord).append(" ");
	            }
	        }
	        
	        // Convert StringBuilder to string and remove the trailing space
	        return capitalizedString.toString().trim();
	    }
	
	}

		
