package Feb25;

import java.util.*;

/**
 * Find the minimum difference between two numbers
 */

public class Question1 {

    public static void main(String[] args) {
        List<Integer> inputArrayList = new ArrayList<>();
        inputArrayList.add(-1);
        inputArrayList.add(-2);
        inputArrayList.add(-3);
        inputArrayList.add(7);
        inputArrayList.add(10);
        inputArrayList.add(20);
        inputArrayList.add(1);
        inputArrayList.add(2);

        System.out.println("Input arrayList " + inputArrayList);
        Collections.sort(inputArrayList);
        System.out.println("Sorted ArrayList "+ inputArrayList);


        int diff=0;


        Map<Integer, List<List<Integer>>> output = new HashMap<>();

        for(int i=0; i< inputArrayList.size()-1; i++){
             diff = Math.abs(inputArrayList.get(i + 1) - inputArrayList.get(i));

             List<Integer> currentNumbers = new ArrayList<>();
             currentNumbers.add(inputArrayList.get(i));
             currentNumbers.add(inputArrayList.get(i+1));



            if(null==output.get(diff)){

                output.put(diff,new ArrayList<>());
                output.get(diff).add(currentNumbers);

            }
            else {
                output.get(diff).add(currentNumbers);
            }
        }
        System.out.println("Difference Map " + output);




    /*    Map<Integer, Integer> bCounts = new HashMap<>();

        for (Integer c : diffArray){

            if(bCounts.containsKey(c)){
                int x = bCounts.get(c);
                x++;
                bCounts.put(c,x);
            }
            else{
                bCounts.put(c,1);
            }
        }
        System.out.println(bCounts);
*/

    }
}
