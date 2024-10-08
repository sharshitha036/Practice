package MultiThreadingP;

//Extends Thread
class Hi extends Thread{
    public void run() {
        for(int i = 0;i<5;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(500);
            }
            catch (Exception e ){
            }
        }
    }
}
class Hello extends Thread{
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(500);
            }
            catch (Exception e ){
            }
        }
    }
}
public class MyThread {
    public static void main(String[] args) {
        Hi first = new Hi();
        Hello second = new Hello();
        first.start();
        second.start();

    }
}
