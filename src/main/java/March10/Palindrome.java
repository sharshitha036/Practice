package March10;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madammmm";
                char[] ch = s.toCharArray();
        int n = ch.length;

        boolean isPalindrome = true;
        for(int i = 0; i<= n-1;i++)
        {
            if (ch[i] == ch[(n-1)-i]) {

            }
            else {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
        {
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }

    }

}
