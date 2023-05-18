package projects;

public class BinarySearch {
	public static int binarySearch(int[] arr, int key) {
	        int left = 0;
	        int right = arr.length - 1;
	        while (left <= right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] == key) {
	                return mid;
	            }
	            if (arr[mid] < key) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return -1; 
	}
	public static void main(String[] args) {
	        int[] arr = {3,4,5,6,7,8};
	        int key = 5;
	        int index = binarySearch(arr, key);
	        if (index != -1) {
	            System.out.println(index);
	        } else {
	            System.out.println("Element not found");
	        }
	    }
	}


