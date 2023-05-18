package projects;

public class InsertionSort {
	    public static void insertionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; i++) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            arr[j + 1] = key;
	        }
	    }
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 8, 4, 1};
	        printArray(arr);
	        insertionSort(arr);
	        System.out.println("Array after sorting:");
	        printArray(arr);
	    }
	    public static void printArray(int[] arr) {
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	}

