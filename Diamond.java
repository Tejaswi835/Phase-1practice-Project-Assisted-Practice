package assistedprojects;

public class Diamond {
    public static void main(String[] args) {
        C c= new C();
        c.display();
    }
}
interface A {
	    default void display() {
	        System.out.println("Interface A");
	    }
	}
interface B extends A {
	    default void display() {
	        System.out.println("Interface B");
	    }
}
class C implements B {
	    public void display() {
	    	B.super.display();
	    }
	}





