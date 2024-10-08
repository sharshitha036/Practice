package July26;

public class SwapNums {
    public static void main(String[] args) {
        int inputNum1 = 1234;
        int inputNum2  = 345;
        swap(inputNum1, inputNum2);
    }

    public static void swap(int a, int b){
        int temp = a;
        a= b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
