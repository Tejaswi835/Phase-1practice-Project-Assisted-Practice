package Arithmeticcalculator;
import java.util.*;
public class ArithmeticCalculator {
public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	       double numb1 = sc.nextDouble();
	       System.out.print("Enter the second number: ");
	        double  numb2 = sc.nextDouble();
	        System.out.print("Enter the operator (+, -, *, /): ");
	        char operator = sc.next().charAt(0);
	        double result;
	        switch(operator) {
	            case '+':
	                result = numb1 + numb2;
	                break;
	            case '-':
	                result = numb1 - numb2;
	                break;
	            case '*':
	                result = numb1 * numb2;
	                break;
	            case '/':
	                result = numb1 / numb2;
	                break;
	            default:
	                System.out.println("Error");
	                return;
	        }

	        System.out.println(numb1 + " " + operator + " " + numb2 + " = " + result);
	    }
	}
