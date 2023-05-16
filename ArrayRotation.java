package projects;

public class ArrayRotation {
	    public static void main(String[] args) {
	        int[] arr = {11, 12, 13, 14, 15, 16};
	        int steps = 5;
	        printArray(arr);
	        rightRotateArray(arr, steps);
	        System.out.println("Array after right rotation:");
	        printArray(arr);
	    }
	    public static void rightRotateArray(int[] arr, int steps) {
	        int length = arr.length;
	        int[] temp = new int[length];
	        for (int i = 0; i < length; i++) {
	            int newIndex = (i + steps) % length;
	            temp[newIndex] = arr[i];
	        }
	        for (int i = 0; i < length; i++) {
	            arr[i] = temp[i];
	        }
	    }
	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
}

