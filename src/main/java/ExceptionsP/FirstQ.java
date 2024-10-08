package ExceptionsP;

public class FirstQ {
    public static void main(String[] args) {
        int i = 8;
        int j = 2;
        int a[] = new int[5];
        try {
            int k = i / j;
            int x =1;
            for (int value :a){
                value = x;
                x++;
                System.out.println(value);
            }
            for(int q = 0; q<5;q++){
                a[q] = q+1;
                System.out.println("a[q]" + a[q]);
            }
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
        catch (ArrayIndexOutOfBoundsException f){
            System.out.println("Maximum Size is 5");
        }
        catch (Exception e){
            System.out.println("Unknown Exception");
        }
    }
}
