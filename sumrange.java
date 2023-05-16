package projects;
import java.util.*;
public class sumrange {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int L = sc.nextInt();
	        int R = sc.nextInt();
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            if (i >= L && i <= R) {
	                sum += arr[i];
	            }
	        }
	
	        System.out.println("Sum of elements in the range of L and R: " + sum);
	    }
}
	

	
