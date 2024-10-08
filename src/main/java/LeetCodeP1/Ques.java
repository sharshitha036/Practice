package LeetCodeP1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("abhi challa", "harshitha sikakollu", "harry chakra");
        String searchString = "ab,ch";
        String[] searchStrings = searchString.split(",");
        List<String> ans = new ArrayList<>();

        employees.stream().collect(Collectors.toList());

        for(String e : employees){
            boolean boo = true;
            for(String s : searchStrings){
                if(e.contains(s)){
                    boo = false;
                }
            }
            if(!boo){
                ans.add(e);
            }
        }
        System.out.println(ans);

    }
}
