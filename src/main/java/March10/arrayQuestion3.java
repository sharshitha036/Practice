package March10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class arrayQuestion3 {
    public static void main(String[] args) {
        List<Integer> inputArray = Arrays.asList(1,1,1,2,2,3,4,5,7,7,7);
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for (int i=0; i<inputArray.size();i++) {
            if (!seen.contains(inputArray.get(i))){
                seen.add(inputArray.get(i));
                unique.add(inputArray.get(i));
            }
             else{
                duplicate.add(inputArray.get(i));
                unique.remove(inputArray.get(i));
            }
        }
        System.out.println("unique" + unique);
        System.out.println("duplicate" + duplicate);

    }
}
