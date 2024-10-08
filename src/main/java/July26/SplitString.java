package July26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitString {
        public static void main(String[] args) {
            List<String> employees = Arrays.asList("abhi", "b", "challa", "d");
            String  searchString = "ab,lla";
            String[] searchStrings = searchString.split(",");
            List<String> listOfSearchStrings = Arrays.asList(searchStrings);
            List<String> res = new ArrayList<>();
            for(String s : employees){
                boolean add = true;
                for(String s1 : searchStrings){
                    if(s.contains(s1)){
                        add = false;
                    }
                }
                if(add)
                {
                    res.add(s);
                }
            }
            System.out.println(res);

            List<String> ans = employees.stream()
                    .filter(employee->listOfSearchStrings.stream()
                            .anyMatch(employee::contains))
                    .collect(Collectors.toList());
            System.out.println(ans);

       }

}
