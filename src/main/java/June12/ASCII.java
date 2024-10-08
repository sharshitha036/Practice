package June12;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character:");
        char ch = scanner.next().charAt(0);
        int asciiValue = ch;
        System.out.println(asciiValue + "is the ASCII value of given character");
    }
}
