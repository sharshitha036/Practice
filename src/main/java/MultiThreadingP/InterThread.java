package MultiThreadingP;
class Aa{
    int num;
    boolean valueSet = false;
    public synchronized void put(int num){
        while (valueSet) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Put : " +num);
        this.num = num;
        valueSet = true;
        notify();
    }
    public synchronized void get() {
        while (!valueSet){try {
            wait();
        } catch (Exception e) {
        }
        }
        System.out.println("get : " + num);
        valueSet = false;
        notify();
    }
}
class Producer implements Runnable{
    Aa a;

    public Producer(Aa a) {
        this.a = a;
        Thread t = new Thread(this,"Producer");
        t.start();
    }
    @Override
    public void run() {
    int i =0;
    while (true)
        {
        a.put(i++);
        try{ Thread.sleep(500); } catch(Exception e){ }
        }
    }
}

class Consumer implements Runnable{
    Aa a;
    public Consumer(Aa a){
        this.a = a;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }
    public void run()
    {
        while (true)
        {
            a.get();
            try { Thread.sleep(5000); } catch (Exception e) { }
        }
    }
}
public class InterThread {
    public static void main(String[] args) {
     Aa a = new Aa();
     new Producer(a);
     new Consumer(a);
    }
}