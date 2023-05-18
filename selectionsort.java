package projects;

public class selectionsort {
	    public static void selectionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int temp = arr[i];
	            arr[i] = arr[minIndex];
	            arr[minIndex] = temp;
	        }
	    }
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 8, 4, 1};
	        printArray(arr);
	        selectionSort(arr);
	        printArray(arr);
	    }
	    public static void printArray(int[] arr) {
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	}

	
