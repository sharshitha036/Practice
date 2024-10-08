package Feb26;

import java.util.ArrayList;
import java.util.List;

/**
 * print even numbers from a list
 */
public class Question2 {
    public static void main(String[] args) {
        List<Integer> inputNumbers = new ArrayList<>();
        inputNumbers.add(10);
        inputNumbers.add(25);
        inputNumbers.add(30);
        inputNumbers.add(45);
        inputNumbers.add(50);
        inputNumbers.add(65);
        System.out.println(inputNumbers);


        for(int i=0;i<inputNumbers.size();i++){
            if(inputNumbers.get(i) %2 == 0){
                System.out.println(inputNumbers.get(i));
            }
        }
    }
}
