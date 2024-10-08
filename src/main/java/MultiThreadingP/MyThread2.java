package MultiThreadingP;
//sleep, join, isAlive
public class MyThread2 {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("iii");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }
                );
        Thread t2 = new Thread(() ->{
            for(int i = 0; i < 3; i++){
                System.out.println("Hel");
                try{ Thread.sleep(500); } catch (Exception e ){ }
            }
        }
                );

        t1.start();
        try {
            Thread.sleep(500); } catch (Exception e) {  }
        t2.start();

        t1.join();
        t2.join();
        System.out.println(t1.isAlive());

        System.out.println("BYEEEE");
    }
}
