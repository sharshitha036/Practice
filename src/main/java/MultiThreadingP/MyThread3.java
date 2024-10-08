package MultiThreadingP;
/*
* setName, getName, Thread Priority(getPriority and setPriority*/
public class MyThread3 {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Holaaa");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }
        );
        Thread t2 = new Thread(() ->{
            for(int i = 0; i < 3; i++){
                System.out.println("Helloooo");
                try{ Thread.sleep(500); } catch (Exception e ){ }
            }
        }
        );
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t2.setPriority(3);
        System.out.println(t2.getPriority());
        System.out.println(t1.getName());
        t1.setName("Thread-Hola");
        System.out.println(t1.getName());

        t1.start();
        try {
            Thread.sleep(500); } catch (Exception e) {  }
        t2.start();
        System.out.println("BYEEEE");
    }
}
