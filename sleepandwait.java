package assistedprojects;

public class sleepandwait {
public static void main(String[] args) {
	        final Object lock = new Object();
	        Thread thread1 = new Thread(() -> {
	            synchronized (lock) {
	                System.out.println("Thread 1:lock");
	                try {
	                    Thread.sleep(7000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }

	                System.out.println("Thread 1: lock");
	            }
	        });
	        Thread thread2 = new Thread(() -> {
	            synchronized (lock) {
	                System.out.println("Thread 2:lock");

	                try {
	                    lock.wait();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                System.out.println("Thread 2 :lock");
	            }
	        }
	        );
	        thread1.start();
	        thread2.start();
	    }
	}


