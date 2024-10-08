package Feb26;

public class ThreadUsingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Implementing using Runnable Interface method " + Thread.currentThread().getId()
                + " is running");
    }

}
