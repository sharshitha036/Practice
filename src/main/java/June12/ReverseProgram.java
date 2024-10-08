package June12;

import java.util.Scanner;

public class ReverseProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String GivenString = scanner.next();
        reverse(GivenString);
        reverseNum(545454L);
    }
    public static void reverse(String str){
        System.out.println("Given string is " + str);
        char inputArray[] = str.toCharArray();

        for(int i=0; i<=(inputArray.length-1)/2;i++){
            char temp = inputArray[i];
            inputArray[i]=inputArray[inputArray.length-1-i];
            inputArray[inputArray.length-1-i] = temp;
        }
        System.out.println(inputArray);
    }
    public static void reverseNum(Long num){
        System.out.println("Given number is " + num);
        String inputNum = Integer.toString(Math.toIntExact(num));
        char inputNumber[] = inputNum.toCharArray();
        System.out.println(inputNumber.length);

        for(int i=0; i<=(inputNumber.length-1)/2;i++){
            char temp = inputNumber[i];
            inputNumber[i]=inputNumber[inputNumber.length-1-i];
            inputNumber[inputNumber.length-1-i] = temp;
        }
        System.out.println(inputNumber);
    }
}
