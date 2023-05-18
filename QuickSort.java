package projects;
import java.util.*;
public class QuickSort {
	    public static void quickSort(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            return; 
	        }
	        int left = 0;
	        int right = arr.length - 1;
	        quickSortt(arr, left, right);
	    }
	    private static void quickSortt(int[] arr, int left, int right) {
	        if (left >= right) {
	            return; 
	        }
	        int pivotIndex = partition(arr, left, right); 
	        quickSortt(arr, left, pivotIndex - 1);
	        quickSortt(arr, pivotIndex + 1, right); 
	    }
	    private static int partition(int[] arr, int left, int right) {
	        int pivot = arr[right]; 
	        int i = left - 1;

	        for (int j = left; j < right; j++) {
	            if (arr[j] <= pivot) {
	                i++;
	                swap(arr, i, j);
	            }
	        }
	        swap(arr, i + 1, right);
	        return i + 1;
	    }
	    private static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 9, 1, 7, 6};
	        System.out.println(Arrays.toString(arr));
	        quickSort(arr);
	        System.out.println("Sorted array: " + Arrays.toString(arr));
	    }
	}


