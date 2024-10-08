package LeetCodeP1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,7,11,15);
        int target = 26;
        System.out.println(TwoSum.twoSum(nums,target));
    }
    public static List<Integer> twoSum(List<Integer> inputnum, int tar){
        int a, b ;
        int sum = 0;
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i<inputnum.size();i++){
            for(int j = i+1; j<inputnum.size();j++){
                a = inputnum.get(i);
                b = inputnum.get(j);
                sum = a+b ;
                if(sum == tar){
                    res.add(i);
                    res.add(j);
                }
            }
        }
        return res;
    }
}
