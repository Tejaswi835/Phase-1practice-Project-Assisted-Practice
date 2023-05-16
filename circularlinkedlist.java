package projects;
public class circularlinkedlist {
	    private Node head;
	    private static class Node {
	        int data;
	        Node next;
	    }
	    public void insert(int data) {
	        Node newNode = new Node();
	        newNode.data = data;
	        if (head == null) {
	            head = newNode;
	            newNode.next = head;
	        } else {
	            Node currentNode = head;
	            while (currentNode.next != head && data > currentNode.next.data)
	                currentNode = currentNode.next;
	            newNode.next = currentNode.next;
	            currentNode.next = newNode;
	        }
	    }
	    public void display() {
	        if (head == null) {
	            System.out.println("Circular linked list is empty");
	            return;
	        }
	        Node currentNode = head;
	        do {
	            System.out.print(currentNode.data + " ");
	            currentNode = currentNode.next;
	        } while (currentNode != head);
	        System.out.println();
	    }
	    public static void main(String[] args) {
	    	circularlinkedlist List = new circularlinkedlist();
	    	List.insert(10);
	        List.insert(20);
	        List.insert(30);
	        List.insert(40);
	        List.insert(50);
	        System.out.println("Circular Linked List:");
	        List.display();
	    }
	}


