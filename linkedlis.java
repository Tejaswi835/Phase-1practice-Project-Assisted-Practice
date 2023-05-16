package projects;

public class linkedlis {
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
	        } else {
	            Node currentNode = head;
	            while (currentNode.next != null)
	                currentNode = currentNode.next;
	            currentNode.next = newNode;
	        }
	    }
	    public void delete(int key) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        if (head.data == key) {
	            head = head.next;
	            return;
	        }
	        Node currentNode = head;
	        while (currentNode.next != null && currentNode.next.data != key)
	            currentNode = currentNode.next;
	        if (currentNode.next == null) {
	            System.out.println("Key not found in the list");
	            return;
	        }
	        currentNode.next = currentNode.next.next;
	    }
	    public void display() {
	        Node currentNode = head;
	        while (currentNode != null) {
	            System.out.print(currentNode.data + " ");
	            currentNode = currentNode.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	linkedlis lis = new linkedlis();
	        lis.insert(9);
	        lis.insert(4);
	        lis.insert(8);

	        System.out.println("Original List:");
	        lis.display();

	        int key = 8;
	        lis.delete(key);

	        System.out.println("List after deleting " + key + ":");
	        lis.display();
	    }
	}



