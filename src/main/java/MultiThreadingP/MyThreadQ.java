package MultiThreadingP;
//Implements Runnable
class Hii implements Runnable{
    public void run() {
        for(int i = 0;i<5;i++){
            System.out.println("Hiiii");
            try{
                Thread.sleep(500);
            }
            catch (Exception e ){
            }
        }
    }
}
class Hell implements Runnable{
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("Hell");
            try{
                Thread.sleep(500);
            }
            catch (Exception e ){
            }
        }
    }
}
public class MyThreadQ {
    public static void main(String[] args) {
        Runnable first = new Hii();
        Runnable second = new Hell();

        Thread t1 = new Thread(first);
        Thread t2 = new Thread(second);

        t1.start();
        t2.start();

    }
}
