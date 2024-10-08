package MapsFolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExOfBubbleSort {

    public static void main(String[] args) {
        List<Long> inputlist = new ArrayList<>();
        inputlist.add(24L);
        inputlist.add(564L);
        inputlist.add(111L);
        inputlist.add(36L);

        System.out.println("Given List : "+ inputlist);
        Long[] inpuArray = inputlist.toArray(new Long[0]);
        System.out.println("List is coverted to array : "+ Arrays.asList(inpuArray));
        System.out.println(inpuArray.length);
        for(int i=0; i<inpuArray.length; i++) {
            for (int j = 1; j < (inpuArray.length) - i; j++) {
                if (inpuArray[j - 1] > inpuArray[j]) {
                    Long temp = inpuArray[j];
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
