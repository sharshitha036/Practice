package LeetCodeP1;

import java.util.*;

public class minNoOfBottles {

    public static void main(String[] args) {
        List<Integer> volumeOfWater = Arrays.asList(10,5,10);
        List<Integer> containerSize = Arrays.asList(3,3,13,5,5);
        System.out.println(minNoOfBottles(volumeOfWater,containerSize));
    }

    public static int minNoOfBottles(List<Integer> volume, List<Integer> size){

        int sumOfTheVolume = 0;
        for(int i = 0; i <volume.size();i++){
           sumOfTheVolume += volume.get(i);
        }
        Collections.sort(size,Collections.reverseOrder());
        int noOfBottles = 0;
        for(int i = 0; i< size.size(); i++){
            if(sumOfTheVolume> 0) {
                sumOfTheVolume -= size.get(i);
                noOfBottles +=1;
            }
            else
                return noOfBottles;
        }
        return noOfBottles;
    }
}
