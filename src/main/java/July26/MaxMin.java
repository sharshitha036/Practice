package July26;
/**
 *  1. Find maximum and minimum number from a list?
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> inputList= new ArrayList<>();
        Collections.addAll(inputList, 19,26,56,23,45,53,32,86,97,-86,-1,-25);
        System.out.println(inputList);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : inputList)
        {
            if(i >max){
                max = i;
            }
            if(i< min){
                min = i;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

}
