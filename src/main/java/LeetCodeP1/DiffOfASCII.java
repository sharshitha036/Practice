//You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

package LeetCodeP1;

public class DiffOfASCII {
    public static void main(String[] args) {
        String inputString = "hello";
        System.out.println(scoreOfString(inputString));

    }
    public static int scoreOfString(String s){
        char[] inputChar =s.toCharArray();
        int sum = 0;
        for(int i = 0; i<inputChar.length-1; i++){
            sum += Math.abs(inputChar[i]-inputChar[i+1]);
        }
        return sum;
    }
}
