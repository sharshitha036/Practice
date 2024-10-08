package June9;

import java.util.Scanner;

//Palindrome
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if(isPalindrome(input)){
            System.out.println("Given String is Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }

    private static boolean isPalindrome(String input) {
        String s = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = s.length();

        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) == s.charAt(length - 1-i)) {
                System.out.println("First letter : " + s.charAt(i));
                System.out.println("Nth letter : " + s.charAt(length -1-i));
                return true;
            }
        }
        return false;
    }
}
