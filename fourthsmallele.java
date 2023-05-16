package projects;
import java.util.*;
public class fourthsmallele {
	    public static void main(String[] args) {
	        int[] arr = {2,7,8,45};
	        int fourthSmallest = findFourthSmallest(arr);
	        System.out.println(fourthSmallest);
	    }
	    public static int findFourthSmallest(int[] arr) {
	        if (arr.length < 4) {
	            System.out.println("List has less than four elements.");
	            return -1;
	        }
	        Arrays.sort(arr);
	        return arr[3];
	    }
	}


