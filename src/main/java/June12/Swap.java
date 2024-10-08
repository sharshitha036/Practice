package June12;

public class Swap {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        swap(a, b);
    }
    public static void swap(int x, int y){
        int temp = x;
        x=y;
        y=temp;
        System.out.println("Value of a is "+ x);
        System.out.println("Value of b is "+ y);
    }
}
