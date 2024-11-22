package Sheet9;

class q2 implements Runnable {
    // Constructor of the class
    q2() {
        // Create and start the thread
        Thread thread = new Thread(this); // Passing 'this' as it implements Runnable
        thread.start();
    }

    // Overriding the run() method
    @Override
    public void run() {
        System.out.println("Thread is running! Executed by: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Main thread starts.");
        // Creating an instance of MyRunnable starts the thread
        q2 myRunnable = new q2();
        System.out.println("Main thread ends.");
    }
}

