package July26;

/** LengthOfLongestSubstring without repeating character*/
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstringWindow {
    public static void main(String[] args) {
        String inputString = "aabcadef";
        int n = inputString.length();
        LengthOfLongestSubstringWindow.LengthOfLongestSubstringWindow(inputString,n);
    }
    static int LengthOfLongestSubstringWindow(String s, int n){
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left =0;

        for(int right = 0; right<n ;right++){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            }
            else{
                while(charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        System.out.println(maxLength);

        return maxLength;
    }
}
