package Feb26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Print numbers from a list in reverse order. without changing the list order.
 */
public class Question3 {
    public static void main(String[] args) {
        List<Integer> inputNumbers = new ArrayList<>();
        inputNumbers.add(10);
        inputNumbers.add(20);
        inputNumbers.add(30);
        inputNumbers.add(40);
        inputNumbers.add(50);
        inputNumbers.add(60);
        System.out.println("Given List : " + inputNumbers);

        int n = inputNumbers.size()-1;
        int z = 0;
        System.out.print("Reversed List : " );
        for (int i=n; i>=0 ;i--)
        {
            System.out.print(inputNumbers.get(i)+ " ");
        }
    }
}
