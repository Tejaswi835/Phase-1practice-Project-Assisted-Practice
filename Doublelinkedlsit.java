package projects;

public class Doublelinkedlsit {
	private Node head;
	private static class Node {
	        int data;
	        Node prev;
	        Node next;
	    }
	public void insert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (head == null) {
	            head = newNode;
	        } else {
	            Node currentNode = head;
	            while (currentNode.next != null)
	                currentNode = currentNode.next;
	            currentNode.next = newNode;
	            newNode.prev = currentNode;
	        }
	    }
	public void traverseForward() {
	        Node currentNode = head;
	        while (currentNode != null) {
	            System.out.print(currentNode.data + " ");
	            currentNode = currentNode.next;
	        }
	        System.out.println();
	    }
	public void traverseBackward() {
	        Node currentNode = head;
	        while (currentNode.next != null)
	            currentNode = currentNode.next;

	        while (currentNode != null) {
	            System.out.print(currentNode.data + " ");
	            currentNode = currentNode.prev;
	        }
	        System.out.println();
	    }
	public static void main(String[] args) {
	    	Doublelinkedlsit list = new Doublelinkedlsit();
	    	list.insert(6);
	        list.insert(7);
	        list.insert(8);
	        list.insert(9);
	        list.insert(10);
	        System.out.println("Traversing forward:");
	        list.traverseForward();
	        System.out.println("Traversing backward:");
	        list.traverseBackward();
	    }
	}


