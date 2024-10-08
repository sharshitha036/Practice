package Feb26;

public class Test {
    public static void main(String[] args) {
        //Thread using thread class
        for(int i=0; i<6;i++){
            ExOfThread e = new ExOfThread();
            e.start();

        }

        //Thread using Runnable
        for (int i=1;i<=10;i++) {
            Thread e = new Thread(new ThreadUsingRunnable());
            e.start();
        }
    }
}
