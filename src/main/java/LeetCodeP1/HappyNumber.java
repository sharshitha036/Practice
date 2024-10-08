package LeetCodeP1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//19,82,68,100,1
//24, 20, 4, 16, 37, 58, 89, 145, 42, 20



/*read number
split into digits
sqr digits and add
check if this number is already encountered or check if equal to 1
go back to step 2*/
public class HappyNumber {
    static Set<Integer> numSeen = new HashSet<>();

    static boolean happyNumber(int n) {
        while (!numSeen.contains(n)){
            numSeen.add(n);
            List<Integer> digits = getDigits(n);
            n =  getSumOfSquares(digits);
           if(n == 1) {
               return true;
           }
           }
        return false;
    }

    private static int getSumOfSquares(List<Integer> digits) {
        int num =0;

        for(int i = 0; i< digits.size(); i++){
            num += digits.get(i) * digits.get(i);
        }
        return num;
    }

    private static List<Integer> getDigits(int n) {
        List<Integer> digits = new ArrayList<Integer>();
        while (n > 0){
            digits.add(n % 10);
            n /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        int inputNum = 19;
        if(happyNumber(inputNum)){
            System.out.println("Given Number is a Happy Number");
        }
        else {
            System.out.println("Given Number is not a happy number");
        }
    }
}
