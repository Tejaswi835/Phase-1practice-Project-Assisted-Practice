package assistedprojects;

public class Trycatch {
	public static void main(String[] args) {
	        int[] numbers = { 8,9,10,55,88 };
	        int index = 8;
	        try {
	            int result = numbers[index];
	            System.out.println("Value at index " + index + ": " + result);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index is out of bounds.");
	        }
	        System.out.println("continues");
	    }
	}



