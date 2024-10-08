package March13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Merge two arrays
* */
public class ArrayQuestion {
    public static void main(String[] args) {
        List<Integer> inputArray1 = Arrays.asList(1,2,3,4);
        List<Integer> inputArray2 = Arrays.asList(5,6,7,8,9,10);
        List<Integer> result = new ArrayList<>();
        int m = inputArray1.size();
        int n = inputArray2.size();
        int loopIndex = m>n ? m:n ;
        for(int i =0; i<loopIndex;i++){
            if(i<m){
                result.add(inputArray1.get(i));
            }
            if(i<n){
                result.add(inputArray2.get(i));
            }
        }
        System.out.println(result);
    }
}
