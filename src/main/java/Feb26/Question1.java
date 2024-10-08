package Feb26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Print numbers from a list in reverse order.
 */
public class Question1 {
    public static void main(String[] args) {
        List<Integer> inputNumbers = new ArrayList<>();
        inputNumbers.add(10);
        inputNumbers.add(20);
        inputNumbers.add(30);
        inputNumbers.add(40);
        inputNumbers.add(50);
        inputNumbers.add(60);
        System.out.println(inputNumbers);

        Integer[] inputArray = inputNumbers.toArray(new Integer[0]);

        for (int i=0; i<= (inputArray.length-1)/2;i++){
            int temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length-1-i];
            inputArray[inputArray.length-1-i] = temp;
        }
        System.out.println("Reversed List" + Arrays.toString(inputArray));

    }
}
