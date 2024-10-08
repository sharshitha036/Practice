package ExceptionsP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondQ {
    public static void main(String[] args) {
        int i = 10, j =0,k=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter a number :");
            j = Integer.parseInt(br.readLine());
            k = i/j;
            System.out.println("Output is :" + k);
        }
        catch (IOException e){
            System.out.println("Nothing");
        }
        catch (ArithmeticException e){
            System.out.println("Zero is not a valid number here" + e);
        }
        finally{
            System.out.println("You have successfully completed executing the program");
        }
    }
}
