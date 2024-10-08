package Feb27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Sort numbers in a List
 */

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> inputlist = new ArrayList<>();
        inputlist.add(2);
        inputlist.add(5);
        inputlist.add(1);
        inputlist.add(3);
        System.out.println("Given List : "+ inputlist);
        Integer[] inpuArray = inputlist.toArray(new Integer[0]);
        System.out.println("List is coverted to array : "+ Arrays.asList(inpuArray));

        for(int i=0; i<inpuArray.length; i++) {
            for (int j = 1; j < (inpuArray.length) - i; j++) {
                if (inpuArray[j - 1] > inpuArray[j]) {
                    int temp = inpuArray[j];
                    inpuArray[j] = inpuArray[j - 1];
                    inpuArray[j - 1] = temp;
                }
            }
        }
            System.out.print("Sorted List : " );
            for (int k =0; k<inpuArray.length ;k++){
                System.out.print(inpuArray[k] + " ");
        }
    }
}
