package Feb23;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Create hash map of interger and string
 * Add 10 values
 * Remove 4
 * Insert 3 more
 * Print all values
 * Calculate sum of all keys
 * Print all values
 * Print key value pairs
 */
public class ExofHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String > h = new HashMap<>();

        //Adding 10 values to the Map
        h.put(1,"Alpha");
        h.put(2,"Beta");
        h.put(3,"Charlie");
        h.put(4,"Delta");
        h.put(5,"echo");
        h.put(6,"Fox");
        h.put(7,"Golf");
        h.put(8,"Hotel");
        h.put(9,"India");
        h.put(10,"Juliet");

        System.out.println("Elements of HashMap : " + h);
        System.out.println(h.values());

        // Remove 4 values from the map
        for (int i=1; i<=4 ;i++){
        h.remove(i);
        }
        System.out.println("After Removing 4 values : " + h);
        System.out.println(h.values());

        // Add 3 Values
        for(int i=1; i<4;i++){
            h.put(i,"Abc");
        }
        System.out.println("After adding 3 values :" + h);

        System.out.println(h.keySet());

        //Using For each loop
        int sum1= 0;
        for(Integer i : h.keySet())
        {
            sum1 += i;
        }
        System.out.println("sum is"+sum1);

        // Using Streams
        int result = h.keySet().stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("result is"+result);

        //Sum of all keys
        List<Integer> integers1 = new ArrayList<>(h.keySet());
        int  sum = 0;
        for(int i=0; i< 9 ;i++) {
            sum += integers1.get(i);
            }
        System.out.println(sum);

        System.out.println(h.values());
        System.out.println(h);

        for(Map.Entry<Integer, String > entry : h.entrySet()){
            System.out.print(" Keys "+ entry.getKey());
            System.out.print(" Values "+ entry.getValue());
        }

        h.entrySet().parallelStream().forEach(x->
        {
            System.out.println(x.getValue());
            System.out.println(x.getKey());
        });




    }


    }

