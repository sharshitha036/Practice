package Concepts;

import javafx.animation.ScaleTransition;

public class ExceptionHand {
    public static void main(String[] args) {
        int i = 2;
        Sum b = new Sum();

        try {
            b.add(10,20);
        }
        catch (IllegalArgumentException re){
            System.out.println("Exception Handled");
        }

}
public static class Sum{
    public int add(int a , int b)
    {
        throw new RuntimeException();
    }
    }
}


