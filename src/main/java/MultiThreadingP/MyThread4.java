package MultiThreadingP;

//Synchronized keyword

class Counter{
    int count;
    public synchronized void increment() {
        count++;
    }
}


public class MyThread4 {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
     /*   Thread t1 = new Thread(() -> {
            for (int i =1; i<=1000;i++)
            {
                c.increment();
            }
        });*/
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =1; i<=10000;i++)
                {
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =1; i<=10000;i++)
                {
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count " + c.count);


    }
}
