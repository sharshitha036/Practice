package ExceptionsP;

public class FourthQ {
    public static void main(String[] args) {
        int i = 2;
        try {
            if (i < 5) {
                throw new MyException("Errrorrrr");
            }
        }
            catch(Exception e){
                System.out.println(e);
            }
    }
}

class MyException extends Exception{
    public  MyException(String msg){
        super(msg);
    }
}
