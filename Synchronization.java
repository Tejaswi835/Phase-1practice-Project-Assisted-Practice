package assistedprojects;
public class Synchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread incrementThread = new Thread(counter::increment);
        Thread decrementThread = new Thread(counter::decrement);

        incrementThread.start();
        decrementThread.start();
    }
}
class Counter {
	    private int count = 0;

	    public synchronized void increment() {
	        count++;
	        System.out.println("Increment:" + count);
	    }

	    public synchronized void decrement() {
	        count--;
	        System.out.println("Decrement:" + count);
	    }
	}

	
