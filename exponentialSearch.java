package projects;

public class exponentialSearch {
	public static int exponentialsearch(int[] arr, int key) {
	        if (arr[0] == key) {
	            return 0;
	        }
	        int n = arr.length;
	        int i = 1;
	        while (i < n && arr[i] <=key) {
	            i *= 2;
	        }
	        return binarySearch(arr, key, i / 2, Math.min(i, n - 1));
	    }
	public static int binarySearch(int[] arr, int key, int left, int right) {
	        while (left <= right) {
	            int mid = left + (right - left) / 2;

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
	        int[] arr = {5,6,7,9};
	        int key = 9;
	        int index = exponentialsearch(arr, key);
	        if (index != -1) {
	            System.out.println(index);
	        } else {
	            System.out.println("Element not found");
	        }
	    }
	}


