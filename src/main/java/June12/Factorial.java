package June12;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial");
        int inputNumber = scanner.nextInt();
        factorial(inputNumber);
    }

    public static void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
              fact = fact*i;
        }
        System.out.println("Factorial of "+ n + " is "+ fact);
    }
}
