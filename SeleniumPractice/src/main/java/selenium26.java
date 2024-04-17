import java.util.Scanner;

public class selenium26 {
	
		public static void main (String[]args) {
			int n=5;
			Scanner sc= new Scanner(System.in);
			printfibonacci(n);
			sc.close();
		}
			 
			public static void printfibonacci(int n) {
				
				int first= 0;
				int second= 1;
				System.out.println(first);
				
				System.out.println(second);
				
				
			for(int i=2; i<n; i++) {
				int next= first + second;
				System.out.println(next);
		
			
			 first= second;
			 second= next;
			
			}
			
			
			
		}
	}


