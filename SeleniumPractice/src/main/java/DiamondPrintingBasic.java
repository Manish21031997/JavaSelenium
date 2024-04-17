
	import java.util.*;

	public class DiamondPrintingBasic {
	    // NOTE: Please do not modify this function
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        String[] pattern = diamondPrinting(n);

	        for (int i = 0; i < 2 * n - 1; i++)
	            System.out.println(pattern[i]);

	    static String[] diamondPrinting(int n) {
	        String[] pattern = new String[2 * n - 1];

	        for (int i = 1; i <= n; i++) {
	            String row = " ".repeat(n - i) + "*".repeat(i * 2 - 1);
	            pattern[i - 1] = row;
	        }

	       
	        for (int i = n + 1; i <= 2 * n - 1; i++) {
	            String row = " ".repeat(i - n) + "*".repeat((2 * n - i) * 2 - 1);
	            pattern[i - 1] = row;
	        }

	        return pattern;
	    }
	    }
	}

}

}
