package March10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayQuestion2 {
    public static void main(String[] args) {

        int sum = 10;

        List<Integer> inputArray = new ArrayList<>();
        inputArray.add(1);
        inputArray.add(2);
        inputArray.add(3);
        inputArray.add(4);
        inputArray.add(5);
        inputArray.add(6);
        inputArray.add(7);
        inputArray.add(8);
        inputArray.add(9);
        inputArray.add(10);
        inputArray.add(11);
        inputArray.add(12);
        System.out.println(inputArray);

        List<List<Integer>> newArray = new ArrayList<>();

        for (int i = 0; i<inputArray.size(); i++){
            for (int j = i+1; j<inputArray.size(); j++)
            {
                Integer y = inputArray.get(i)+ inputArray.get(j);
                if( y.equals(sum)){
                    newArray.add(new ArrayList<>());
                    newArray.get(i).add(inputArray.get(i));
                    newArray.get(i).add(inputArray.get(j));
                }
            }
        }
        System.out.println(newArray);
    }
}
