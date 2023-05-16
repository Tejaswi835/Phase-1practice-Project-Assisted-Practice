package projects;
import java.util.*;
public class Queue {
	    public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();
	        stack.push(5);
	        stack.push(6);
	        stack.push(7);
	        stack.push(8);
	        stack.push(9);
	        System.out.println("Stack: " + stack);
	        int removedElement = stack.pop();
	        System.out.println("Removed: " + removedElement);
	        System.out.println("after : " + stack);
	        int topElement = stack.peek();
	        System.out.println("Top: " + topElement);
	        System.out.println("after: " + stack);
	        boolean isEmpty = stack.isEmpty();
	        System.out.println("Is stack empty? " + isEmpty);
	        int size = stack.size();
	        System.out.println("Size: " + size);
	    }
	}


