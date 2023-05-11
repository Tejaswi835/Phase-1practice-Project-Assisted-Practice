package assistedprojects;

public class Exceptionalhandle {
	public static void main(String[] args) {
	        try {
	            int result = divide(10, 0);
	            System.out.println(result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed");
	        } finally {
	            System.out.println("Finally block is executed.");
	        }

	        System.out.println("continues");
	    }
	public static int divide(int dividend, int divisor) {
	        return dividend / divisor;
	    }
	}



