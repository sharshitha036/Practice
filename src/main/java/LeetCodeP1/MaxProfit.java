package LeetCodeP1;

import java.util.*;

public class MaxProfit {

    static int maxProfit(List<Integer> prices){
        Set<Integer> diffNum = new HashSet<>();
        int diff;
        for(int i = prices.get(0); i < prices.size();i++){
            for(int j = prices.get(1);j < prices.size();j++){
                if(i<j){
                    diff = j-i;
                    if(diff<1)
                    diffNum.add(diff);
                }
            }
            }
        return 1;
        }

    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(7,1,5,3,6,4);
        maxProfit(prices);
    }
}
