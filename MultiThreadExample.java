// Custom thread class extending Thread
class MyThread extends Thread {
    private String threadName;

    // Constructor to assign thread name
    MyThread(String name) {
        this.threadName = name;
    }

    // Override run() method to define the task
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running iteration " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
        System.out.println(threadName + " has completed execution.");
    }
}

// Main class to run multiple threads
public class MultiThreadExample {
    public static void main(String[] args) {
        // Create three threads
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
