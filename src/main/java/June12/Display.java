package June12;
/**
Java Program to Display Odd Numbers From 1 to 100
*/
public class Display {
    public static void main(String[] args) {
        int inputNum = 100;
        displayOdd(inputNum);
        System.out.println("");
        displayEven(inputNum);
    }
    public static void displayOdd(int x){
        System.out.println("Odd numbers from 1 to 100 are ");
        for(int i =0; i<= x; i++) {
            if (i % 2 != 0) {
                System.out.print( i + " ");
            }
        }
    }
    public static void displayEven(int x){
        System.out.println("Even Numbers from 1 to 100 are");
        for (int i= 0;i<=x;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
