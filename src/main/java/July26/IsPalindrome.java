package July26;

public class IsPalindrome {

     static boolean isPalindrome(String expr) {
         boolean valid = true;
         char[] charExpr = expr.toCharArray();
         for (int i = 0; i < charExpr.length / 2; i++)
         {
             if (charExpr[i] == charExpr[charExpr.length - 1 - i])
             {
                 valid = true;
             }
             else {
                 valid = false;
             }
         }
         return valid;
     }
    public static void main(String[] args) {
        String s = "MADAM";
        if(isPalindrome(s))
        {
            System.out.println("given string is a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
     }
}


