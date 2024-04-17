package practice;

public class selenium34 {

	 public static void main(String[] args) {
		
	}
		 public static int[] reverseArray(int[] arr) {
		        int left = 0, right = arr.length - 1;
		        while (left < right) {
		            int temp = arr[left];
		            arr[left] = arr[right];
		            arr[right] = temp;
		            left++;
		            right--;
		        }
		        return arr;
		    }
	 }
