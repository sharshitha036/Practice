package Feb23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * example of Array
 * Add 10 numbers
 * Remove 2 numbers
 * Print all 8 numbers
 * Calculate sum of all 8 numbers
 */
public class ExOfArray {

    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<>(10);

        //Adding elements to the array
        a.add(1);
        for(int i= 2; i<=10; i++){
            a.add(i);
        }
        System.out.println("Array size is 10 now : " + a);

        //Removing all the elements of the Array
        a.remove(0);
        a.remove(0);
        System.out.println("Array size is 8 now : " + a);

        // Adding all the elements of the Array
        int sum = 0;
        for(int i= 0; i<a.size(); i++)
        {
            sum += a.get(i);

        }
        System.out.println("Adding all the elements of the Array : " + sum);

        //using for each
        int sum1 = 0;
        for(Integer i : a){
            sum1 += i;
        }
        System.out.println("Adding all the elements of the Array : " + sum1);

        //Using Streams
        int result1 = a.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("result is" + result1);
        }

}
