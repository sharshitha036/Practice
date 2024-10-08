package Feb26;

public class ExOfThread extends Thread{
    public void run(){
        System.out.println("Example of Thread Class " + Thread.currentThread().getId() +" is running" );
    }
}
