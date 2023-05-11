package assistedprojects;
public class Threads {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
class MyThread extends Thread implements Runnable {
 public void run() {
        System.out.println("extending Thread ,implementing Runnable");
    }
}

	